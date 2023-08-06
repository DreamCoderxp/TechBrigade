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

public class ProgramController {
    
    @FXML
    private RadioButton RadioBt1, RadioBt2, RadioBt3,RadioBt4,RadioBt5;

    @FXML
    private ToggleGroup programGrp;

    
    ArrayList<Laptop> filteredLaptops;
    

    @FXML
    protected void initialize() {
        //nothing felt needed here
    }

    @FXML
    protected void applyProgramFilter() throws IOException {

        RadioButton selectedProgramButton = (RadioButton) programGrp.getSelectedToggle();
        String programValue = selectedProgramButton.getText();

        String programBenchmark="";
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

        LaptopDatabase programDb = new LaptopDatabase();
        filteredLaptops = programDb.getProgramLaptops(programBenchmark);

        showProgramFilterApplied(filteredLaptops);       
    }

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
