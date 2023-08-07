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

/**
 * This class is the controller for the Portability page.
 * It displays up to three laptops with their name, cost, weight, screen size,
 * processor, and portability score.
 * The user can filter the laptops by portability using a ComboBox.
 * The user can click on the Home button to go back to the Home page.
 * 
 * @author Divya Luther
 */
public class PortabilityController {

    // ArrayList of laptops to display
    ArrayList<Laptop> filteredLaptops;

    // ComboBox for filtering the laptops by portability
    @FXML
    private ComboBox<String> portabilityComboBox;

    // Labels for displaying the laptop properties
    @FXML
    private Label name1, cost1, weight1, screen1, processor1, portability1;
    @FXML
    private Label name11, cost11, weight11, screen11, processor11, portability11;
    @FXML
    private Label name111, cost111, weight111, screen111, processor111, portability111;

    // ImageViews for displaying the laptop images
    @FXML
    private ImageView img1, img11, img111;

    // The portability score selected by the user
    private int portabilityScore;

    /**
     * Initializes the controller by defining the ComboBox options.
     */
    @FXML
    public void initialize() {
        portabilityComboBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");

        // Set up ComboBox event handler
        portabilityComboBox.setOnAction(event -> handleChoiceSelection());
    }

    /**
     * Displays up to three laptops with their name, cost, weight, screen size,
     * processor, and portability score.
     * 
     * @param laptops The ArrayList of laptops to display.
     */
    protected void showLaptops(ArrayList<Laptop> laptops) {
        int numLaptops = Math.min(laptops.size(), 3);

        if (numLaptops >= 1) {

            Laptop laptop1 = laptops.get(0);
            // Set the name, cost, weight, screen size, processor, and portability score
            // labels
            name1.setText("Name: " + laptop1.getName());
            cost1.setText("Cost: " + Double.toString(laptop1.getCost()));
            weight1.setText("Weight: " + Double.toString(laptop1.getWeight()) + " kg");
            screen1.setText("Screen Size: " + Double.toString(laptop1.getScreenSize()) + " inches");
            processor1.setText("Processor: " + laptop1.getProcessor());
            portability1.setText("Portability: " + Integer.toString(laptop1.getPortability()));
            // Set the image
            img1.setImage(new Image(laptop1.getUrl()));
        } else {
            // Clear the labels and image
            name1.setText("");
            cost1.setText("");
            weight1.setText("");
            screen1.setText("");
            processor1.setText("");
            portability1.setText("");
        }

        if (numLaptops >= 2) {

            Laptop laptop2 = laptops.get(1);
            // Set the name, cost, weight, screen size, processor, and portability score
            // labels
            name11.setText("Name: " + laptop2.getName());
            cost11.setText("Cost: " + Double.toString(laptop2.getCost()));
            weight11.setText("Weight: " + Double.toString(laptop2.getWeight()) + " kg");
            screen11.setText("Screen Size: " + Double.toString(laptop2.getScreenSize()) + " inches");
            processor11.setText("Processor: " + laptop2.getProcessor());
            portability11.setText("Portability: " + Integer.toString(laptop2.getPortability()));
            // Set the image
            img11.setImage(new Image(laptop2.getUrl()));
        } else {
            // Clear the labels and image
            name11.setText("");
            cost11.setText("");
            weight11.setText("");
            screen11.setText("");
            processor11.setText("");
            portability11.setText("");
        }

        if (numLaptops >= 3) {

            Laptop laptop3 = laptops.get(2);
            // Set the name, cost, weight, screen size, processor, and portability score
            // labels
            name111.setText("Name: " + laptop3.getName());
            cost111.setText("Cost: " + Double.toString(laptop3.getCost()));
            weight111.setText("Weight: " + Double.toString(laptop3.getWeight()) + " kg");
            screen111.setText("Screen Size: " + Double.toString(laptop3.getScreenSize()) + " inches");
            processor111.setText("Processor: " + laptop3.getProcessor());
            portability111.setText("Portability: " + Integer.toString(laptop3.getPortability()));
            // Set the image
            img111.setImage(new Image(laptop3.getUrl()));
        } else {
            // Clear the labels and image
            name111.setText("");
            cost111.setText("");
            weight111.setText("");
            screen111.setText("");
            processor111.setText("");
            portability111.setText("");
        }
    }

    /**
     * Handles the choice selection event of the ComboBox by updating the
     * portability score and displaying the laptops with the new score.
     */
    protected void handleChoiceSelection() {

        String selectedPortability = portabilityComboBox.getValue();

        if (selectedPortability.equals("Low Portability")) {
            portabilityScore = 35;
        } else if (selectedPortability.equals("Medium Portability")) {
            portabilityScore = 40;
        } else if (selectedPortability.equals("High Portability")) {
            portabilityScore = 55;
        }

        // Fetch the new list of laptops based on the updated portabilityScore
        LaptopDatabase portableLaptopsDB = new LaptopDatabase();
        filteredLaptops = portableLaptopsDB.getPortableLaptops(portabilityScore);

        // Update the display to show the new laptops
        showLaptops(filteredLaptops);
    }

    /**
     * Goes back to the Home page.
     */
    @FXML
    protected void goHome() throws IOException {
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}


/* We calculate a laptop's Portability Score by assigning points based
on its screen size, weight, and battery life. 
Smaller, lighter laptops with longer battery life get more points.
The final Portability Score is the sum of the points from these three categories.

    Screen size (measured in inches) - Generally, smaller laptops are more portable.
        ≤13": 20 points
        13"-14": 15 points
        14.1"-15.6": 10 points
            15.6": 5 points

    Weight (measured in pounds) - Lighter laptops are more portable.
        ≤2 lbs: 20 points
        2.1-4 lbs: 15 points
        4.1-6 lbs: 10 points
            6 lbs: 5 points

    Battery life (measured in hours) - Longer battery life means you can use it on the go without worrying about charging.
        ≥10 hours: 20 points
        7-9 hours: 15 points
        4-6 hours: 10 points
        <4 hours: 5 points

    Portability Score = Screen size points + Weight points + Battery life points
*/