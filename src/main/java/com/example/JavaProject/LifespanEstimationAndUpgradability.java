package com.example.JavaProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LifespanEstimationAndUpgradability extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LifespanEstimationAndUpgradability.fxml"));
        primaryStage.setTitle("Lifespan Estimation & Upgradability");
        primaryStage.setScene(new Scene(root, 600, 400)); // Set your preferred width and height
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


