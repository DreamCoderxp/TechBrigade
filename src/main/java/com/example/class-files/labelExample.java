package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class labelExample extends Application {
    public void start(Stage primaryStage){
        Image img=new Image("sissys.jpg",20,20,true,true);
        ImageView flagImg=new ImageView(img);

        Label lbl=new Label();
        lbl.setText("US 50 States");
        lbl.setGraphic(flagImg);
        lbl.setStyle("-fx-border-color:green;");

        HBox pane= new HBox();
        pane.getChildren().add(lbl);

        Scene scene = new Scene(pane,300,300);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("my first Label");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
