package com.example.inheritance.CarExample;

public class Mercedes extends Car{
    private String klass;

    public Mercedes(){

    }

    public Mercedes(String klass){
        this.klass = klass;
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String klass){
        super(name,model,maxSpeed,year,volume);
        this.klass = klass;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getReady(){
        return "Car " + name + " " + model + " " + klass + " max speed " + maxSpeed + " and " + year + " with engine volume " + volume + " is ready to race";
    }
}
