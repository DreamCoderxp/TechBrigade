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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

    @FXML
    private ImageView img1, img11, img111;

    private int portabilityScore;
    // // Initialize arrays with the FXML IDs
    //     nameLabels = new Label[]{name1, name11, name111};
    //     costLabels = new Label[]{cost1, cost11, cost111};
    //     weightLabels = new Label[]{weight1, weight11, weight111};
    //     screenLabels = new Label[]{screen1, screen11, screen111};
    //     processorLabels = new Label[]{processor1, processor11, processor111};
    //     portabilityLabels = new Label[]{portability1, portability11, portability111};

   

    @FXML
    public void initialize() {
        // Populate the ChoiceBox with the desired choices
        portabilityChoiceBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");    

        // Set the default value (optional)
        portabilityChoiceBox.setValue("High Portability");
      // Register an event handler to handle choice selection
        portabilityChoiceBox.setOnAction(event -> handleChoiceSelection());
   }
   
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
           
            img1.setImage(new Image(laptop1.getUrl()));
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
            img11.setImage(new Image(laptop2.getUrl()));
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
            img111.setImage(new Image(laptop3.getUrl()));
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
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
