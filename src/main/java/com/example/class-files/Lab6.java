package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lab6 extends Application {
    public void start(Stage primaryStage) {
        int clockSize = 200; 
        int centerX = clockSize / 2;
        int centerY = clockSize / 2;
        
        //circle of the clock
        Circle c1 = new Circle(100, 100,100);
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.LIGHTBLUE);

        //hands of the clock
        Line smallHand = new Line(100,100, 150, 100);
        smallHand.setStrokeWidth(2);
        smallHand.setStroke(Color.BLACK);

        Line bigHand = new Line(100,100,100, 40);
        bigHand.setStrokeWidth(2);
        bigHand.setStroke(Color.BLACK);

        //the numbers of the clock representing time
        Label label12 = new Label("12");
        label12.setTranslateX(centerX - 7);
        label12.setTranslateY(centerY - clockSize / 2 + 20);

        Label label3 = new Label("3");
        label3.setTranslateX(centerX + clockSize / 2 - 20);
        label3.setTranslateY(centerY - 7);

        Label label6 = new Label("6");
        label6.setTranslateX(centerX - 7);
        label6.setTranslateY(centerY + clockSize / 2 - 30);

        Label label9 = new Label("9");
        label9.setTranslateX(centerX - clockSize / 2 + 10);
        label9.setTranslateY(centerY - 7);

        //group to combine all the elements
        Group g1 = new Group();
        g1.getChildren().addAll(c1, smallHand, bigHand, label12, label3, label6, label9);
        Scene scene = new Scene(g1, clockSize, clockSize);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Watch Clock");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
