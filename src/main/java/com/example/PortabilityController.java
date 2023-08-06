package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PortabilityController {

    ArrayList<Laptop> filteredLaptops;
    
    @FXML
    private ComboBox<String> portabilityComboBox;

    @FXML
    private Label name1, cost1, weight1, screen1, processor1, portability1;

    @FXML
    private Label name11, cost11, weight11, screen11, processor11, portability11;

    @FXML
    private Label name111, cost111, weight111, screen111, processor111, portability111;

    @FXML
    private ImageView img1, img11, img111;

    private int portabilityScore;

    @FXML
    public void initialize() {
        portabilityComboBox.getItems().addAll("Low Portability", "Medium Portability", "High Portability");    
    
        portabilityComboBox.setOnAction(event -> handleChoiceSelection());
   }
   
   protected void showLaptops(ArrayList<Laptop> laptops) {
    int numLaptops = Math.min(laptops.size(), 3);
    
    if (numLaptops >= 1) {
        Laptop laptop1 = laptops.get(0);
        name1.setText("Name: " + laptop1.getName());
        cost1.setText("Cost: " + Double.toString(laptop1.getCost()));
        weight1.setText("Weight: " + Double.toString(laptop1.getWeight()));
        screen1.setText("Screen Size: " + Double.toString(laptop1.getScreenSize()));
        processor1.setText("Processor: " + laptop1.getProcessor());
        portability1.setText("Portability: " + Integer.toString(laptop1.getPortability()));
        img1.setImage(new Image(laptop1.getUrl()));
    } else {
        name1.setText("");
        cost1.setText("");
        weight1.setText("");
        screen1.setText("");
        processor1.setText("");
        portability1.setText("");
    }

    if (numLaptops >= 2) {
        Laptop laptop2 = laptops.get(1);
        name11.setText("Name: " + laptop2.getName());
        cost11.setText("Cost: " + Double.toString(laptop2.getCost()));
        weight11.setText("Weight: " + Double.toString(laptop2.getWeight()));
        screen11.setText("Screen Size: " + Double.toString(laptop2.getScreenSize()));
        processor11.setText("Processor: " + laptop2.getProcessor());
        portability11.setText("Portability: " + Integer.toString(laptop2.getPortability()));
        img11.setImage(new Image(laptop2.getUrl()));
    } else {
        name11.setText("");
        cost11.setText("");
        weight11.setText("");
        screen11.setText("");
        processor11.setText("");
        portability11.setText("");
    }

    if (numLaptops >= 3) {
        Laptop laptop3 = laptops.get(2);
        name111.setText("Name: " + laptop3.getName());
        cost111.setText("Cost: " + Double.toString(laptop3.getCost()));
        weight111.setText("Weight: " + Double.toString(laptop3.getWeight()));
        screen111.setText("Screen Size: " + Double.toString(laptop3.getScreenSize()));
        processor111.setText("Processor: " + laptop3.getProcessor());
        portability111.setText("Portability: " + Integer.toString(laptop3.getPortability()));
        img111.setImage(new Image(laptop3.getUrl()));
    } else {
        name111.setText("");
        cost111.setText("");
        weight111.setText("");
        screen111.setText("");
        processor111.setText("");
        portability111.setText("");
    }
}




protected void handleChoiceSelection() {
    
    String selectedPortability = portabilityComboBox.getValue();

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

    // Update the display to show the new laptops
    showLaptops(filteredLaptops);
}


    @FXML
    protected void goHome() throws IOException {
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
