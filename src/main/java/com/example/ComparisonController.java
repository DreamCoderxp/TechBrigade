package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ComparisonController {
    
    @FXML
    private ComboBox<String> laptopAComboBox;
    @FXML
    private ComboBox<String> laptopBComboBox;

    @FXML
    private Label name1,cost1,weight1,processor1,screen1,os1,storage1,ram1,battery1;

    @FXML
    private Label name11,cost11,weight11,processor11,screen11,os11,storage11,ram11,battery11;

    @FXML
    private Button compareBt;
    
    ArrayList<Laptop> filteredLaptops;
    
    @FXML
    protected void initialize() {
        // TODO Auto-generated method stub
        laptopAComboBox.getItems().addAll("Macbook Pro", "Dell XPS", "HP Spectre", "Lenovo ThinkPad", "Asus ZenBook", "Acer Aspire", "Macbook Air", "MSI GF63", "Huawei MateBook", "Razer Blade", "Samsung Galaxy Book Pro", "Google Pixelbook Go", "Dell Inspiron", "Asus ROG Zephyrus", "Lenovo Yoga");
        laptopBComboBox.getItems().addAll("HP Pavilion", "Acer Predator Helios", "Lenovo Legion", "Macbook Pro 16", "Dell Alienware", "Microsoft Surface Pro", "HP Elite Dragonfly", "Lenovo IdeaPad", "Asus VivoBook", "Razer Blade Stealth", "Dell Latitude", "Macbook Air M1", "MSI Prestige", "Acer Swift", "LG Gram");
        
        
        
        // Register an event handler to handle choice selection
        compareBt.setOnAction(event -> handleChoiceSelection());
        //laptopBComboBox.setOnAction(event -> handleChoiceSelection());

    }

    protected void handleChoiceSelection() {
        String selectedLaptopA = laptopAComboBox.getValue();
        String selectedLaptopB = laptopBComboBox.getValue();

        System.out.println("Selected Laptop A: " + selectedLaptopA);
        System.out.println("Selected Laptop B: " + selectedLaptopB);

        LaptopDatabase laptopDB = new LaptopDatabase();
        filteredLaptops = laptopDB.getComparedLaptops(selectedLaptopA, selectedLaptopB);

        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.getName());
        }

        showLaptops(filteredLaptops);
    }


    protected void showLaptops(ArrayList<Laptop> laptops) {

        for (int i=0; i<laptops.size();i++) {
            if (i==0) {
                name1.setText(laptops.get(i).getName());
                cost1.setText(Double.toString(laptops.get(i).getCost()));
                weight1.setText(Double.toString(laptops.get(i).getWeight()));
                processor1.setText(laptops.get(i).getProcessor());
                screen1.setText(Double.toString(laptops.get(i).getScreenSize()));
                os1.setText(laptops.get(i).getOs());
                storage1.setText(Integer.toString(laptops.get(i).getStorage()));
                ram1.setText(Integer.toString(laptops.get(i).getRam()));
                battery1.setText(Double.toString(laptops.get(i).getBatteryLife()));
            } 
            
            if (i==1) {
                name11.setText(laptops.get(i).getName());
                cost11.setText(Double.toString(laptops.get(i).getCost()));
                weight11.setText(Double.toString(laptops.get(i).getWeight()));
                processor11.setText(laptops.get(i).getProcessor());
                screen11.setText(Double.toString(laptops.get(i).getScreenSize()));
                os11.setText(laptops.get(i).getOs());
                storage11.setText(Integer.toString(laptops.get(i).getStorage()));
                ram11.setText(Integer.toString(laptops.get(i).getRam()));
                battery11.setText(Double.toString(laptops.get(i).getBatteryLife()));
            }
        }


    }

    // protected void showLaptops(ArrayList<Laptop> laptops) {
    //     if (laptops.size() >= 1) {
    //         name1.setText(laptops.get(0).getName());
    //         cost1.setText(Double.toString(laptops.get(0).getCost()));
    //         ram1.setText(Integer.toString(laptops.get(0).getRam()));
    //         storage1.setText(Integer.toString(laptops.get(0).getStorage()));
    //         processor1.setText(laptops.get(0).getProcessor());
    //     } else {
    //         name1.setText("");
    //         cost1.setText("");
    //         ram1.setText("");
    //         storage1.setText("");
    //         processor1.setText("");
    //     }
    
    //     if (laptops.size() >= 2) {
    //         name11.setText(laptops.get(1).getName());
    //         if (cost11 != null) {
    //             cost11.setText(Double.toString(laptops.get(1).getCost()));
    //         }
    //         if (ram11 != null) {
    //             ram11.setText(Integer.toString(laptops.get(1).getRam()));
    //         }
    //         if (storage11 != null) {
    //             storage11.setText(Integer.toString(laptops.get(1).getStorage()));
    //         }
    //         if (processor11 != null) {
    //             processor11.setText(laptops.get(1).getProcessor());
    //         }
    //     } else {
    //         name11.setText("");
    //         if (cost11 != null) {
    //             cost11.setText("");
    //         }
    //         if (ram11 != null) {
    //             ram11.setText("");
    //         }
    //         if (storage11 != null) {
    //             storage11.setText("");
    //         }
    //         if (processor11 != null) {
    //             processor11.setText("");
    //         }
    //     }
    
    //     if (laptops.size() >= 3) {
    //         name111.setText(laptops.get(2).getName());
    //         if (cost111 != null) {
    //             cost111.setText(Double.toString(laptops.get(2).getCost()));
    //         }
    //         if (ram111 != null) {
    //             ram111.setText(Integer.toString(laptops.get(2).getRam()));
    //         }
    //         if (storage111 != null) {
    //             storage111.setText(Integer.toString(laptops.get(2).getStorage()));
    //         }
    //         if (processor111 != null) {
    //             processor111.setText(laptops.get(2).getProcessor());
    //         }
    //     } else {
    //         name111.setText("");
    //         if (cost111 != null) {
    //             cost111.setText("");
    //         }
    //         if (ram111 != null) {
    //             ram111.setText("");
    //         }
    //         if (storage111 != null) {
    //             storage111.setText("");
    //         }
    //         if (processor111 != null) {
    //             processor111.setText("");
    //         }
    //     }
    // }


}
