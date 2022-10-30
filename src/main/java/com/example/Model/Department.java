package com.example.Model;

import java.util.Date;

public class Department {
    private int id;
    private String name;
   private Date startdate;

    public Department( String name, Date startdate) {

        this.name = name;
        this.startdate = startdate;
    }
    public Department(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
}
