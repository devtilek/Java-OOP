package com.example.abstractClasses.FoodExample;

public class Burger extends Food{
    private int meatAmount;
    private int meatType;

    public Burger(){}

    public Burger(int meatAmount, int meatType) {
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public Burger(String name, int weight, int meatAmount, int meatType) {
        super(name, weight);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public int getMeatAmount() {
        return meatAmount;
    }

    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }
    
    @Override
    public double getCalories() {
        if (meatType == 1){
            return getWeight() * getMeatAmount() * 1.5;
        } else if (meatType == 2) {
            return getWeight() * getMeatAmount() * 1.2;
        }
        return 0;
    }

}
