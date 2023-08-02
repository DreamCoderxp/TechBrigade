package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class CostSavingController {
    
    @FXML
    Label name1,warranty1,review1,cost1,benchmark1;
    @FXML
    Label name11,warranty11,review11,cost11,benchmark11;
    @FXML
    Label name111,warranty111,review111,cost111,benchmark111;

    ArrayList<Laptop> filteredLaptops;

    @FXML
    private ComboBox<String> costComboBox;

    @FXML
    protected void initialize() {
        // TODO Auto-generated method stub
        costComboBox.getItems().addAll("Basic Tasks","Office Work", "Gaming");
        
        // Set the default value (optional)
        costComboBox.setValue("Basic Tasks");

        
        // Register an event handler to handle choice selection
        costComboBox.setOnAction(event -> handleChoiceSelection());

    }

    protected void handleChoiceSelection() {

        // Handle the choice selection event here
        String selectedCost = costComboBox.getValue();

        System.out.println("Selected Cost: " + selectedCost);


        String processor="";

        if(selectedCost.equals("Basic Tasks")){
            processor="i3";
        } else if(selectedCost.equals("Office Work")){
            processor="i5";
        } else if(selectedCost.equals("Gaming")){
            processor="i7";
        }
        
        LaptopDatabase costLaptopsDB = new LaptopDatabase();
         filteredLaptops = costLaptopsDB.getCostLaptops(processor);

        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.getName());
        }
        // Update the display to show the new laptops
        showLaptops(filteredLaptops);
    }


    protected void showLaptops(ArrayList<Laptop> laptops){
        int numLaptops = Math.min(laptops.size(), 3);
        System.out.println(laptops.size());
        if (numLaptops >= 1) {
            Laptop laptop1 = laptops.get(0);
            name1.setText(laptop1.getName());
            cost1.setText(Double.toString(laptop1.getCost()));
            warranty1.setText(Double.toString(laptop1.getWarranty()));
            review1.setText(Double.toString(laptop1.getReview()));
            benchmark1.setText(Double.toString(laptop1.getBenchmark()));
        } else {
            // Reset fields to blank if no laptop data
            name1.setText("");
            cost1.setText("");
            warranty1.setText("");
            review1.setText("");
            benchmark1.setText("");
        }

        if (numLaptops >= 2) {
            Laptop laptop2 = laptops.get(1);
            name11.setText(laptop2.getName());
            cost11.setText(Double.toString(laptop2.getCost()));
            warranty11.setText(Double.toString(laptop2.getWarranty()));
            review11.setText(Double.toString(laptop2.getReview()));
            benchmark11.setText(Double.toString(laptop2.getBenchmark()));
        } else {
            // Reset fields to blank if no laptop data
            name11.setText("");
            cost11.setText("");
            warranty11.setText("");
            review11.setText("");
            benchmark11.setText("");
        }

        if (numLaptops >= 3) {
            Laptop laptop3 = laptops.get(2);
            name111.setText(laptop3.getName());
            cost111.setText(Double.toString(laptop3.getCost()));
            warranty111.setText(Double.toString(laptop3.getWarranty()));
            review111.setText(Double.toString(laptop3.getReview()));
            benchmark111.setText(Double.toString(laptop3.getBenchmark()));
        } else {
            // Reset fields to blank if no laptop data
            name111.setText("");
            cost111.setText("");
            warranty111.setText("");
            review111.setText("");
            benchmark111.setText("");
        }

    }

    // protected void showLaptops(ArrayList<Laptop> laptops) {
    //     int numLaptops = Math.min(laptops.size(), 3);
    //     System.out.println(laptops.size());
    //     if (numLaptops >= 1) {
    //         Laptop laptop1 = laptops.get(0);
    //         name1.setText(laptop1.getName());
    //         cost1.setText(Double.toString(laptop1.getCost()));
    //         weight1.setText(Double.toString(laptop1.getWeight()));
    //         screen1.setText(Double.toString(laptop1.getScreenSize()));
    //         processor1.setText(laptop1.getProcessor());
    //         portability1.setText(Integer.toString(laptop1.getPortability()));
    //     } else {
    //         // Reset fields to blank if no laptop data
    //         name1.setText("");
    //         cost1.setText("");
    //         weight1.setText("");
    //         screen1.setText("");
    //         processor1.setText("");
    //         portability1.setText("");
    //     }
    
    //     if (numLaptops >= 2) {
    //         Laptop laptop2 = laptops.get(1);
    //         name11.setText(laptop2.getName());
    //         cost11.setText(Double.toString(laptop2.getCost()));
    //         weight11.setText(Double.toString(laptop2.getWeight()));
    //         screen11.setText(Double.toString(laptop2.getScreenSize()));
    //         processor11.setText(laptop2.getProcessor());
    //         portability11.setText(Integer.toString(laptop2.getPortability()));
    //     } else {
    //         // Reset fields to blank if no laptop data
    //         name11.setText("");
    //         cost11.setText("");
    //         weight11.setText("");
    //         screen11.setText("");
    //         processor11.setText("");
    //         portability11.setText("");
    //     }
    
    //     if (numLaptops >= 3) {
    //         Laptop laptop3 = laptops.get(2);
    //         name111.setText(laptop3.getName());
    //         cost111.setText(Double.toString(laptop3.getCost()));
    //         weight111.setText(Double.toString(laptop3.getWeight()));
    //         screen111.setText(Double.toString(laptop3.getScreenSize()));
    //         processor111.setText(laptop3.getProcessor());
    //         portability111.setText(Integer.toString(laptop3.getPortability()));
    //     } else {
    //         // Reset fields to blank if no laptop data
    //         name111.setText("");
    //         cost111.setText("");
    //         weight111.setText("");
    //         screen111.setText("");
    //         processor111.setText("");
    //         portability111.setText("");
    //     }
    // }

                       

}
