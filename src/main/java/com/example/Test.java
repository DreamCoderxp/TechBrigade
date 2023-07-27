package com.example;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            LaptopDatabase laptopDatabase = new LaptopDatabase("src/main/resources/laptops.csv");

            for (Laptop laptop : laptopDatabase.getLaptops()) {
                System.out.println(laptop.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
