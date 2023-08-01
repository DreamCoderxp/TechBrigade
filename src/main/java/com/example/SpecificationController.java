package com.example;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SpecificationController {

    ArrayList<Laptop> filteredLaptops;

    @FXML
    // create fields for all the radio button toggle groups in the fxml file
    private RadioButton ramBt1;
    private RadioButton ramBt2;
    private RadioButton ramBt3;

    @FXML
    private RadioButton cpuBt1;
    private RadioButton cpuBt2;
    private RadioButton cpuBt3;

    @FXML
    private RadioButton screenBt1;
    private RadioButton screenBt2;
    private RadioButton screenBt3;

    @FXML
    private ToggleGroup ram;
    @FXML
    private ToggleGroup cpu;
    @FXML
    private ToggleGroup sSize;

    @FXML
    protected void initialize() {
        // TODO Auto-generated method stub

    }

    @FXML
    protected void applySpecFilter() throws IOException {
        // TODO Auto-generated method stub

        // generate code for getting the selected values from radio button toggle groups
        // in the fxml file
        RadioButton selectedRamButton = (RadioButton) ram.getSelectedToggle();
        String ramValue = selectedRamButton.getText();
        System.out.println(ramValue);

        RadioButton selectedCpuButton = (RadioButton) cpu.getSelectedToggle();
        String cpuValue = selectedCpuButton.getText();

        RadioButton selectedScreenButton = (RadioButton) sSize.getSelectedToggle();
        String screenSizeValue = selectedScreenButton.getText();

        // convert the values to the correct format
        int ramInt = convertRamValue(ramValue);
        double screenSizeDouble = convertScreenSizeValue(screenSizeValue);

        LaptopDatabase speclaptopsDB = new LaptopDatabase();
         filteredLaptops=  speclaptopsDB.getSpecLaptops(ramInt, cpuValue, screenSizeDouble);

        //System.out.println(filteredLaptops);
        for(Laptop laptop: filteredLaptops) {
            System.out.println(laptop.toString());
        }

        // generate code for showing the filtered laptops in a new window
        showSpecFilterApplied();
        


    }

    @FXML
protected void showSpecFilterApplied() throws IOException {
    if (filteredLaptops.isEmpty()) {
        // If the filteredLaptops ArrayList is empty, just load and set the SpecificationFilter.fxml
        Parent root = FXMLLoader.load(getClass().getResource("SpecificationFilter.fxml"));

        Stage stage = App.getStage();
        stage.setTitle("Specification Filter");
        stage.setScene(new Scene(root));
        stage.show();
    } else {
        // If filteredLaptops is not empty, proceed with showing the specFilterApplied.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecFilterApplied.fxml"));
        Parent root = loader.load();
        specFilterAppliedController controller = loader.getController();
        controller.showLaptops(filteredLaptops);

        Stage stage = App.getStage();
        stage.setTitle("Specification Filter Applied");
        stage.setScene(new Scene(root));
        stage.show();
    }
}


    protected int convertRamValue(String ramValue) {
        // TODO Auto-generated method stub

        int ramInt = 0;

        if (ramValue.equals("8 GB")) {
            ramInt = 8;

        } else if (ramValue.equals("16 GB")) {
            ramInt = 16;
        } else if (ramValue.equals("32 GB")) {
            ramInt = 32;
        }

        return ramInt;
    }

    protected double convertScreenSizeValue(String screenSizeValue) {
        // TODO Auto-generated method stub

        double screenSizeDouble = 0;

        if (screenSizeValue.equals("13.3\"")) {
            screenSizeDouble = 13.3;

        } else if (screenSizeValue.equals("14\"")) {
            screenSizeDouble = 14.0;
        } else if (screenSizeValue.equals("15.6\"")) {
            screenSizeDouble = 15.6;
        }

        return screenSizeDouble;
    }
}
