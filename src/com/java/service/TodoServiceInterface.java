package com.java.service;

import javax.jws.WebMethod;
import java.util.Date;

public interface TodoServiceInterface {

    @WebMethod
    String register(String name, String password);
    @WebMethod
    String login(String name, String password);

    @WebMethod
    String addTodo(String name, String password, String label, Date start, Date end);
    @WebMethod
    String checkTodo(String name, String password, Date start, Date end);
    @WebMethod
    String deleteTodo(String name, String password, int index);
    @WebMethod
    String clearTodo(String name, String password);
}
