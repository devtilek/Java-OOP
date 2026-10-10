package com.example.inheritance;

import com.example.inheritance.CarExample.Car;
import com.example.inheritance.CarExample.Mercedes;
import com.example.inheritance.CarExample.Toyota;
import com.example.inheritance.UserExample.Staff;
import com.example.inheritance.UserExample.User;

public class Main {
    static void main() {
        Car car = new Car("Hyndai", "Accent", 150, 2005, 1.6);
        System.out.println(car.getReady());

        Car toyota = new Toyota("Toyota", "Camry", 180, 2020,2.5, "Japan");
        System.out.println(toyota.getReady());

        Car mercedes = new Mercedes("Mercedes", "Benz" , 200, 2014, 2024,"S-class");
        System.out.println(mercedes.getReady());

        System.out.println("----------------------------------------------------------");


        User user = new User(1, "Maga", "Magamed123", "Magzhas");
        user.getInfo();

        Staff s1 = new Staff(1, "Maga", "Magzhas", "Magamed", 150000);
        s1.addSubject("Math");
        s1.addSubject("Phis");
        s1.addSubject("Calc");

        s1.getInfo();

    }
}
