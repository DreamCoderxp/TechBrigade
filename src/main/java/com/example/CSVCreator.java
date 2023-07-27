package com.example;

import java.io.*;
import java.util.*;

public class CSVCreator {
    public static void createCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            StringBuilder sb = new StringBuilder();
            sb.append("\"Name\",\"CPU\",\"RAM\",\"Storage\",\"Storage Type\",\"Weight\",\"Screen Size\",\"Ports\",\"Geekbench Score\",\"Price\"\n");

            Scanner scanner = new Scanner(System.in);
            String continueAdding = "y";

            while (continueAdding.equalsIgnoreCase("y")) {
                System.out.println("Enter laptop name:");
                sb.append('"').append(scanner.nextLine()).append("\",");

                System.out.println("Enter laptop CPU:");
                sb.append('"').append(scanner.nextLine()).append("\",");

                System.out.println("Enter laptop RAM:");
                sb.append(scanner.nextLine()).append(",");

                System.out.println("Enter laptop storage:");
                sb.append(scanner.nextLine()).append(",");

                System.out.println("Enter laptop storage type:");
                sb.append('"').append(scanner.nextLine()).append("\",");

                System.out.println("Enter laptop weight:");
                sb.append(scanner.nextLine()).append(",");

                System.out.println("Enter laptop screen size:");
                sb.append('"').append(scanner.nextLine()).append("\",");

                System.out.println("Enter laptop ports:");
                sb.append('"').append(scanner.nextLine()).append("\",");

                System.out.println("Enter laptop geekbench score:");
                sb.append(scanner.nextLine()).append(",");

                System.out.println("Enter laptop price:");
                sb.append(scanner.nextLine()).append("\n");

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
