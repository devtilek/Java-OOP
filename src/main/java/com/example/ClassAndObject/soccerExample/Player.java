package com.example.ClassAndObject.soccerExample;

public class Player {
    private int id;
    private String name;
    private String surname;
    private String position;

    public Player(){}

    public Player(int id, String name, String surname,String position){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString(){
        return "ID: " + id + " Name: " + name + " Surname: " + surname + " Position: " + position;
    }
}
