package com.example;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SpecificationController {

    ArrayList<Laptop> filteredLaptops;

    @FXML
    private Label message;

    @FXML
    private ToggleGroup ram;
    @FXML
    private ToggleGroup cpu;
    @FXML
    private ToggleGroup sSize;

    @FXML
    protected void initialize() {
        // nothing felt needed here
    }

    @FXML
    protected void applySpecFilter() throws IOException {

        RadioButton selectedRamButton = (RadioButton) ram.getSelectedToggle();
        String ramValue = selectedRamButton.getText();

        RadioButton selectedCpuButton = (RadioButton) cpu.getSelectedToggle();
        String cpuValue = selectedCpuButton.getText();

        RadioButton selectedScreenButton = (RadioButton) sSize.getSelectedToggle();
        String screenSizeValue = selectedScreenButton.getText();

        // convert the values to the correct format
        int ramInt = convertRamValue(ramValue);
        double screenSizeDouble = convertScreenSizeValue(screenSizeValue);

        LaptopDatabase speclaptopsDB = new LaptopDatabase();
        filteredLaptops = speclaptopsDB.getSpecLaptops(ramInt, cpuValue, screenSizeDouble);

        // generate code for showing the filtered laptops in a new window
        showSpecFilterApplied();

    }

    @FXML
    protected void showSpecFilterApplied() throws IOException {
        if (filteredLaptops.isEmpty()) {

            // If filteredLaptops is empty, we show a message
            message.setText("No laptops found. Please try again.");
            message.setStyle("-fx-text-fill: red;");


        } else {

            // If filteredLaptops is not empty, we proceed with showing the
            // specFilterApplied.fxml
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

    @FXML
    protected void goHome() throws IOException {
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}