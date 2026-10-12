package com.example.abstractClasses.FoodExample;

public class Cola extends Food{
    private int colaType;

    public Cola(){}

    public Cola(int colaType) {
        this.colaType = colaType;
    }

    public Cola(String name, int weight, int colaType) {
        super(name, weight);
        this.colaType = colaType;
    }

    public int getColaType() {
        return colaType;
    }

    public void setColaType(int colaType) {
        this.colaType = colaType;
    }

    @Override
    public double getCalories() {
        if (colaType == 1){
            return getWeight() * 3;
        } else if (colaType == 2) {
            return getWeight() * 1.1;
        }
        return 0;
    }
}
