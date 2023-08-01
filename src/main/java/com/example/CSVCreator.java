package com.example;

import java.io.*;
import java.util.*;

public class CSVCreator {
    public static void createCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            StringBuilder sb = new StringBuilder();
            //this is the header of the csv file
            sb.append("\"Name\", \"CPU Manufacturer\",\"CPU\", \"GPU\",\"RAM\",\"Storage\",\"Storage Type\",\"Weight\",\"Screen Size\",\"Ports\",\"Geekbench Score\",\"Price\", \"URL\"\n");

            Scanner scanner = new Scanner(System.in);
            String continueAdding = "y";

            while (continueAdding.equalsIgnoreCase("y")) {
                System.out.println("Enter laptop name:"); //we will apply same filter to input as we did in setters of HighEndLaptop class
                String name = scanner.nextLine();
                if(name == null || name.length() == 0) {
                    throw new IllegalArgumentException("Name cannot be empty");

                } else {
                    sb.append('"').append(name).append("\",");
                }

                System.out.println("Enter laptop CPU Manufacturer:");
                String cpuManufacturer = scanner.nextLine();
                if(cpuManufacturer == null || cpuManufacturer.length() == 0) {
                    throw new IllegalArgumentException("CPU Manufacturer cannot be empty");
                } else {
                    sb.append('"').append(cpuManufacturer).append("\",");
                }

                System.out.println("Enter laptop CPU:");
                String cpu = scanner.nextLine();
                if(cpu == null || cpu.length() == 0) {
                    throw new IllegalArgumentException("CPU cannot be empty");
                } else {
                    sb.append('"').append(cpu).append("\",");
                }

                System.out.println("Enter laptop GPU:");
                String gpu = scanner.nextLine();
                if(gpu == null || gpu.length() == 0) {
                    throw new IllegalArgumentException("GPU cannot be empty");
                } else {
                    sb.append('"').append(gpu).append("\",");
                }

                System.out.println("Enter laptop RAM:");
                int ram = Integer.parseInt(scanner.nextLine());
                if(ram < 0) {
                    throw new IllegalArgumentException("RAM cannot be negative");
                } else if (ram > 256) {
                    throw new IllegalArgumentException("RAM cannot be greater than 256 GB");
                } else {
                    sb.append('"').append(ram).append("\",");
                }

                System.out.println("Enter laptop storage:");
                int storage = Integer.parseInt(scanner.nextLine());
                if(storage < 0) {
                    throw new IllegalArgumentException("Storage cannot be negative");
                } else if (storage > 10000) {
                    throw new IllegalArgumentException("Storage cannot be greater than 10000 GB");
                } else {
                    sb.append('"').append(storage).append("\",");
                }

                System.out.println("Enter laptop storage type:");
                String storageType = scanner.nextLine();
                if(storageType == null || storageType.length() == 0) {
                    throw new IllegalArgumentException("Storage type cannot be empty");
                } else if(!(storageType.equals("SSD") || storageType.equals("HDD"))) {
                    throw new IllegalArgumentException("Storage type must be either SSD or HDD");
                } else {
                    sb.append('"').append(storageType).append("\",");
                }

                System.out.println("Enter laptop weight:");
                double weight = Double.parseDouble(scanner.nextLine());
                if(weight < 0) {
                    throw new IllegalArgumentException("Weight cannot be negative");
                } else if (weight > 20) {
                    throw new IllegalArgumentException("Weight cannot be greater than 20 pounds");
                } else {
                    sb.append('"').append(weight).append("\",");
                }

                System.out.println("Enter laptop screen size:");
                String screenSize = scanner.nextLine();
                if(screenSize == null || screenSize.length() == 0) {
                    throw new IllegalArgumentException("Screen size cannot be empty");
                } else {
                    sb.append('"').append(screenSize).append("\",");
                }

                System.out.println("Enter laptop ports:");
                String ports = scanner.nextLine();
                if(ports == null || ports.length() == 0) {
                    throw new IllegalArgumentException("Ports cannot be empty");
                } else {
                    sb.append('"').append(ports).append("\",");
                }

                System.out.println("Enter laptop geekbench score:");
                int geekbenchScore = Integer.parseInt(scanner.nextLine());
                if(geekbenchScore < 0) {
                    throw new IllegalArgumentException("Geekbench MultiCore score cannot be negative");
                } else if (geekbenchScore > 30000) {
                    throw new IllegalArgumentException("Geekbench MultiCore score cannot be greater than 30000");
                } else {
                    sb.append('"').append(geekbenchScore).append("\",");
                }

                System.out.println("Enter laptop price (in CAD):");
                double price = Double.parseDouble(scanner.nextLine());
                if(price < 0) {
                    throw new IllegalArgumentException("Price cannot be negative");
                } else if (price > 10000) {
                    throw new IllegalArgumentException("Price cannot be greater than $10000");
                } else {
                    sb.append('"').append(price).append("\"");
                }

                System.out.println("Enter laptop image URL:");
                String url = scanner.nextLine();
                if(url == null || url.length() == 0) {
                    throw new IllegalArgumentException("URL cannot be empty");
                } else {
                    sb.append(",\"").append(url).append("\"");
                }

                // Add a new line after each laptop entry to separate them in the CSV file
                sb.append("\n");

                System.out.println("Do you want to add another laptop? (y/n)");
                continueAdding = scanner.nextLine();
            }

            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createCSV("src/main/resources/laptops.csv");
    }
}
