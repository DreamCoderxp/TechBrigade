package com.example;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageExample extends Application {
    public void start(Stage primaryStage) {
        //image path declare either file:///image name.png
        //or put the image in resources and give path as imageName.png
        Image img = new Image("sissys.jpg");
        ImageView view = new ImageView(img);
        StackPane pane = new StackPane();
        pane.getChildren().add(view);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("my first img");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch( args);
    }
}

