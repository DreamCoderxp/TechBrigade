package com.example;

import java.io.*;
import java.util.*;

public class LaptopDatabase {
    private List<Laptop> laptops;

    public LaptopDatabase(String filename) throws FileNotFoundException {
        laptops = new ArrayList<>();
        loadFromCSV(filename);
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
                String[] attributes = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                // Remove quotation marks if present
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
        String cpu = metadata[1];
        int ram = Integer.parseInt(metadata[2]);
        int storage = Integer.parseInt(metadata[3]);
        String storageType = metadata[4];
        double weight = Double.parseDouble(metadata[5]);
        String screenSize = metadata[6];
        String ports = metadata[7];
        int geekbenchScore = Integer.parseInt(metadata[8]);
        double price = Double.parseDouble(metadata[9]);

        return new Laptop(name, cpu, ram, storage, storageType, weight, screenSize, ports, geekbenchScore, price);
    }

    // Add your filter methods here...

}

