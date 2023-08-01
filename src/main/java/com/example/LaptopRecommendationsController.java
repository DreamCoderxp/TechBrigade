package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class LaptopRecommendationsController {
    @FXML
    private TableView<HighEndLaptop> laptopTable;

    @FXML
    private TableColumn<HighEndLaptop, String> nameColumn;

    @FXML
    private TableColumn<HighEndLaptop, String> cpuColumn;

    @FXML
    private TableColumn<HighEndLaptop, String> gpuColumn;

    @FXML
    private TableColumn<HighEndLaptop, Integer> ramColumn;

    @FXML
    private TableColumn<HighEndLaptop, Integer> storageColumn;

    @FXML
    private TableColumn<HighEndLaptop, Double> weightColumn;

    @FXML
    private TableColumn<HighEndLaptop, String> screenSizeColumn;

    @FXML
    private TableColumn<HighEndLaptop, String> portsColumn;

    @FXML
    private TableColumn<HighEndLaptop, Integer> geekbenchColumn;

    @FXML
    private TableColumn<HighEndLaptop, Double> priceColumn;

    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        cpuColumn.setCellValueFactory(new PropertyValueFactory<>("cpu"));
        gpuColumn.setCellValueFactory(new PropertyValueFactory<>("gpu"));
        ramColumn.setCellValueFactory(new PropertyValueFactory<>("ram"));
        storageColumn.setCellValueFactory(new PropertyValueFactory<>("storage"));
        weightColumn.setCellValueFactory(new PropertyValueFactory<>("weight"));
        screenSizeColumn.setCellValueFactory(new PropertyValueFactory<>("screenSize"));
        portsColumn.setCellValueFactory(new PropertyValueFactory<>("ports"));
        geekbenchColumn.setCellValueFactory(new PropertyValueFactory<>("geekbenchScore"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    public void setLaptops(List<HighEndLaptop> laptops) {
        laptopTable.getItems().setAll(laptops);
    }
}
