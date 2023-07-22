package com.example;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Arithmetic extends Application {
    private TextField num1;
    private TextField num2;
    private Label resultLabel;
    private Label tBox1;
    private Label tBox2;
    private Label name;

    public void start(Stage primaryStage) {
        name = new Label("Calculator");
        tBox1 = new Label("Enter first number: ");

        num1 = new TextField();

        tBox2 = new Label("Enter second number: ");
        num2 = new TextField();

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button divideButton = new Button("/");
        Button multiplyButton = new Button("*");

        addButton.setOnAction(e -> {
            if (validateInputs()) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int sum = a + b;
                resultLabel.setText(a + "+" + b + "=" + sum);
            } else {
                resultLabel.setText("Invalid input");
            }
        });

        subtractButton.setOnAction(e -> {
            if (validateInputs()) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int difference = a - b;
                resultLabel.setText(a + "-" + b + "=" + difference);
            } else {
                resultLabel.setText("Invalid input");
            }
        });

        divideButton.setOnAction(e -> {
            if (validateInputs()) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                if (b != 0) {
                    double quotient = (double) a / b;
                    resultLabel.setText(a + "/" + b + "=" + quotient);
                } else {
                    resultLabel.setText("Cannot divide by zero");
                }
            } else {
                resultLabel.setText("Invalid input");
            }
        });

        multiplyButton.setOnAction(e -> {
            if (validateInputs()) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int product = a * b;
                resultLabel.setText(a + "*" + b + "=" + product);
            } else {
                resultLabel.setText("Invalid input");
            }
        });

        FlowPane namePane = new FlowPane(Orientation.HORIZONTAL);
        namePane.setAlignment(Pos.CENTER);
        namePane.setHgap(10);
        namePane.getChildren().addAll(name);

        FlowPane inputPane1 = new FlowPane(Orientation.HORIZONTAL);
        inputPane1.setAlignment(Pos.CENTER);
        inputPane1.setHgap(10);
        inputPane1.getChildren().addAll(tBox1, num1);

        FlowPane inputPane2 = new FlowPane(Orientation.HORIZONTAL);
        inputPane2.setAlignment(Pos.CENTER);
        inputPane2.setHgap(10);
        inputPane2.getChildren().addAll(tBox2, num2);

        FlowPane buttonPane = new FlowPane(Orientation.HORIZONTAL);
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setHgap(10);
        buttonPane.getChildren().addAll(addButton, subtractButton);

        FlowPane buttonPane2 = new FlowPane(Orientation.HORIZONTAL);
        buttonPane2.setAlignment(Pos.CENTER);
        buttonPane2.setHgap(10);
        buttonPane2.getChildren().addAll(multiplyButton, divideButton);

        resultLabel = new Label();
        FlowPane resultPane = new FlowPane(Orientation.HORIZONTAL);
        resultPane.setAlignment(Pos.CENTER);
        resultPane.setHgap(10);
        resultPane.getChildren().addAll(resultLabel);


        FlowPane mainPane = new FlowPane(Orientation.VERTICAL);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setHgap(10);
        mainPane.setVgap(10);
        mainPane.getChildren().addAll(namePane, inputPane1, inputPane2, buttonPane, buttonPane2,resultPane);

        Scene scene = new Scene(mainPane, 300, 300);
        primaryStage.setTitle("Arithmetic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean validateInputs() {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
