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
        scene = new Scene(loadFXML("Front"));
        stage.setScene(scene);
        stage.setResizable(false);
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

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificationFilter.fxml"));

        Parent root = loader.load();
        Stage stage = new Stage();
        scene= new Scene(root);
        stage.setTitle("Specification Filter");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void showAdditionalFeature() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdditionalFeature.fxml"));
        Parent root = loader.load();
        
        Stage stage = App.getStage();
        stage.setTitle("Innovative Features");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    protected void showPortability() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Portability.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Portability");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    protected void showHighEndLaptopRecommendations() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HighEndLaptopRecommendations.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("High End Laptop Recommendations");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    protected void showProgramTailored() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ProgramTailored.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Program Tailored");
        stage.setScene(new Scene(root));
        stage.show();
    }


    @FXML
    protected void showCostSavingAnalysis() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CostSavingAnalysis.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Cost Saving Analysis");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    protected void showLifespanEstimation() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LifespanEstimation.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Lifespan Estimation");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    protected void showComparison() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Comparison.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Comparison");
        stage.setScene(new Scene(root));
        stage.show();
    }

}