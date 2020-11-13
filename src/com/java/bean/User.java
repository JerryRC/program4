package com.java.bean;

import java.util.List;

public class User {

    private String name;
    private String password;
    private List<Todo> todoList;

    public User() {
    }

    public User(String name, String password, List<Todo> todoList) {
        this.name = name;
        this.password = password;
        this.todoList = todoList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }

}
