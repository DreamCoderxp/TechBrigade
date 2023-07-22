package com.example;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.StackPane;
public class circleExample extends Application {
    public void start(Stage primaryStage) {
        Circle c1 = new Circle();
        c1.setCenterX(150);
        c1.setCenterY(150);
        c1.setRadius(100);
        c1.setStroke(Color.BLACK);

        StackPane pane1 = new StackPane();
        pane1.getChildren().add(c1);
        Scene scene = new Scene(pane1, 200, 200);
        pane1.getChildren().add(new Button("1 button"));
        primaryStage.setScene(scene);

        primaryStage.setTitle("my first page");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}