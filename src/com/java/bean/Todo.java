package com.java.bean;

import java.util.Date;

public class Todo {

    //Here's a simple auto increment (less than 2^32)
    private static int count = 0;
    private int index;
    private String label;
    private Date start;
    private Date end;

    public Todo() {
    }

    public Todo(String label, Date start, Date end) {
        this.index = count++;
        this.label = label;
        this.start = start;
        this.end = end;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Todo "+ index + " Time: "+start + " --- " + end + "\n" +
                "[" + label + "]\n";
    }
}
