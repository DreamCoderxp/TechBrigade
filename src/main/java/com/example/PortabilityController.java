package com.example;

import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PortabilityController {

    ArrayList<Laptop> filteredLaptops;
    
    @FXML
    private ChoiceBox<String> portabilityChoiceBox;

    @FXML
    private Label name1,cost1,weight1,screen1,processor1,portability1;
    private Label name11,cost11,weight11,screen11,processor11,portability11;
    private Label name111,cost111,weight111,screen111,processor111,portability111;

     // Create arrays for labels
    private Label[] nameLabels;
    private Label[] costLabels;
    private Label[] weightLabels;
    private Label[] screenLabels;
    private Label[] processorLabels;
    private Label[] portabilityLabels;
    

    private int portabilityScore;

    @FXML
    public void initialize() {
        // Populate the ChoiceBox with the desired choices
        portabilityChoiceBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");

        // Set the default value (optional)
        portabilityChoiceBox.setValue("High Portability");

        // Register an event handler to handle choice selection
        portabilityChoiceBox.setOnAction(event -> handleChoiceSelection());

         // Initialize arrays with the FXML IDs
        nameLabels = new Label[]{name1, name11, name111};
        costLabels = new Label[]{cost1, cost11, cost111};
        weightLabels = new Label[]{weight1, weight11, weight111};
        screenLabels = new Label[]{screen1, screen11, screen111};
        processorLabels = new Label[]{processor1, processor11, processor111};
        portabilityLabels = new Label[]{portability1, portability11, portability111};

        LaptopDatabase portableLaptopsDB = new LaptopDatabase();
          filteredLaptops =portableLaptopsDB.getPortableLaptops(portabilityScore);

        showLaptops(filteredLaptops);
        

    }

   
    
    
    protected void showLaptops(ArrayList<Laptop> laptops) {
        int numLaptops = Math.min(laptops.size(), 3);
    
        for (int i = 0; i < 3; i++) {
            if (nameLabels[i] != null) {
                if (i < numLaptops) {
                    Laptop laptop = laptops.get(i);
                    nameLabels[i].setText(laptop.getName());
                    costLabels[i].setText(Double.toString(laptop.getCost()));
                    weightLabels[i].setText(Double.toString(laptop.getWeight()));
                   // ramLabels[i].setText(Integer.toString(laptop.getRam()));
                    screenLabels[i].setText(Double.toString(laptop.getScreenSize()));
                    //storageLabels[i].setText(Integer.toString(laptop.getStorage()));
                    processorLabels[i].setText(laptop.getProcessor());
                    portabilityLabels[i].setText(Integer.toString(laptop.getPortability()));
                } else {
                    nameLabels[i].setText("");
                    costLabels[i].setText("");
                    weightLabels[i].setText("");
                    screenLabels[i].setText("");
                    
                    processorLabels[i].setText("");
                    portabilityLabels[i].setText("");
                }
            }
        }
    }
    
//}





    //tst
    private void handleChoiceSelection() {
        // Handle the choice selection event here
        String selectedPortability = portabilityChoiceBox.getValue();

        portabilityScore = 0;


        System.out.println("Selected Portability: " + selectedPortability);

        if(selectedPortability.equals("Low Portability")){
            portabilityScore = 35;
        }
        else if(selectedPortability.equals("Medium Portability")){
            portabilityScore = 40;
        }
        else if(selectedPortability.equals("High Portability")){
            portabilityScore = 55;
        }
    


        // Add your custom logic here based on the selected value
    }
}
