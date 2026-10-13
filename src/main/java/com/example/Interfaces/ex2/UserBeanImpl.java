package com.example.Interfaces.ex2;

public class UserBeanImpl implements UserBean{
    private User[] users = new User[100];
    private int indexOfUser = 0;


    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                System.out.println(users[i]);
            }
        }
    }

    @Override
    public void getUsersByName() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                System.out.println("Name: " + users[i].getName());
            }
        }
    }

    @Override
    public void getUsersByUsername() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                System.out.println("Surname: " + users[i].getSurname());
            }
        }
    }

    @Override
    public void addUser(User user) {
        if (user != null){
            users[indexOfUser] = user;
            indexOfUser++;
        }
    }
}
