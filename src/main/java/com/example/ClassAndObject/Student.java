package com.example.ClassAndObject;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private double gpa;

    public Student(){

    }

    public Student(Long id, String name, String surname,double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentInfo(){
        return "ID: " + id + " Name: " + name + " Surname: " + surname + " GPA: " + gpa;
    }
}
