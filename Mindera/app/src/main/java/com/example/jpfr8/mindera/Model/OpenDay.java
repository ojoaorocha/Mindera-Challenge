package com.example.jpfr8.mindera.Model;

import java.util.ArrayList;
import java.util.List;

public class OpenDay {

    private List<Event>  eventList;
    private String name;

    public OpenDay(String name){
        this.name = name;
        this.eventList = new ArrayList<>();
        this.eventList.add(new Event("List 1"));
        this.eventList.add(new Event("List 2"));
        this.eventList.add(new Event("List 3"));
        this.eventList.add(new Event("List 4"));
        this.eventList.add(new Event("List 5"));
    }

    public String getName(){
        return this.name;
    }

    public List<Event> getEventList(){
        return this.eventList;
    }
}
