package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class LifespanEstimationController {
    @FXML
    private TableView<Laptop> laptopTable;
    @FXML
    private TableColumn<Laptop, String> nameColumn;
    @FXML
    private TableColumn<Laptop, Integer> batteryColumn;
    @FXML
    private TableColumn<Laptop, Integer> lifespanColumn;
    @FXML
    private TableColumn<Laptop, Double> costColumn;
    @FXML
    private TableColumn<Laptop, Integer> warrantyColumn;

    @FXML
    private ComboBox<String> brandComboBox;

    @FXML
    protected void initialize() {

        brandComboBox.getItems().addAll("Apple", "Asus", "Dell", "HP", "Lenovo", "Acer");

        //brandComboBox.setValue("Apple");

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        batteryColumn.setCellValueFactory(new PropertyValueFactory<>("batteryLife"));
        batteryColumn.setCellValueFactory(new PropertyValueFactory<>("batteryLife"));
       

        lifespanColumn.setCellValueFactory(new PropertyValueFactory<>("lifespan"));
        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        warrantyColumn.setCellValueFactory(new PropertyValueFactory<>("warranty"));

        brandComboBox.setOnAction(event -> handleChoiceSelection());

        // LaptopDatabase laptopDB = new LaptopDatabase();
        // laptopTable.getItems().addAll(laptopDB.getLaptops());
    }

    protected void handleChoiceSelection() {

        // Handle the choice selection event here
        String selectedBrand = brandComboBox.getValue();

        System.out.println("Selected Brand: " + selectedBrand);

        LaptopDatabase laptopDB = new LaptopDatabase();
        laptopTable.getItems().clear();
        laptopTable.getItems().addAll(laptopDB.getBrandLaptops(selectedBrand));
    }

     @FXML
    protected void goHome() throws IOException {
        // TODO Auto-generated method stub
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
