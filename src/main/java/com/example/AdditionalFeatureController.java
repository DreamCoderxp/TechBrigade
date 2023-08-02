package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdditionalFeatureController {

    @FXML
    private Button backlitBt;
    @FXML
    private Button touchscreenBt;
    @FXML
    private Button twoInOneBt;

    ArrayList<Laptop> filteredLaptops;
    String storedMessageTop;
    String storedMessageInner;


    @FXML
    public void initialize() {
        
        backlitBt.setOnAction(arg0 -> {
            try {
                handleChoiceSelection(arg0);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        touchscreenBt.setOnAction(arg0 -> {
            try {
                handleChoiceSelection(arg0);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        twoInOneBt.setOnAction(arg0 -> {
            try {
                handleChoiceSelection(arg0);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

    }

    @FXML
    protected void handleChoiceSelection(ActionEvent event) throws IOException {

        int signal = 0;
        Button button = (Button) event.getSource();

        if (button == backlitBt) {
            System.out.println("Backlit Keyboard");
            storedMessageTop="Checkout PC's with Backlit Keyboard";
            storedMessageInner="Backlit Keyboard Enabled ";
            signal = 1;
        } else if (button == touchscreenBt) {
            System.out.println("Touchscreen");
            storedMessageTop="Checkout PC's with Touchscreen";
            storedMessageInner="Touchscreen Enabled ";
            signal = 2;
        } else if (button == twoInOneBt) {
            System.out.println("2-in-1");
            storedMessageTop="Checkout 2-in-1 PC's";
            storedMessageInner="2-in-1 Laptop ";
            signal = 3;
        }

        LaptopDatabase additionalFeatureLaptopsDB = new LaptopDatabase();
        filteredLaptops = additionalFeatureLaptopsDB.getAdditionalFeatLaptops(signal);

        showAdditionalFeatLaptops(filteredLaptops);
    }

    @FXML
    protected void showAdditionalFeatLaptops(ArrayList<Laptop> laptops) throws IOException {
        // TODO Auto-generated method stub
        //System.out.println("Showing laptops with additional features");
        //System.out.println(laptops.size());
        for (Laptop laptop : laptops) {
            System.out.println(laptop.getName());
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AFeatureApplied.fxml"));
        Parent root = loader.load();
        AFeatureAppliedController controller = loader.getController();
        controller.showLaptops(filteredLaptops, storedMessageTop, storedMessageInner);

        Stage stage = App.getStage();
        stage.setTitle("Innovative Features Equipped Laptops");
        stage.setScene(new Scene(root));
        stage.show();



    }
}
