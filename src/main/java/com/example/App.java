/**
 * The App class is the main class of the application. It extends the JavaFX Application class and provides the entry point for the application.
 */
package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    private static Stage stage;

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

    /**
     * The showSpecFilter method loads and shows the SpecificationFilter.fxml file in the main stage.
     */
    @FXML
    public void showSpecFilter() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpecificationFilter.fxml"));

        Parent root = loader.load();
        Stage stage = App.getStage();
        scene= new Scene(root);
        stage.setTitle("Specification Filter");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The showAdditionalFeature method loads and shows the AdditionalFeature.fxml file in the main stage.
     */
    @FXML
    protected void showAdditionalFeature() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdditionalFeature.fxml"));
        Parent root = loader.load();
        
        Stage stage = App.getStage();
        stage.setTitle("Innovative Features");
        stage.setScene(new Scene(root));
        stage.show();

    }

    /**
     * The showPortability method loads and shows the Portability.fxml file in the main stage.
     */
    @FXML
    protected void showPortability() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Portability.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Portability");
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * The showHighEndLaptopRecommendations method loads and shows the HighEndLaptopRecommendations.fxml file in the main stage.
     */
    @FXML
    protected void showHighEndLaptopRecommendations() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HighEndLaptopRecommendations.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("High End Laptop Recommendations");
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * The showProgramTailored method loads and shows the ProgramTailored.fxml file in the main stage.
     */
    @FXML
    protected void showProgramTailored() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ProgramTailored.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Program Tailored");
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * The showCostSavingAnalysis method loads and shows the CostSavingAnalysis.fxml file in the main stage.
     */
    @FXML
    protected void showCostSavingAnalysis() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CostSavingAnalysis.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Cost Saving Analysis");
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * The showLifespanEstimation method loads and shows the LifespanEstimation.fxml file in the main stage.
     */
    @FXML
    protected void showLifespanEstimation() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LifespanEstimation.fxml"));
        Parent root = loader.load();

        Stage stage = App.getStage();
        stage.setTitle("Lifespan Estimation");
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * The showComparison method loads and shows the Comparison.fxml file in the main stage.
     */
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