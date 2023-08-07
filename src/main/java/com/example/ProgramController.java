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

/**
 * This class is the controller for the Program Filter page.
 * It allows the user to filter laptops by program and displays the filtered laptops in a new page.
 * 
 * @author Manjinder Singh
 */
public class ProgramController {
    
    // RadioButtons for selecting the program
    @FXML
    private RadioButton RadioBt1, RadioBt2, RadioBt3,RadioBt4,RadioBt5;

    // ToggleGroup for grouping the RadioButtons
    @FXML
    private ToggleGroup programGrp;

    // ArrayList for storing the filtered laptops
    ArrayList<Laptop> filteredLaptops;

    
    @FXML
    protected void initialize() {
        // Nothing needed here
    }

    /**
     * Applies the program filter by getting the selected program and benchmark value,
     * querying the database for laptops that meet the benchmark value, and displaying the filtered laptops.
     */
    @FXML
    protected void applyProgramFilter() throws IOException {

        // Get the selected program and benchmark value
        RadioButton selectedProgramButton = (RadioButton) programGrp.getSelectedToggle();
        String programValue = selectedProgramButton.getText();

        String programBenchmark="";
        // Set the benchmark value based on the selected program
        if(programValue.equals("Applied Science and Technology")){
            programBenchmark="10000";
        } else if(programValue.equals("Humanities and Social Sciences")){
            programBenchmark="7000";
        } else if(programValue.equals("Health and Community Studies")){
            programBenchmark="8000";

        } else if(programValue.equals("Animation Arts and Design")){
            programBenchmark="8500";
        } else if(programValue.equals("Pilon School of Business")){
            programBenchmark="6000";
        }       

        // Query the database for laptops that meet the benchmark value
        LaptopDatabase programDb = new LaptopDatabase();
        filteredLaptops = programDb.getProgramLaptops(programBenchmark);

        // Display the filtered laptops
        showProgramFilterApplied(filteredLaptops);       
    }

    /**
     * Shows the Program Filter Applied page with the filtered laptops.
     * 
     * @param laptops The filtered laptops to display.
     */
    @FXML
    protected void showProgramFilterApplied(ArrayList<Laptop> laptops) throws IOException {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ProgramFilterApplied.fxml"));
        Parent root = loader.load();
        PFilterAppliedController controller = loader.getController();
        controller.showLaptops(filteredLaptops);

        Stage stage = App.getStage();
        stage.setTitle("Program Filter Applied");
        stage.setScene(new Scene(root));
        stage.show();

    }

    /**
     * Goes back to the Home page.
     */
    @FXML
    protected void goHome() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Front.fxml"));

        Parent root = loader.load();
        Stage stage = App.getStage();
        stage.setTitle("Home");
        stage.setScene(new Scene(root));
        stage.show();
    }
}