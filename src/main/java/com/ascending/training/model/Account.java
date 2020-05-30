package com.ascending.training.model;


public class Account {
    public Account(){}
    private long id;
    private String accountType;
    private Decimal balance;
    private date createDate;
    private long employeeId;

    public void setId (long id){
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setLocation(String location){
        this.location=location;
    }

}