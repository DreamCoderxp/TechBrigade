package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;

    /**
     *
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        App.stage = stage;
        scene = new Scene(loadFXML("SpecificationFilter"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return stage;
    }

    @FXML
    public void showSpecFilter() throws IOException {
        // Parent root =
        // FXMLLoader.load(getClass().getResource("HighEndLaptopRecommendations.fxml"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificationFilter.fxml"));

        Parent root = loader.load();
        SpecificationController controller = loader.getController();
        // controller.setscene(scene);

        Stage stage = new Stage();
        scene= new Scene(root,1500,1500);
        stage.setTitle("Specification Filter");
        stage.setScene(scene);
       // stage.setResizable(true);
        stage.show();
    }
}