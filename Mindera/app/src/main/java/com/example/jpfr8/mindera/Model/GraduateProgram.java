package com.example.jpfr8.mindera.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GraduateProgram implements Serializable {

    private List<String> graduateProgramList;
    private String name;

    public GraduateProgram(String name){
        this.name = name;
        this.graduateProgramList = new ArrayList<>();
        this.graduateProgramList.add("Program 1");
        this.graduateProgramList.add("Program 2");
        this.graduateProgramList.add("Program 3");
        this.graduateProgramList.add("Program 4");
        this.graduateProgramList.add("Program 5");
    }

    public String getName(){
        return this.name;
    }

    public List<String> getGraduateProgramList(){
        return this.graduateProgramList;
    }
}
