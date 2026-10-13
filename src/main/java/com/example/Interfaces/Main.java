package com.example.Interfaces;

import com.example.Interfaces.ex1.Staff;
import com.example.Interfaces.ex1.Worker;
import com.example.Interfaces.ex2.User;
import com.example.Interfaces.ex2.UserBeanImpl;
import com.example.Interfaces.ex3.Account;
import com.example.Interfaces.ex3.BankApplication;

public class Main {
    static void main() {
        Staff s1 = new Staff(1, "MAGA", 250000);
        Staff s2 = new Staff(2, "Yerkebulaaaaan", 250000);
        Staff s3 = new Staff(3, "Nora", 250000);
        System.out.println(s1.getData());
        System.out.println(s2.getData());
        System.out.println(s3.getData());


        System.out.println("--------------------------------");
        User u1 = new User("Maga", "Magamedov");
        User u2 = new User("Nagi", "Nagenov");
        User u3 = new User("Kagi", "Kagenov");

        UserBeanImpl ub1 = new UserBeanImpl();
        ub1.addUser(u1);
        ub1.addUser(u2);
        ub1.addUser(u3);
        System.out.println("--------------");
        ub1.getAllUsers();
        System.out.println("--------------");
        ub1.getUsersByName();
        System.out.println("---------------");
        ub1.getUsersByUsername();

        System.out.println("------------------------------------");
        Account a1 = new Account(1,"Maga", "Magamed", 3500000);
        Account a2 = new Account(2,"Yerkebulan", "Arys", 6500000);
        Account a3 = new Account(3,"Nora", "Kachok", 9000000);
        BankApplication bank = new BankApplication();

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        System.out.println("----------------");
        bank.printAllAccounts();
        System.out.println("----------------");
        bank.getInfoAboutAccountById(1);
        System.out.println("----------------");
        bank.deleteAccountById(3);
        System.out.println("----------------");
        bank.printAllAccounts();


    }
}
