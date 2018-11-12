package com.company;

public class Fruit {
    private FruitType type;
    private Color color;
    private double weight;
    private double priceKG;

    public Fruit() {

    }

    public Fruit(FruitType type) {
        this.type = type;
    }

    public Fruit(FruitType type, Color color, double weight, double priceKG) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.priceKG = priceKG;
    }

    public double price() {
        return weight * priceKG;
    }

    public FruitType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceKG(double priceKG) {
        this.priceKG = priceKG;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                '}';
    }
}

