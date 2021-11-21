package com.company;

public class Student {
    private String name;
    private int id;
    public int phoneNumber;
    public String address;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public Student() {
        this.name = "Mahmoud";
        this.id = 202006378;
    }
    public String getName(){return name;}

    public void setName(String name) { this.name = name; }

    public int getId() { return id; }

    public void setId(int age) { this.id = age; }

}
