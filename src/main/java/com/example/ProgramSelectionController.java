package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ProgramSelectionController {
    @FXML
    private ComboBox<String> programBox;

    private HighEndLaptopDatabase laptopDatabase;

    public ProgramSelectionController() throws FileNotFoundException, FileNotFoundException {
        laptopDatabase = new HighEndLaptopDatabase("src/main/resources/laptops.csv");
    }

    @FXML
    private void getRecommendations() {
        String selectedProgram = programBox.getValue();
        if (selectedProgram == null) {
            Alert alert = new Alert(AlertType.ERROR, "Please select a program.");
            alert.showAndWait();
            return;
        }

        int minGeekbenchScore;
        switch (selectedProgram) {
            case "Computer Programming":
                minGeekbenchScore = 10000;
                break;
            // Add cases for other programs...
            default:
                minGeekbenchScore = 0;
        }

        List<HighEndLaptop> recommendedLaptops = laptopDatabase.filterLaptops(minGeekbenchScore);
        if (recommendedLaptops.isEmpty()) {
            Alert alert = new Alert(AlertType.INFORMATION, "No laptops found for the selected program.");
            alert.showAndWait();
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LaptopRecommendations.fxml"));
                Parent root = loader.load();

                LaptopRecommendationsController controller = loader.getController();
                controller.setLaptops(recommendedLaptops);

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
