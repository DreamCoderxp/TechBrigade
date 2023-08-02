package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CostSavingController {
    
    @FXML
    Label name1,warranty1,review1,cost1,benchmark1;
    @FXML
    Label name11,warranty11,review11,cost11,benchmark11;
    @FXML
    Label name111,warranty111,review111,cost111,benchmark111;

    @FXML
    private ImageView img1, img11, img111;
    
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


    protected void showLaptops(ArrayList<Laptop> laptops) {
        int numLaptops = Math.min(laptops.size(), 3);
        System.out.println(laptops.size());
        if (numLaptops >= 1) {
            Laptop laptop1 = laptops.get(0);
            name1.setText("Name: " + laptop1.getName());
            cost1.setText("Cost: $" + Double.toString(laptop1.getCost()));
            warranty1.setText("Warranty: " + Double.toString(laptop1.getWarranty()) + " years");
            review1.setText("Review: " + Double.toString(laptop1.getReview()) + "/5");
            benchmark1.setText("Benchmark: " + Double.toString(laptop1.getBenchmark()));
            img1.setImage(new Image(laptop1.getUrl()));
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
            name11.setText("Name: " + laptop2.getName());
            cost11.setText("Cost: $" + Double.toString(laptop2.getCost()));
            warranty11.setText("Warranty: " + Double.toString(laptop2.getWarranty()) + " years");
            review11.setText("Review: " + Double.toString(laptop2.getReview()) + "/5");
            benchmark11.setText("Benchmark: " + Double.toString(laptop2.getBenchmark()));
            img11.setImage(new Image(laptop2.getUrl()));
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
            name111.setText("Name: " + laptop3.getName());
            cost111.setText("Cost: $" + Double.toString(laptop3.getCost()));
            warranty111.setText("Warranty: " + Double.toString(laptop3.getWarranty()) + " years");
            review111.setText("Review: " + Double.toString(laptop3.getReview()) + "/5");
            benchmark111.setText("Benchmark: " + Double.toString(laptop3.getBenchmark()));
            img111.setImage(new Image(laptop3.getUrl()));
        } else {
            // Reset fields to blank if no laptop data
            name111.setText("");
            cost111.setText("");
            warranty111.setText("");
            review111.setText("");
            benchmark111.setText("");
        }
    }

     @FXML
    protected void goHome() throws IOException {
        // TODO Auto-generated method stub
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
                       

}
