package com.example.abstractClasses.UserExample;

public class Student extends User{
    private String name;
    private String username;
    private String group;
    private double gpa;

    public Student(){}

    public Student(String name, String username, String group, double gpa) {
        this.name = name;
        this.username = username;
        this.group = group;
        this.gpa = gpa;
    }

    public Student(int id, String login, String password, String name, String username, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.username = username;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getUserInfo(){
        return "Name: " + name + " Username: " + username + " Group: " + group + " Gpa: " + gpa;
    }
}
