package com.example.abstractClasses;

import com.example.abstractClasses.FoodExample.Burger;
import com.example.abstractClasses.FoodExample.Cola;
import com.example.abstractClasses.FoodExample.Food;
import com.example.abstractClasses.UserExample.Student;
import com.example.abstractClasses.UserExample.Teacher;


public class Main {
    static void main() {
        Food c1 = new Cola("Bahandi Burger", 2, 1);
        System.out.println(c1.getCalories());

        Food b1 = new Burger("Bayurdak Combo 7", 2, 2, 1);
        System.out.println(b1.getCalories());


        System.out.println("-------------------------------------------");

        Teacher t1 = new Teacher(1, "teacher", "teacherPas", "Maga", "Teacher");

        t1.addSubject("Math");
        t1.addSubject("Phis");
        t1.addSubject("Calc");

        t1.getSubjects();
        System.out.println("------------------------------");
        System.out.println(t1.getUserInfo());
        Student s1 = new Student("Maga", "Magamedov","SE-2428", 3.69);

        System.out.println("------------------------------");
        System.out.println(s1.getUserInfo());
    }
}
