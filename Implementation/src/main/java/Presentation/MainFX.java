package Presentation;

import Intersection.Intersection;
import TrafficLights.GermanStandard;
import TrafficLights.TrafficLightFactory;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.sound.sampled.LineUnavailableException;

public class MainFX extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("standardCrossing"), 1000, 1000);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainFX.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void initiate(String[] args) {
        launch();

    }
}
