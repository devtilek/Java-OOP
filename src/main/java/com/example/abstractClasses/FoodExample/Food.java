package com.example.abstractClasses.FoodExample;

public abstract class Food {
    protected String name;
    protected int weight;

    public Food(){}

    public Food(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract double getCalories();

    public void getData(){
        System.out.println("Food: " + getName() + " with " + getCalories() + " calories is done!");
    }

}
