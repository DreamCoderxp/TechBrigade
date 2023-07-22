package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class demoPro extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Button okbutton= new Button("Hello World");
        Scene scene=new Scene(okbutton);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First Program");
        primaryStage.show();

        Stage stage2= new Stage();
        Button b2=new Button("Second Stage");
        stage2.setTitle("Stage2");
        Scene scene2 =new Scene(b2,100,200);
        stage2.setScene(scene2);
        stage2.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
