package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ProgramController {
    
    @FXML
    private RadioButton RadioBt1, RadioBt2, RadioBt3,RadioBt4,RadioBt5;

    @FXML
    private ToggleGroup programGrp;

    
    ArrayList<Laptop> filteredLaptops;
    

    @FXML
    protected void initialize() {
        // TODO Auto-generated method stub

    }

    

}
