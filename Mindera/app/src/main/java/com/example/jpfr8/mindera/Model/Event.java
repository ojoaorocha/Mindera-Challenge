package com.example.jpfr8.mindera.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Event implements Serializable {

    private String name;
    private List<String> list;

    public Event(String name){
        this.name = name;
        this.list = new ArrayList<>();
        this.list.add("Description 1");
        this.list.add("Description 2");
        this.list.add("Description 3");
        this.list.add("Description 4");
        this.list.add("Description 5");
        this.list.add("Description 6");
        this.list.add("Description 7");
    }

    public String getName(){
        return this.name;
    }

    public List<String> getList(){
        return this.list;
    }

    public String toString(){
        return this.getName();
    }
}
