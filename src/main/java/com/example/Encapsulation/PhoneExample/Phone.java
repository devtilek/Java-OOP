package com.example.Encapsulation.PhoneExample;

public class Phone {
    private String name;
    private String model;
    private int price;

    public Phone(){

    }

    public Phone(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getCategory(){
        if (price > 700000){
            return "TOP";
        } else if (price > 500000 && price < 700000) {
            return "MID";
        } else  {
            return "LOW";
        }
    }

    public static void  getAllPhonesCategories(Phone[] phones){
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].name + " " + phones[i].model + " " + phones[i].price + " " + phones[i].getCategory());
        }
    }
}
