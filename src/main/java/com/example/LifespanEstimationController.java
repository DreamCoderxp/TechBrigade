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

/**
 * This class is the controller for the Lifespan Estimation page.
 * It displays a table of laptops with their battery life, lifespan, cost, and warranty.
 * The user can filter the table by brand using a ComboBox.
 * 
 * @author Gurleen Kaur
 */
public class LifespanEstimationController {
    
    // TableView for displaying the laptops
    @FXML
    private TableView<Laptop> laptopTable;
    
    // TableColumns for displaying the laptop properties
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

    // ComboBox for filtering the table by brand
    @FXML
    private ComboBox<String> brandComboBox;

    /**
     * Initializes the controller by defining the ComboBox options and setting up the TableView columns.
     */
    @FXML
    protected void initialize() {

        // Define ComboBox options
        brandComboBox.getItems().addAll("Apple", "Asus", "Dell", "HP", "Lenovo", "Acer");

        // Set up TableView columns
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        batteryColumn.setCellValueFactory(new PropertyValueFactory<>("batteryLife"));
        lifespanColumn.setCellValueFactory(new PropertyValueFactory<>("lifespan"));
        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        warrantyColumn.setCellValueFactory(new PropertyValueFactory<>("warranty"));

        // Set up ComboBox event handler
        brandComboBox.setOnAction(event -> handleChoiceSelection());

    }

    /**
     * Handles the choice selection event of the ComboBox by filtering the table by brand.
     * 
     * @param selectedBrand The selected brand from the ComboBox.
     */
    protected void handleChoiceSelection() {

        // Handle the choice selection event here
        String selectedBrand = brandComboBox.getValue();

        LaptopDatabase laptopDB = new LaptopDatabase();
        laptopTable.getItems().clear();
        laptopTable.getItems().addAll(laptopDB.getBrandLaptops(selectedBrand));
    }

    /**
     * Goes back to the Home page.
     */
    @FXML
    protected void goHome() throws IOException {
        Stage stage = App.getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}