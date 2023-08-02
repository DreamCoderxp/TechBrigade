package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PortabilityController {

    ArrayList<Laptop> filteredLaptops;
    
    @FXML
    private ChoiceBox<String> portabilityChoiceBox;

    @FXML
    private Label name1, cost1, weight1, screen1, processor1, portability1;

    @FXML
    private Label name11, cost11, weight11, screen11, processor11, portability11;

    @FXML
    private Label name111, cost111, weight111, screen111, processor111, portability111;

    private int portabilityScore;
    // // Initialize arrays with the FXML IDs
    //     nameLabels = new Label[]{name1, name11, name111};
    //     costLabels = new Label[]{cost1, cost11, cost111};
    //     weightLabels = new Label[]{weight1, weight11, weight111};
    //     screenLabels = new Label[]{screen1, screen11, screen111};
    //     processorLabels = new Label[]{processor1, processor11, processor111};
    //     portabilityLabels = new Label[]{portability1, portability11, portability111};

   //tj
   //tj3
   //tj3
   //tj3
   //tj3
   //t33
   //tj
   //tj
   //tj

    @FXML
    public void initialize() {
        // Populate the ChoiceBox with the desired choices
        portabilityChoiceBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");    

        // Set the default value (optional)
        portabilityChoiceBox.setValue("High Portability");

        



        //handleChoiceSelection();



        // Register an event handler to handle choice selection
        portabilityChoiceBox.setOnAction(event -> handleChoiceSelection());

         
        // LaptopDatabase portableLaptopsDB = new LaptopDatabase();
        //   filteredLaptops =portableLaptopsDB.getPortableLaptops(portabilityScore);

        // showLaptops(filteredLaptops);
        


    }

   
    
    
//     protected void showLaptops(ArrayList<Laptop> laptops) {      
//         System.out.println("showLaptops called");
//         System.out.println(laptops.size());


//         int numLaptops = Math.min(laptops.size(), 3);

        
//         for (int i = 0; i < 3; i++) {

//             if (nameLabels[i] == null) {
//                 System.out.println("nameLabels[i] is null");
//                 if (i < numLaptops) {
//                     System.out.println("i < numLaptops entered");
//                     System.out.println(nameLabels[i].getText());
//                     Laptop laptop = laptops.get(i);
//                     nameLabels[i].setText(laptop.getName());

//                     System.out.println(nameLabels[i].getText()+"______________-------------");
//                     costLabels[i].setText(Double.toString(laptop.getCost()));
//                     weightLabels[i].setText(Double.toString(laptop.getWeight()));
//                    // ramLabels[i].setText(Integer.toString(laptop.getRam()));
//                     screenLabels[i].setText(Double.toString(laptop.getScreenSize()));
//                     //storageLabels[i].setText(Integer.toString(laptop.getStorage()));
//                     processorLabels[i].setText(laptop.getProcessor());
//                     portabilityLabels[i].setText(Integer.toString(laptop.getPortability()));
                    
//                 } else {
//                     nameLabels[i].setText("");
//                      System.out.println(nameLabels[i].getText());
//                     costLabels[i].setText("");
//                     weightLabels[i].setText("");
//                     screenLabels[i].setText("");
//                     processorLabels[i].setText("");
//                     portabilityLabels[i].setText("");
//                 }
//             }
//         }
//     }
    
// //}


    
    protected void showLaptops(ArrayList<Laptop> laptops) {
        int numLaptops = Math.min(laptops.size(), 3);
        System.out.println(laptops.size());
        if (numLaptops >= 1) {
            Laptop laptop1 = laptops.get(0);
            name1.setText(laptop1.getName());
            cost1.setText(Double.toString(laptop1.getCost()));
            weight1.setText(Double.toString(laptop1.getWeight()));
            screen1.setText(Double.toString(laptop1.getScreenSize()));
            processor1.setText(laptop1.getProcessor());
            portability1.setText(Integer.toString(laptop1.getPortability()));
        } else {
            // Reset fields to blank if no laptop data
            name1.setText("");
            cost1.setText("");
            weight1.setText("");
            screen1.setText("");
            processor1.setText("");
            portability1.setText("");
        }
    
        if (numLaptops >= 2) {
            Laptop laptop2 = laptops.get(1);
            name11.setText(laptop2.getName());
            cost11.setText(Double.toString(laptop2.getCost()));
            weight11.setText(Double.toString(laptop2.getWeight()));
            screen11.setText(Double.toString(laptop2.getScreenSize()));
            processor11.setText(laptop2.getProcessor());
            portability11.setText(Integer.toString(laptop2.getPortability()));
        } else {
            // Reset fields to blank if no laptop data
            name11.setText("");
            cost11.setText("");
            weight11.setText("");
            screen11.setText("");
            processor11.setText("");
            portability11.setText("");
        }
    
        if (numLaptops >= 3) {
            Laptop laptop3 = laptops.get(2);
            name111.setText(laptop3.getName());
            cost111.setText(Double.toString(laptop3.getCost()));
            weight111.setText(Double.toString(laptop3.getWeight()));
            screen111.setText(Double.toString(laptop3.getScreenSize()));
            processor111.setText(laptop3.getProcessor());
            portability111.setText(Integer.toString(laptop3.getPortability()));
        } else {
            // Reset fields to blank if no laptop data
            name111.setText("");
            cost111.setText("");
            weight111.setText("");
            screen111.setText("");
            processor111.setText("");
            portability111.setText("");
        }
    }




protected void handleChoiceSelection() {
    // Handle the choice selection event here
    String selectedPortability = portabilityChoiceBox.getValue();

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

    // Fetch the new list of laptops based on the updated portabilityScore
    LaptopDatabase portableLaptopsDB = new LaptopDatabase();
    filteredLaptops = portableLaptopsDB.getPortableLaptops(portabilityScore);

    for (Laptop laptop : filteredLaptops) {
        System.out.println(laptop.getName());
    }
    // Update the display to show the new laptops
    showLaptops(filteredLaptops);
}


    @FXML
    protected void goHome() throws IOException {
        // TODO Auto-generated method stub
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
