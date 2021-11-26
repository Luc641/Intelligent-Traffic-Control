package GUI;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

import Intersection.Intersection;
import TrafficLights.TrafficLight;
import TrafficLights.TrafficLightFactory;
import TrafficLights.TrafficLightStates;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class StandardCrossingController extends Application {



    @FXML
    private Circle pedestrianGreenS2;

    @FXML
    private Circle pedestrianRedS2;

    @FXML
    private Circle pedestrianGreenW2;

    @FXML
    private Circle pedestrianRedW2;

    @FXML
    private Circle pedestrianGreenE2;

    @FXML
    private Circle pedestrianRedE2;

    @FXML
    private Circle pedestrianGreenN2;

    @FXML
    private Circle pedestrianRedN2;

    @FXML
    private Circle pedestrianGreenW1;

    @FXML
    private Circle pedestrianRedW1;

    @FXML
    private Circle pedestrianGreenN1;

    @FXML
    private Circle pedestrianRedN1;

    @FXML
    private Circle pedestrianGreenE1;

    @FXML
    private Circle pedestrianRedE1;

    @FXML
    private Circle pedestrianGreenS1;

    @FXML
    private Circle pedestrianRedS1;

    @FXML
    private Circle trafficRedWest;

    @FXML
    private Circle trafficYellowWest;

    @FXML
    private Circle trafficGreenWest;

    @FXML
    private Circle trafficRedSouth;

    @FXML
    private Circle trafficYellowSouth;

    @FXML
    private Circle trafficGreenSouth;

    @FXML
    private Circle trafficRedEast;

    @FXML
    private Circle trafficYellowEast;

    @FXML
    private Circle trafficGreenEast;

    @FXML
    private Circle trafficRedNorth;

    @FXML
    private Circle trafficYellowNorth;

    @FXML
    private Circle trafficGreenNorth;

    @FXML
    private Button button;

    @FXML
    void switchToSecondary(ActionEvent event) {

    }

    @FXML
    void initialize() {
        setColorWhite(trafficGreenSouth, trafficYellowSouth, trafficRedSouth, trafficGreenNorth, trafficYellowNorth, trafficRedNorth);
        setColorWhite(trafficRedEast, trafficYellowEast, trafficRedEast, trafficRedWest, trafficYellowWest, trafficGreenWest);
        changeColor();

    }


    private void setColorWhite(Circle trafficGreenSouth, Circle trafficYellowSouth, Circle trafficRedSouth, Circle trafficGreenNorth, Circle trafficYellowNorth, Circle trafficRedNorth) {
        trafficGreenSouth.setFill(Paint.valueOf("White"));
        trafficYellowSouth.setFill(Paint.valueOf("White"));
        trafficRedSouth.setFill(Paint.valueOf("White"));
        trafficGreenNorth.setFill(Paint.valueOf("White"));
        trafficYellowNorth.setFill(Paint.valueOf("White"));
        trafficRedNorth.setFill(Paint.valueOf("White"));
    }

    public void changeColor (){
        if (Objects.equals(TrafficLightStates.values(), "RED")){
            trafficRedSouth.setFill(Paint.valueOf("Red"));
            trafficRedNorth.setFill(Paint.valueOf("Red"));
            trafficRedEast.setFill(Paint.valueOf("RED"));
            trafficRedWest.setFill(Paint.valueOf("RED"));
        } else if (Objects.equals(TrafficLightStates.values(), "YELLOW")){
            trafficYellowEast.setFill(Paint.valueOf("Yellow"));
            trafficYellowWest.setFill(Paint.valueOf("Yellow"));
            trafficYellowSouth.setFill(Paint.valueOf("Yellow"));
            trafficYellowNorth.setFill(Paint.valueOf("Yellow"));
        }
        trafficGreenSouth.setFill(Paint.valueOf("Green"));
        trafficGreenNorth.setFill(Paint.valueOf("Green"));
        trafficGreenEast.setFill(Paint.valueOf("Green"));
        trafficGreenWest.setFill(Paint.valueOf("Green"));
    }

    public static void main(String[] args) {
        launch();
    }

    private static Scene scene;


    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("standardCrossing"));

        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    protected static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StandardCrossingController.class.getResource(fxml + ".fxml"));
        System.out.println(fxml);
        // Set the controller depending on which view we load / which controller we need.
        return fxmlLoader.load();
    }
}
