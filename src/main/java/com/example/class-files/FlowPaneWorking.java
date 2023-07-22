package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneWorking extends Application{
    public void start(Stage primaryStage)throws Exception {
        FlowPane fPane=new FlowPane();
        Label lbl1= new Label("Enter Name:");
        TextField txt1= new TextField();
        Label lbl2= new Label("Enter Name:");
        TextField txt2= new TextField();
        Label lbl3= new Label("Enter Name:");
        TextField txt3= new TextField();

        fPane.getChildren().addAll(lbl1,txt1,lbl2,txt2,lbl3,txt3);
        fPane.setAlignment(Pos.CENTER);
        fPane.setHgap(10);
        fPane.setVgap(10);
        fPane.setPadding(new Insets(10,10,10,10));

        Scene scene=new Scene(fPane,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FLowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
