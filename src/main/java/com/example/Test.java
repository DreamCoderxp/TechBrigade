package com.example;

import java.io.FileNotFoundException;

public class Test { //This is just a test class to read the objects from the CSV file to see if the information stored is in correct format

    public static void main(String[] args) throws FileNotFoundException {
        try {
            HighEndLaptopDatabase laptopDatabase = new HighEndLaptopDatabase("src/main/resources/laptops.csv");

//            List<HighEndLaptop> laptops = laptopDatabase.getLaptops();
//            System.out.println(laptops.get(0).getCpuManufacturer());
//            System.out.println(laptops.get(1).getCpuManufacturer());

            for (HighEndLaptop highEndLaptop : laptopDatabase.getLaptops()) {
                System.out.println(highEndLaptop.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
