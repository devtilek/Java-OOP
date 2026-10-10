package com.example.inheritance.CarExample;

public class Toyota extends Car{
    private String country;

    public Toyota(){}

    public Toyota(String country){
        this.country = country;
    }

    public Toyota(String name, String model,int maxSpeed, int year, double volume, String country){
        super(name,model,maxSpeed,year,volume);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReady(){
        return "Car " + name + " " + model + " max speed " + maxSpeed + " and " + year + " with engine volume " + volume + " from " + country + " is ready to race";
    }
}
