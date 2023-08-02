package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LifespanEstimationController {
    @FXML
    private TableView<Laptop> laptopTable;
    @FXML
    private TableColumn<Laptop, String> laptopNameColumn;
    @FXML
    private TableColumn<Laptop, Integer> batteryLifeColumn;
    @FXML
    private TableColumn<Laptop, Integer> averageLifeSpanColumn;
    @FXML
    

}
