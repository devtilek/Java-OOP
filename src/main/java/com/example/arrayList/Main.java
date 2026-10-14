package com.example.arrayList;

import com.example.arrayList.ex1.Group;
import com.example.arrayList.ex1.Student;

public class Main {
    static void main() {
        Student s1 = new Student("Michel");
        Student s2 = new Student("Maga");
        Student s3 = new Student("Magzhan");
        Group g1 = new Group();

        s1.addCourse("Calc");
        s1.addCourse("Math");
        s1.addCourse("Phis");

        s1.getAllCourses();
        System.out.println("-------------------");
        s1.removeCourse(2);
        System.out.println("----------------");
        s1.getAllCourses();

        System.out.println("--------------------");

        g1.addStudent(s1);
        g1.addStudent(s2);
        g1.addStudent(s3);
        System.out.println("---------------");
        g1.getAllStudents();
        System.out.println("--------------");
        g1.getStudent(2);




    }
}
