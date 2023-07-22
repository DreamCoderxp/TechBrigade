package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Circle extends Application {

    private TextField txt;
    private Label resultLabel;

    public void start(Stage primaryStage) {
        Label label = new Label("Circle");
        Label radiusLabel = new Label("Radius:");
        txt = new TextField();

        Button areaButton = new Button("Area");
        Button perimeterButton = new Button("Perimeter");
        resultLabel = new Label();

        areaButton.setOnAction(e -> calculateArea());
        perimeterButton.setOnAction(e -> calculatePerimeter());

        FlowPane labelPane = new FlowPane(Orientation.HORIZONTAL);
        labelPane.setHgap(10);
        labelPane.getChildren().add(label);

        FlowPane radiustxt = new FlowPane(Orientation.HORIZONTAL);
        radiustxt.getChildren().addAll(radiusLabel,txt);

        FlowPane buttonPane = new FlowPane(Orientation.HORIZONTAL);
        buttonPane.setHgap(10);
        buttonPane.getChildren().addAll(areaButton, perimeterButton);

        FlowPane resultPane = new FlowPane(Orientation.HORIZONTAL);
        resultPane.setHgap(10);
        resultPane.getChildren().add(resultLabel);

        FlowPane mainPane = new FlowPane(Orientation.VERTICAL);
        mainPane.setPadding(new Insets(10));
        mainPane.setHgap(10);
        mainPane.setVgap(10);
        mainPane.getChildren().addAll(labelPane, radiustxt, buttonPane, resultPane);

        Scene scene = new Scene(mainPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Circle");
        primaryStage.show();
    }

    private void calculateArea() {
        double radius = gettxt();
        if (radius >= 0) {
            double area = Math.PI * radius * radius;
            resultLabel.setText("Area = " + area);
        } else {
            resultLabel.setText("Invalid radius");
        }
    }

    private void calculatePerimeter() {
        double radius = gettxt();
        if (radius >= 0) {
            double perimeter = 2 * Math.PI * radius;
            resultLabel.setText("Perimeter = " + perimeter);
        } else {
            resultLabel.setText("Invalid radius");
        }
    }

    private double gettxt() {
        try {
            return Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
