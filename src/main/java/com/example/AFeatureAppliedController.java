package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AFeatureAppliedController {
    
    @FXML
    private Label name1,cost1,ram1, storage1, processor1,message1;

    @FXML
    private Label name11,cost11,ram11, storage11, processor11,message11;

    @FXML
    private Label name111,cost111,ram111, storage111, processor111,message111;

    @FXML
    private Label messageTop;

    @FXML
    protected void showLaptops(ArrayList<Laptop> laptops, String storedMessageTop, String storedMessageInner) {

        name1.setText(laptops.get(0).getName());
        cost1.setText(Double.toString(laptops.get(0).getCost()));
        ram1.setText(Integer.toString(laptops.get(0).getRam()));
        storage1.setText(Integer.toString(laptops.get(0).getStorage()));
        processor1.setText(laptops.get(0).getProcessor());
      

        name11.setText(laptops.get(1).getName());
        cost11.setText(Double.toString(laptops.get(1).getCost()));
        ram11.setText(Integer.toString(laptops.get(1).getRam()));
        storage11.setText(Integer.toString(laptops.get(1).getStorage()));
        processor11.setText(laptops.get(1).getProcessor());
        
        name111.setText(laptops.get(2).getName());
        cost111.setText(Double.toString(laptops.get(2).getCost()));
        ram111.setText(Integer.toString(laptops.get(2).getRam()));
        storage111.setText(Integer.toString(laptops.get(2).getStorage()));
        processor111.setText(laptops.get(2).getProcessor());

        // Set the message
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
        //SpecificationController controller = loader.getController();
        // controller.setscene(scene);

        Stage stage = App.getStage();
        //Scene scene= new Scene(root,1500,1500);
        stage.setTitle("Innovative Features");
        stage.setScene(new Scene(root));
       // stage.setResizable(true);
        stage.show();

    }

    
    
}
