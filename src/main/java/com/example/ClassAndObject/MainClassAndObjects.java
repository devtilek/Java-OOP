package com.example.ClassAndObject;

public class MainClassAndObjects {
    static void main() {
        Phone p1 = new Phone("Iphone", "16", 500000);
        Phone p2 = new Phone("Iphone", "17", 600000);
        Phone p3 = new Phone("Iphone", "18", 700000);
        Phone p4 = new Phone("Iphone", "19", 800000);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());
        System.out.println(p4.getInfo());

        System.out.println("-----------------------------------------");


        Student s1 = new Student(1L, "Magzhas", "Tolkynova", 3.0);
        Student s2 = new Student(2L, "Nora", "Noravoa", 3.9);

        System.out.println(s1.getStudentInfo());
        System.out.println(s2.getStudentInfo());
    }
}
