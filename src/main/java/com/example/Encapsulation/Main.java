package com.example.Encapsulation;

import com.example.Encapsulation.PhoneExample.Phone;
import com.example.Encapsulation.Student.Dorm;
import com.example.Encapsulation.Student.Student;

public class Main {
    static void main() {
        Phone[] phones = {
                new Phone("Iphone", "16", 650000),
                new Phone("Iphone", "18", 850000),
                new Phone("Iphone", "13", 350000)
        };

        Phone.getAllPhonesCategories(phones);

        System.out.println("------------------------");

        Student s1 = new Student(1, "Magzhas", "Magzhasov", 3.2);
        Student s2 = new Student(2, "Maga", "Magamedov", 3.3);
        Student s3 = new Student(3, "Make", "Makenov", 3.4);

        Dorm d1 = new Dorm();

        d1.addStudent(s1);
        d1.addStudent(s2);
        d1.addStudent(s3);

        System.out.println("--------------------------------");

        System.out.println("List Students");
        d1.printStudents();

        System.out.println("---------------------------------");

        d1.removeStudentFromDorm(3);
        d1.printStudents();

        System.out.println("---------------------------------");

        System.out.println(d1.getMaxGpa());
    }
}
