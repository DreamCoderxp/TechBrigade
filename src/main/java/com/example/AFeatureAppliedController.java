package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AFeatureAppliedController {
    
    @FXML
    private Label name1,cost1,ram1, storage1, processor1,message1;

    @FXML
    private Label name11,cost11,ram11, storage11, processor11,message11;

    @FXML
    private Label name111,cost111,ram111, storage111, processor111,message111;

    @FXML
    private ImageView img1,img11,img111;

    @FXML
    private Label messageTop;

    @FXML
    protected void showLaptops(ArrayList<Laptop> laptops, String storedMessageTop, String storedMessageInner) {

        name1.setText("Name: " + laptops.get(0).getName());
        cost1.setText("Cost: " + Double.toString(laptops.get(0).getCost()));
        ram1.setText("RAM: " + Integer.toString(laptops.get(0).getRam()));
        storage1.setText("Storage: " + Integer.toString(laptops.get(0).getStorage()));
        processor1.setText("Processor: " + laptops.get(0).getProcessor());
        img1.setImage(new Image(laptops.get(0).getUrl()));

        name11.setText("Name: " + laptops.get(1).getName());
        cost11.setText("Cost: " + Double.toString(laptops.get(1).getCost()));
        ram11.setText("RAM: " + Integer.toString(laptops.get(1).getRam()));
        storage11.setText("Storage: " + Integer.toString(laptops.get(1).getStorage()));
        processor11.setText("Processor: " + laptops.get(1).getProcessor());
        img11.setImage(new Image(laptops.get(1).getUrl()));

        name111.setText("Name: " + laptops.get(2).getName());
        cost111.setText("Cost: " + Double.toString(laptops.get(2).getCost()));
        ram111.setText("RAM: " + Integer.toString(laptops.get(2).getRam()));
        storage111.setText("Storage: " + Integer.toString(laptops.get(2).getStorage()));
        processor111.setText("Processor: " + laptops.get(2).getProcessor());
        img111.setImage(new Image(laptops.get(2).getUrl()));

        // Set the text for some descriptive labels
        messageTop.setText(storedMessageTop);
        message1.setText(storedMessageInner);
        message11.setText(storedMessageInner);
        message111.setText(storedMessageInner);

    }

    @FXML
    protected void goBack() throws IOException {
        //System.out.println("GO BAck method called");
       FXMLLoader loader = new FXMLLoader(getClass().getResource("AdditionalFeature.fxml"));

        Parent root = loader.load();
        Stage stage = App.getStage();
        stage.setTitle("Innovative Features");
        stage.setScene(new Scene(root));
        stage.show();
    }

    
    
}
