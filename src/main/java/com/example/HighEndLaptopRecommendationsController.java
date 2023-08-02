package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HighEndLaptopRecommendationsController {
    @FXML
    private ListView<HBox> listView;

    public void initialize() {
        // define high-end highEndLaptops
        List<Laptop> Laptops = Arrays.asList(
                new Laptop("Alienware m18", "Intel", "13th Generation Core i9-13980HX (E-Cores upto 4.00 Ghz P-cores up to 5.60Ghz", "Nvidia GeForce RTX 4090 16GB GDDR6", 64, 4096, "SSD", 8.9, "18 inch WQXGA (2560x1600) 240Hz IPS HDR 400 with 100% sRGB", "3xUSB3.2Gen1 2xThunderbolt4Gen2(type-C) ", 19888, 4199.99, "https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/alienware-notebooks/alienware-m18-intel/media-gallery/hd/notebook-alienware-m18-hd-perkey-intel-black-gallery-4.psd?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=594&qlt=100,1&resMode=sharp2&size=594,402&chrss=full"),
                new Laptop("Lenovo Legion Pro 7i", "Intel", "13th Generation Core i9-13900HX (E-cores up to 3.90Ghz P-cores up to 5.40Ghz)", "Nvidia GeForce RTX 4080 12GB GDDR6", 32, 2048, "SSD", 7.8, "16 inch QHD+(2560x1600) 165Hz IPS with 100$ DCI-P3", "1x3.5mm Headphone jack 1xHDMI2.1 1xEthernet 2xUBS-A3.2Gen1 1xUSB-C3.2Gen2",16688  , 4059.99, "https://p2-ofp.static.pub/fes/cms/2022/12/15/eb4g29yuhrl05jjd4so8yo96iafk5r384702.png"),
new Laptop("Asus ROG Zephyrus Duo 16", "AMD", "AMD Ryzen 9 7945HX (16 cores up to 4.60Ghz)", "Nvidia GeForce RTX 4090 16GB GDDR6", 32, 2048, "SSD", 7.3, "16 inch 2560x1600 240Hz Mini LED 100% DCI-P3 HDR10", "1x3.5mm Headphone jack 1xHDMI2.1 1xDisplayPort(with G-Sync) 1xEthernet 2xUBS-A3.2Gen1 2xUSB-C3.2Gen2", 17843, 5399.99, "https://laptopmedia.com/wp-content/uploads/2022/01/2-43.jpg")
        );

        // add highEndLaptops to list view
        for (Laptop Laptop : Laptops) {
            HBox hbox = new HBox(10);
            ImageView imageView = new ImageView(new Image(Laptop.getLink()));
            imageView.setFitHeight(100);
            imageView.setFitWidth(150);

            VBox vbox = new VBox(10);
            Label nameLabel = new Label("Name: " + Laptop.getName());
            nameLabel.setFont(new Font("Arial", 15));

            Label ramLabel = new Label("RAM: " + Laptop.getRam() + " GB");
            ramLabel.setFont(new Font("Arial", 12));

            Label storageLabel = new Label("Storage: " + Laptop.getStorage() + " GB");
            storageLabel.setFont(new Font("Arial", 12));

            Label cpuLabel = new Label("CPU: " + Laptop.getProcessor());
            cpuLabel.setFont(new Font("Arial", 12));

            Label gpuLabel = new Label("GPU: " + Laptop.getOs());
            gpuLabel.setFont(new Font("Arial", 12));

            Label geekbenchLabel = new Label("Geekbench Score: " + Laptop.getBenchmark());
            geekbenchLabel.setFont(new Font("Arial", 12));

            Label priceLabel = new Label("Price: $" + Laptop.getCost());
            priceLabel.setFont(new Font("Arial", 12));

            vbox.getChildren().addAll(nameLabel, ramLabel, storageLabel, cpuLabel, gpuLabel, geekbenchLabel, priceLabel);
            hbox.getChildren().addAll(imageView, vbox);
            listView.getItems().add(hbox);
        }
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
