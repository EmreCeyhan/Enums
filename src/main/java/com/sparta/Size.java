package com.sparta;

public enum Size {
    SMALL("Small Pizza", 100),
    MEDIUM("Medium Pizza", 180),
    LARGE("Large Pizza", 230),
    EXTRALARGE("Extra Large Pizza", 400);

    private final String pizzaSize;
    private final int pizzaCalories;


    private Size(String pizzaSize, int pizzaCalories)
    {
        this.pizzaSize = pizzaSize;
        this.pizzaCalories = pizzaCalories;
    }
    public String getPizzaSize() {
        return pizzaSize;
    }
    public int getPizzaCalories() {
        return pizzaCalories;
    }
    public int getEnergyInJoules(){
        return (int) (pizzaCalories * 4.184);
    }

}
