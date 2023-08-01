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
    private ToggleGroup cpu;
    private ToggleGroup sSize;

    @FXML
    protected void initialize() {
        // TODO Auto-generated method stub

    }

    @FXML
    protected void applySpecFilter() {
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
        ArrayList<Laptop> filteredLaptops=  speclaptopsDB.getSpecLaptops(ramInt, cpuValue, screenSizeDouble);

        System.out.println(filteredLaptops);
        for(Laptop laptop: filteredLaptops) {
            System.out.println(laptop.getName());
        }

    }

    @FXML
    protected void showSpecFilterApplied() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificationFilterApplied.fxml"));

        Parent root = loader.load();
        SpecificationController controller = loader.getController();

        Stage stage = App.getStage();
        stage.setTitle("Specification Filter Applied");
        stage.setScene(new Scene(root, 640, 480));
        stage.show();

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

        if (screenSizeValue.equals("(<12\")")) {
            screenSizeDouble = 12.0;

        } else if (screenSizeValue.equals("(12.1\"- 14\")")) {
            screenSizeDouble = 14.0;
        } else if (screenSizeValue.equals("(14.1\"-15.6\")")) {
            screenSizeDouble = 15.6;
        }

        return screenSizeDouble;
    }
}
