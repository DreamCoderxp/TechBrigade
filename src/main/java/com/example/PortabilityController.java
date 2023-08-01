package com.example;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class PortabilityController {

    @FXML
    private ChoiceBox<String> portabilityChoiceBox;

    @FXML
    public void initialize() {
        // Populate the ChoiceBox with the desired choices
        portabilityChoiceBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");

        // Set the default value (optional)
        portabilityChoiceBox.setValue("High Portability");

        // Register an event handler to handle choice selection
        portabilityChoiceBox.setOnAction(event -> handleChoiceSelection());
    }

    private void handleChoiceSelection() {
        // Handle the choice selection event here
        String selectedPortability = portabilityChoiceBox.getValue();
            

        System.out.println("Selected Portability: " + selectedPortability);

        if(selectedPortability.equals("Low Portability")){

        }
        else if(selectedPortability.equals("Medium Portability")){

        }
        else if(selectedPortability.equals("High Portability")){


        }

        // Add your custom logic here based on the selected value
    }
}
