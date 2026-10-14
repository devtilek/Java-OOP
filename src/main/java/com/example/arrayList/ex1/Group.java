package com.example.arrayList.ex1;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Group(){}

    public Group(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void getAllStudents(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

    public Student getStudent(int index){
        if (index >= 0 && index < students.size()){
            return students.get(index);
        }
        return null;
    }
}
