package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class okEvent extends Application {
    //int a=10,b=10;
    CirclePaneCreater circleObj = new CirclePaneCreater();
    public void start(Stage primaryStage){
        /*Button okButton = new Button("Press ok");
                Button cancelButton = new Button("cancel");


       // EventHandler<ActionEvent> handleOk = new okButtonHandler();
       okButtonHandler handleOk = new okButtonHandler();
        okButton.setOnAction(handleOk);

        cancelButtonHandler handleCancel = new cancelButtonHandler();
        cancelButton.setOnAction(handleCancel);

        //StackPane pane = new StackPane();
        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(okButton,cancelButton);*/
        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(circleObj);
        Button enlargeButton = new Button("Enlarge");
        enlargeCircle enlargeHandler = new enlargeCircle();
        enlargeButton.setOnAction(enlargeHandler);
        pane.getChildren().add(enlargeButton);
        Scene scene = new Scene(pane,300,300);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("my first event");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    /*class  okButtonHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            System.out.println("sum is  "+ (a+b));

        }

    }

}*/
    
/*class cancelButtonHandler implements EventHandler<ActionEvent>{
    public void handle(ActionEvent e){
        System.out.println("cancel Button clicked");
    }
}
*/
class enlargeCircle implements EventHandler<ActionEvent>{
    public void handle(ActionEvent e){
        circleObj.enlarge();
    }
}
}
class CirclePaneCreater extends StackPane{
    Circle c1= new Circle();
    CirclePaneCreater(){
        getChildren().add(c1);
        c1.setRadius(5);
        c1.setStroke(Color.BLACK);

    }
    public void enlarge(){
        c1.setRadius(c1.getRadius()+5);
    }


}