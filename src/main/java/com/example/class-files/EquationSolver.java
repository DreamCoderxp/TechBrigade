package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EquationSolver extends Application{
    public void start(Stage primaryStage)throws Exception {
        FlowPane fPaneNew=new FlowPane(Orientation.VERTICAL);

        FlowPane fPane=new FlowPane();
        Label lbl= new Label("Quadratic Equation Solver");

        FlowPane fPane1=new FlowPane();
        Label lbl1= new Label("A Value:");
        TextField txt1= new TextField();

        FlowPane fPane2=new FlowPane();
        Label lbl2= new Label("B Value:");
        TextField txt2= new TextField();

        FlowPane fPane3=new FlowPane();
        Label lbl3= new Label("C Value:");
        TextField txt3= new TextField();

        FlowPane pane=new FlowPane();

        FlowPane fPaneEnd=new FlowPane();
        Label lblNew= new Label("Solution:");

        

        fPane.getChildren().add(lbl);
        fPane.setAlignment(Pos.CENTER);
        fPane1.getChildren().addAll(lbl1,txt1);
        fPane1.setAlignment(Pos.CENTER);
        fPane2.getChildren().addAll(lbl2,txt2);
        fPane2.setAlignment(Pos.CENTER);
        fPane3.getChildren().addAll(lbl3,txt3);
        fPane3.setAlignment(Pos.CENTER);
        fPaneEnd.getChildren().add(lblNew);
        pane.getChildren().add(new Button("Solve"));
        pane.getChildren().add(new Button("Clear"));
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        fPaneEnd.setAlignment(Pos.CENTER_LEFT);
        fPaneNew.getChildren().addAll(fPane,fPane1,fPane2,fPane3,pane,fPaneEnd);
       
        fPaneNew.setAlignment(Pos.CENTER);
        fPaneNew.setHgap(10);
        fPaneNew.setVgap(10);
        fPaneNew.setPadding(new Insets(10,10,10,10));
        

        Scene scene=new Scene(fPaneNew,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Equation Solver");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
