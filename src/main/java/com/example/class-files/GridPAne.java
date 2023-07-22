package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GridPAne extends Application{
    public void start(Stage primaryStage)throws Exception {
       

        FlowPane fPane=new FlowPane();
        Label lbl= new Label("Employee Information");
        fPane.getChildren().addAll(lbl);
        fPane.setAlignment(Pos.CENTER);

        GridPane parent=new GridPane();
       
        Label lbl1= new Label("Employee id:");
        TextField txt1= new TextField();

        Label lbl2= new Label("First Name:");
        TextField txt2= new TextField();

        Label lbl3= new Label("Last Name:");
        TextField txt3= new TextField();

        //fPane.getChildren().add(lbl);
        //fPane.setAlignment(Pos.CENTER);
        
    
        parent.add(lbl1,0,0);
        parent.add(txt1,1,0);
        parent.add(lbl2,0,1);
        parent.add(txt2,1,1);
        parent.add(lbl3,0,2);
        parent.add(txt3,1,2);
                
        FlowPane parentPane=new FlowPane(Orientation.VERTICAL);
        parentPane.getChildren().addAll(fPane,parent);
        parent.setAlignment(Pos.CENTER);
        

        Scene scene=new Scene(parentPane,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FLowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

