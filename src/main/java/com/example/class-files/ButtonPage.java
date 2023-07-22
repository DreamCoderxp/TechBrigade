package com.example;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonPage extends Application {
    public void start(Stage primaryStage) {
        // Button newButton = new Button("Button in pane");
        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        FlowPane pane2 = new FlowPane(Orientation.HORIZONTAL);
        FlowPane pane3 = new FlowPane(Orientation.HORIZONTAL);
        // FlowPane pane = new FlowPane();
        // pane.getChildren().add(newButton);
        // FlowPane pane2 = new FlowPane();
        pane2.getChildren().add(new Button("1 button"));

        pane2.getChildren().add(new Button("2 button"));
        pane2.getChildren().add(new Button("3 button"));

        pane3.getChildren().add(new Button("4button"));
        // pane.getChildren().add(newButton);
        // FlowPane pane3 = new FlowPane();
        pane.getChildren().add(pane2);
        pane.getChildren().add(pane3);

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}