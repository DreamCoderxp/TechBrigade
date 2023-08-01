package com.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopDatabase {
    ArrayList<Laptop> laptops = new ArrayList<Laptop>();
    


    protected void getSpecLaptops(int ram,String cpu, double screenSize) {

        try {
            File fname= new File("laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");
            
                //if(laptopData[3]==) {

                //}


            }
            input.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
