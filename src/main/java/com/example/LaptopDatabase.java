package com.example;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopDatabase {
 
    protected ArrayList<Laptop> getSpecLaptops(int ram,String cpu, double screenSize) {
            String ramString = Integer.toString(ram);
            String screenSizeString = Double.toString(screenSize);

            
              ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
            }
                //we will convert screensizes to double before comparing
                if(laptopData[3].equals(ramString)&& laptopData[5].equals(cpu)&& laptopData[8].equals(screenSizeString)) {
                   

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for(int i=0;i<laptopData.length;i++) {
                        laptopSpecs.add(laptopData[i]);
                    }
                    Laptop laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);
                }
            }
            input.close();
            
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return laptops;
    }
}
