package com.example.abstractClasses.UserExample;

public class Teacher extends  User{
    private String name;
    private String status;
    private String[] subjects = new String[100];
    private int indexOfSubjects = 0;

    public Teacher(){}

    public Teacher(String name, String status, String[] subjects, int indexOfSubjects) {
        this.name = name;
        this.status = status;
        this.subjects = subjects;
        this.indexOfSubjects = indexOfSubjects;
    }

    public Teacher(int id, String login, String password, String name, String status) {
        super(id, login, password);
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubjects() {
        return indexOfSubjects;
    }

    public void setIndexOfSubjects(int indexOfSubjects) {
        this.indexOfSubjects = indexOfSubjects;
    }

    public boolean addSubject(String subject){
        if (subject != null){
            subjects[indexOfSubjects] = subject;
            indexOfSubjects++;
        }
        return false;
    }

    public String getSubjects(){
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null){
                System.out.println(subjects[i]);
            }
        }
        return "";
    }

    public String getUserInfo(){
        return "ID: " + id + " Login: " + login + " Password: " + password + " Name: "+ name + " Status: " + status;
    }
}
