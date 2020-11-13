package com.java;

import com.nwpu.todoservice.TodoService;
import com.nwpu.todoservice.TodoServiceService;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Client {
    private final TodoService todoService;
    private String name;
    private String password;

    /**
     * constructor
     * set username and passwd ""
     * get a new service from nwpu.todo service
     */
    private Client() {
        TodoServiceService todoServiceService = new TodoServiceService();
        todoService = todoServiceService.getTodoServicePort();
        name = "";
        password = "";
    }

    /**
     * run the client
     * @param args null
     */
    public static void main(String[] args) {
        try {
            new Client().run();
        } catch (Exception e){
            System.out.println("Unable to connect to the remote web service");
        }
    }

    /**
     * transform Date to XMLGregorianCalendar
     *
     * @param date Date format time
     * @return XML format time
     */
    private XMLGregorianCalendar dateToXmlDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        DatatypeFactory dtf = null;
        try {
            dtf = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            System.out.println("DataFactory newInstance error");
        }
        assert dtf != null;
        XMLGregorianCalendar dateType = dtf.newXMLGregorianCalendar();
        dateType.setYear(cal.get(Calendar.YEAR));
        //由于Calendar.MONTH取值范围为0~11,需要加1
        dateType.setMonth(cal.get(Calendar.MONTH) + 1);
        dateType.setDay(cal.get(Calendar.DAY_OF_MONTH));
        dateType.setHour(cal.get(Calendar.HOUR_OF_DAY));
        dateType.setMinute(cal.get(Calendar.MINUTE));
        dateType.setSecond(cal.get(Calendar.SECOND));
        return dateType;
    }

    private Date stringToDate(String s) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        return formatter.parse(s);
    }

    /**
     * show all help every cycle
     */
    private void menu() {
        System.out.println("Here are the actions you can choose:");
        System.out.println("1. Register");
        System.out.println("params: <username> <password>");
        System.out.println("2. Login");
        System.out.println("params: <username> <password>");
        System.out.println("3. Add Todo");
        System.out.println("params: <label> <start> <end>");
        System.out.println("4. Check Todo");
        System.out.println("params: <start> <end>");
        System.out.println("5. Delete Todo");
        System.out.println("params: <Todo index>");
        System.out.println("6. Clear Todo");
        System.out.println("params: null");
        System.out.println("7. Quit");
        System.out.println("params: null");

        System.out.println("\nInput an operation: [index]");
    }

    private String register(String name, String password) {
        return todoService.register(name, password);
    }

    private String login(String name, String password) {
        this.name = name;
        this.password = password;
        return todoService.login(name, password);
    }

    private String addTodo(String label, Date start, Date end) {
        return todoService.addTodo(name, password, label, dateToXmlDate(start), dateToXmlDate(end));
    }

    private String checkTodo(Date start, Date end) {
        return todoService.checkTodo(name, password, dateToXmlDate(start), dateToXmlDate(end));
    }

    private String deleteTodo(int index) {
        return todoService.deleteTodo(name, password, index);
    }

    private String clearTodo() {
        return todoService.clearTodo(name, password);
    }

    /**
     * run the business
     * command 3 - 6 is login needed
     */
    public void run() {
        boolean login = false;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            boolean quit = false;
            Date startTime;
            Date endTime;
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Please input the name:");
                    name = scanner.nextLine();
                    System.out.println("Please input the password:");
                    password = scanner.nextLine();
                    System.out.println(register(name, password));
                    break;
                case "2":
                    System.out.println("Please input the name:");
                    name = scanner.nextLine();
                    System.out.println("Please input the password:");
                    password = scanner.nextLine();
                    String res = login(name, password);
                    System.out.println(res);
                    if (res.startsWith("S")) {
                        login = true;
                    }
                    break;
                case "3":
                    if (!login) {
                        System.out.println("Please login first");
                        break;
                    }
                    try {
                        System.out.println("Please input the StartTime: (Format yyyy-MM-dd_HH:mm:ss)");
                        startTime = stringToDate(scanner.nextLine());
                        System.out.println("Please input the EndTime:");
                        endTime = stringToDate(scanner.nextLine());
                        System.out.println("Please input the label:");
                        String label = scanner.nextLine();
                        System.out.println(addTodo(label, startTime, endTime));
                    } catch (ParseException e) {
                        System.out.println("Date format error");
                    }
                    break;
                case "4":
                    if (!login) {
                        System.out.println("Please login first");
                        break;
                    }
                    try {
                        System.out.println("Please input the StartTime: (Format yyyy-MM-dd_HH:mm:ss)");
                        startTime = stringToDate(scanner.nextLine());
                        System.out.println("Please input the EndTime:");
                        endTime = stringToDate(scanner.nextLine());
                        System.out.println(checkTodo(startTime, endTime));
                    } catch (ParseException e) {
                        System.out.println("Date format error");
                    }
                    break;
                case "5":
                    if (!login) {
                        System.out.println("Please login first");
                        break;
                    }
                    System.out.println("Please input the index of Todo that you want to delete");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println(deleteTodo(id));
                    } catch (NumberFormatException e) {
                        System.out.println("Index format error");
                    }
                    break;
                case "6":
                    if (!login) {
                        System.out.println("Please login first");
                        break;
                    }
                    System.out.println(clearTodo());
                    break;
                case "7":
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown command");
            }

            System.out.println();

            if (quit) {
                break;
            }
        }
    }
}
