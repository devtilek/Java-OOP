package com.example.arrayList.ex1;

import java.util.ArrayList;

public class Student {
    private String name;
    private final ArrayList<String> courses = new ArrayList<>();

    public Student(){}

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAllCourses(){
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }

    public void addCourse(String course){
        int size1 = courses.size();
        courses.add(course);
        if (size1 < courses.size()){
            System.out.println("added");
        }
        else System.out.println("not added");
    }

    public void removeCourse(int index){
        if (index >= 0 && index < courses.size()){
            courses.remove(index);
            System.out.println("removed");
        }else System.out.println("not removed");
    }

    public String toString(){
        return "Name:" + name;
    }

}
