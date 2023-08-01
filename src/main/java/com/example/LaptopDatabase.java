package com.example;

import java.io.*;
import java.util.*;

public class LaptopDatabase {
    private List<Laptop> laptops;

    public LaptopDatabase(String filename) throws FileNotFoundException {
        laptops = new ArrayList<>();
        loadFromCSV(filename);
    }

    //This is the method that will be called from the controller
    public List<Laptop> getLaptops() {
        return laptops;
    }

    private void loadFromCSV(String filename) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(filename))) {
            scanner.useDelimiter(",|\r\n");

            // Skip header
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] attributes = line.split(",");

                // Removing the double quotes
                for (int i = 0; i < attributes.length; i++) {
                    attributes[i] = attributes[i].replaceAll("^\"|\"$", "");
                }

                Laptop laptop = createLaptop(attributes);
                laptops.add(laptop);
            }
        }
    }

    private Laptop createLaptop(String[] metadata) {
        String name = metadata[0];
        String cpuManufacturer = metadata[1];
        String cpu = metadata[2];
        String gpu = metadata[3];
        int ram = Integer.parseInt(metadata[4]);
        int storage = Integer.parseInt(metadata[5]);
        String storageType = metadata[6];
        double weight = Double.parseDouble(metadata[7]);
        String screenSize = metadata[7];
        String ports = metadata[9];
        int geekbenchScore = Integer.parseInt(metadata[10]);
        double price = Double.parseDouble(metadata[11]);
        String url = metadata[12];

        return new Laptop(name, cpuManufacturer, cpu, gpu ,ram, storage, storageType, weight, screenSize, ports, geekbenchScore, price, url);
    }

    // Filters methods here


}

