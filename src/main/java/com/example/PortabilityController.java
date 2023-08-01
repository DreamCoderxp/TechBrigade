package com.example;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class PortabilityController {
    
    @FXML
     private ChoiceBox<String> portabilityChoiceBox;
 
    @FXML
    protected void initialize() {


        // Populate the ChoiceBox with the desired choices
        portabilityChoiceBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");

        // Set the default value (optional)
        portabilityChoiceBox.setValue("High Portability");
    }
}
