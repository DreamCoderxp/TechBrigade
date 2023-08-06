package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class specFilterAppliedController {
    
    @FXML
    private Label name1,cost1,ram1,storage1,processor1;

    @FXML
    private Label name11,cost11,ram11,storage11,processor11;

    @FXML
    private Label name111,cost111,ram111,storage111,processor111;

    @FXML
    private ImageView img1, img11, img111;

    @FXML
    private Button back;


    protected void showLaptops(ArrayList<Laptop> laptops) {
        if (laptops.size() >= 1) {
            name1.setText("Name: " + laptops.get(0).getName());
            cost1.setText("Cost: " + Double.toString(laptops.get(0).getCost()));
            ram1.setText("RAM: " + Integer.toString(laptops.get(0).getRam()));
            storage1.setText("Storage: " + Integer.toString(laptops.get(0).getStorage()));
            processor1.setText("Processor: " + laptops.get(0).getProcessor());
            img1.setImage(new Image(laptops.get(0).getUrl()));
        } else {
            name1.setText("");
            cost1.setText("");
            ram1.setText("");
            storage1.setText("");
            processor1.setText("");
        }
        
        if (laptops.size() >= 2) {
            name11.setText("Name: " + laptops.get(1).getName());
            if (cost11 != null) {
                cost11.setText("Cost: " + Double.toString(laptops.get(1).getCost()));
            }
            if (ram11 != null) {
                ram11.setText("RAM: " + Integer.toString(laptops.get(1).getRam()));
            }
            if (storage11 != null) {
                storage11.setText("Storage: " + Integer.toString(laptops.get(1).getStorage()));
            }
            if (processor11 != null) {
                processor11.setText("Processor: " + laptops.get(1).getProcessor());
            }
            if (img11 != null) {
                img11.setImage(new Image(laptops.get(1).getUrl()));
            }
        } else {
            name11.setText("");
            if (cost11 != null) {
                cost11.setText("");
            }
            if (ram11 != null) {
                ram11.setText("");
            }
            if (storage11 != null) {
                storage11.setText("");
            }
            if (processor11 != null) {
                processor11.setText("");
            }
        }
        
        if (laptops.size() >= 3) {
            name111.setText("Name: " + laptops.get(2).getName());
            if (cost111 != null) {
                cost111.setText("Cost: " + Double.toString(laptops.get(2).getCost()));
            }
            if (ram111 != null) {
                ram111.setText("RAM: " + Integer.toString(laptops.get(2).getRam()));
            }
            if (storage111 != null) {
                storage111.setText("Storage: " + Integer.toString(laptops.get(2).getStorage()));
            }
            if (processor111 != null) {
                processor111.setText("Processor: " + laptops.get(2).getProcessor());
            }
            if (img111 != null) {
                img111.setImage(new Image(laptops.get(2).getUrl()));
            }
        } else {
            name111.setText("");
            if (cost111 != null) {
                cost111.setText("");
            }
            if (ram111 != null) {
                ram111.setText("");
            }
            if (storage111 != null) {
                storage111.setText("");
            }
            if (processor111 != null) {
                processor111.setText("");
            }
        }
    }
    
    @FXML
    protected void goBack() throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificationFilter.fxml"));

        Parent root = loader.load();
        Stage stage = App.getStage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}