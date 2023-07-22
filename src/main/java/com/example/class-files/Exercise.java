package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise extends Application{
    public void start(Stage primaryStage)throws Exception {
        FlowPane fPaneNew=new FlowPane(Orientation.VERTICAL);

        FlowPane fPane=new FlowPane();
        Label lbl= new Label("Employee Information");

        FlowPane fPane1=new FlowPane();
        Label lbl1= new Label("Employee id:");
        TextField txt1= new TextField();

        FlowPane fPane2=new FlowPane();
        Label lbl2= new Label("First Name:");
        TextField txt2= new TextField();

        FlowPane fPane3=new FlowPane();
        Label lbl3= new Label("Last Name:");
        TextField txt3= new TextField();

        fPane.getChildren().add(lbl);
        fPane.setAlignment(Pos.CENTER);
        fPane1.getChildren().addAll(lbl1,txt1);
        fPane1.setAlignment(Pos.CENTER);
        fPane2.getChildren().addAll(lbl2,txt2);
        fPane2.setAlignment(Pos.CENTER);
        fPane3.getChildren().addAll(lbl3,txt3);
        fPane3.setAlignment(Pos.CENTER);
        fPaneNew.getChildren().addAll(fPane,fPane1,fPane2,fPane3);
       
        fPaneNew.setAlignment(Pos.CENTER);
        fPaneNew.setHgap(10);
        fPaneNew.setVgap(10);
        fPaneNew.setPadding(new Insets(10,10,10,10));

        Scene scene=new Scene(fPaneNew,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FLowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
