package com.company;

public class Main {

    public static void main(String[] args) {
        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 0.146, 10.49);
        System.out.println("Red apple: " + redApple);
        System.out.println("weight: " + redApple.getWeight());
        System.out.println("Red apple price: " + redApple.price());
        Fruit greenApple = new Fruit(FruitType.APPLE, Color.GREEN, 0.246, 11.99);
        System.out.println("Green apple: " + greenApple);
        System.out.println("weight: " + greenApple.getWeight());
        System.out.println("Green apple price: " + greenApple.price());
        Fruit lemon = new Fruit(FruitType.LEMON, Color.YELLOW, 0.124, 31.99);
        System.out.println("Lemon: " + lemon);
        System.out.println("weight: " + lemon.getWeight());
        System.out.println("Lemon: " + lemon.price());
        Fruit banana = null;
        System.out.println("Banana: " + banana);
        Fruit[] arr = new Fruit[3];
        arr[0] = redApple;
        arr[1] = greenApple;
        arr[2] = lemon;
        printPrice(arr);
    }
    private static void printPrice(Fruit[] arr) {
        double price = 0;
        for (int i = 0; i < arr.length; i++) {
            price += arr[i].price();
        }
        System.out.println("Sum price: " + price);
    }
}