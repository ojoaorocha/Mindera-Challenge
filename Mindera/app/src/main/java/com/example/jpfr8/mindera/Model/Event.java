package com.example.jpfr8.mindera.Model;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private String name;
    private List<String> list;

    public Event(String name){
        this.name = name;
        this.list = new ArrayList<>();
        this.list.add("Description 1");
        this.list.add("Description 2");
        this.list.add("Description 3");
        this.list.add("Description 4");
    }

    public List<String> getDescription(){
        return this.list;
    }
}
