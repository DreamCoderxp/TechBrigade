package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SpecificationController {
    
    protected void initialize() {
        // TODO Auto-generated method stub
        
    }

    protected void applySpecFilter() {
        // TODO Auto-generated method stub

        //generate code for getting the selected values from radio button  toggle groups in the fxml file
        

        
    }   

    protected void showSpecFilterApplied() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificationFilterApplied.fxml"));
        
        Parent root = loader.load();
        SpecificationController controller = loader.getController();
        
        Stage stage = App.getStage();
        stage.setTitle("Specification Filter Applied");
        stage.setScene(new Scene(root, 640, 480));
        stage.show();


    }

}
