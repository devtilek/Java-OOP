package com.example.ClassAndObject;

public class Phone {
    private String name;
    private String model;
    private int price;

    public Phone(){

    }
    public Phone(String name,String model,int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getInfo(){
        return "name: " + name + " model: " + model + " price: " + price;
    }
}
