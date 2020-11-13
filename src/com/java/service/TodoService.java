package com.java.service;

import com.java.bean.Todo;
import com.java.bean.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.*;

@WebService(name = "TodoService", portName = "TodoServicePort", targetNamespace = "http://www.todoservice.nwpu.com")
public class TodoService implements TodoServiceInterface {

    private final List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8001/webservice/todo", new TodoService());
        System.out.println("Service started");
    }

    /**
     * utils function
     *
     * @param name user's name
     * @return specific user
     */
    public User findUser(String name) {
        for (User u : userList) {
            if (u.getName().equals(name)) {
                return u;
            }
        }
        return null;
    }

    @Override
    @WebMethod
    public String register(String name, String password) {
        if (findUser(name) == null) {
            userList.add(new User(name, password, new ArrayList<>()));
            return "Sign up successfully";
        }
        return "User all ready exist";
    }

    @Override
    @WebMethod
    public String login(String name, String password) {
        User user = findUser(name);
        if (user == null) {
            return "User not found";
        }
        if (user.getPassword().equals(password)) {
            return "Sign in successfully";
        }
        return "Wrong password";
    }

    @Override
    @WebMethod
    public String addTodo(String name, String password, String label, Date start, Date end) {
        User user = findUser(name);
        if (user == null) {
            return "User not found";
        }
        if (!user.getPassword().equals(password)) {
            return "Wrong password";
        }

        Todo todo = new Todo(label, start, end);
        user.getTodoList().add(todo);

        return "Added successfully, Todo:" + todo.getIndex();
    }

    @Override
    @WebMethod
    public String checkTodo(String name, String password, Date start, Date end) {
        User user = findUser(name);
        if (user == null) {
            return "User not found";
        }
        if (!user.getPassword().equals(password)) {
            return "Wrong password";
        }

        List<Todo> todoList = new ArrayList<>();
        for (Todo todo : user.getTodoList()) {
            //added into temp list
            if (todo.getStart().compareTo(start) > -1 && todo.getEnd().compareTo(end) < 0) {
                todoList.add(todo);
            }
        }

        //sort
        todoList.sort(Comparator.comparing(Todo::getStart));

        StringBuilder stringBuilder = new StringBuilder();
        for (Todo todo : todoList) {
            stringBuilder.append(todo.toString());
        }

        return stringBuilder.toString();
    }

    @Override
    @WebMethod
    public String deleteTodo(String name, String password, int index) {
        User user = findUser(name);
        if (user == null) {
            return "User not found";
        }
        if (!user.getPassword().equals(password)) {
            return "Wrong password";
        }

        List<Todo> todoList = user.getTodoList();
        for (Todo todo : todoList) {
            if (todo.getIndex() == index) {
                todoList.remove(todo);
                return "Remove successfully";
            }
        }

        return "Todo " + index + " not found";
    }

    @Override
    @WebMethod
    public String clearTodo(String name, String password) {
        User user = findUser(name);
        if (user == null) {
            return "User not found";
        }
        if (!user.getPassword().equals(password)) {
            return "Wrong password";
        }

        user.getTodoList().clear();
        return "All Todo clear";
    }
}
