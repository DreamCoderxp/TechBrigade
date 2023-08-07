/**
 * This class is the controller for the Additional Feature page.
 * It handles user input about which additional innovative feature
 * the user would like to view.
 * 
 * @author Divya Luther 
 */
package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdditionalFeatureController {

    /**
     * Button for selecting laptops with backlit keyboard.
     */
    @FXML
    private Button backlitBt;
    
    /**
     * Button for selecting laptops with touchscreen.
     */
    @FXML
    private Button touchscreenBt;
    
    /**
     * Button for selecting 2-in-1 laptops.
     */
    @FXML
    private Button twoInOneBt;

    /**
     * ArrayList of laptops with selected additional features.
     */
    ArrayList<Laptop> filteredLaptops;
    
    /**
     * Top message to display on the next page.
     */
    String storedMessageTop;
    
    /**
     * Inner message to display on the next page.
     */
    String storedMessageInner;


    /**
     * Initializes the controller class.
     */
    @FXML
    public void initialize() {
        
        backlitBt.setOnAction(event -> {
            try {
                handleChoiceSelection(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        touchscreenBt.setOnAction(event -> {
            try {
                handleChoiceSelection(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        twoInOneBt.setOnAction(event -> {
            try {
                handleChoiceSelection(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        

    }

    /**
     * Handles user selection of additional feature and 
     * delegates the process of displaying laptops with the selected feature.
     * 
     * @param event The event that triggered the method.
     */
    @FXML
    protected void handleChoiceSelection(ActionEvent event) throws IOException {

        int signal = 0;
        Button button = (Button) event.getSource();

        // If the user selected the "Backlit Keyboard" button
        if (button == backlitBt) {

            // Set the top message to display on the next page
            storedMessageTop="Checkout PC's with Backlit Keyboard";
            
            // Set the inner message to display on the next page
            storedMessageInner="Backlit Keyboard Enabled ";
            
            // Set the signal to 1 to indicate that the user selected the "Backlit Keyboard" feature
            signal = 1;
        
        // If the user selected the "Touchscreen" button
        } else if (button == touchscreenBt) {
            
            storedMessageTop="Checkout PC's with Touchscreen";
            storedMessageInner="Touchscreen Enabled ";
            
            // Set the signal to 2 to indicate that the user selected the "Touchscreen" feature
            signal = 2;
        
        // If the user selected the "2-in-1" button
        } else if (button == twoInOneBt) {

            storedMessageTop="Checkout 2-in-1 PC's";           
            storedMessageInner="2-in-1 Laptop ";
            
            // Set the signal to 3 to indicate that the user selected the "2-in-1" feature
            signal = 3;
        }

        // Get the laptops with the selected additional feature from the database
        LaptopDatabase additionalFeatureLaptopsDB = new LaptopDatabase();
        filteredLaptops = additionalFeatureLaptopsDB.getAdditionalFeatLaptops(signal);

        // Display the laptops with the selected additional feature on the next page
        showAdditionalFeatLaptops(filteredLaptops);
    }

    /**
     * Displays laptops with selected additional feature on the next page.
     * 
     * @param laptops The ArrayList of laptops to display.
     */
    @FXML
    protected void showAdditionalFeatLaptops(ArrayList<Laptop> laptops) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AFeatureApplied.fxml"));
        Parent root = loader.load();

         // Call the showLaptops method of the controller to display the laptops with the selected additional feature
        AFeatureAppliedController controller = loader.getController();
        controller.showLaptops(filteredLaptops, storedMessageTop, storedMessageInner);

        Stage stage = App.getStage();
        stage.setTitle("Innovative Features Equipped Laptops");
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * Returns to the home page.
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