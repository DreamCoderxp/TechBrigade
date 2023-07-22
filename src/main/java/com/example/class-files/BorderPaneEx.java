package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderPaneEx extends Application  {
    public void start(Stage primaryStage)throws Exception{
        BorderPane bpane=new BorderPane();
        bpane.setPadding(new Insets(10));
        //StackPane p1= new StackPane();
        //p1.getChildren().add(new Label("Top"));
        bpane.setTop(new Label("Top"));
        bpane.setBottom(new Label("Bottom"));
        bpane.setCenter(new Label("Center"));
        bpane.setLeft(new Label("Left"));
        bpane.setRight(new Label("Right"));
        
        Scene scene=new Scene(bpane,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FLowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
