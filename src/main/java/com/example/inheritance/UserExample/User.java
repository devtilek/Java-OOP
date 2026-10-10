package com.example.inheritance.UserExample;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;

    public User(){}

    public User(int id, String login,String password,String name){
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.println("ID: " + id + " Login: " + login + " Password: " + password + " Name: " + name);
    }
}
