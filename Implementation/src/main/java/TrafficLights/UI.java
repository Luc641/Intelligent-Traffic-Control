package TrafficLights;

import com.sun.glass.ui.Application;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class UI  {
    @FXML
    private Circle circleRed;
    private Circle circleYellow;
    private Circle circleGreen;

@FXML
    public void start(Stage primaryStage){
    changeColour();
    }

private void changeColour(TrafficLightStates trafficLightStates){
    if (trafficLightStates.equals(TrafficLightStates.RED)){
    circleRed.setFill(Color.RED);
    circleYellow.setFill(Color.WHITE);
    circleGreen.setFill(Color.WHITE);
    }else if (trafficLightStates.equals(TrafficLightStates.YELLOW)){
        circleRed.setFill(Color.WHITE);
        circleYellow.setFill(Color.YELLOW);
        circleGreen.setFill(Color.WHITE);
    }else if (trafficLightStates.equals(TrafficLightStates.GREEN)){
        circleRed.setFill(Color.WHITE);
        circleYellow.setFill(Color.WHITE);
        circleGreen.setFill(Color.GREEN);
    }


}
    public static void main(String[] args) {
        launch(args);
    }

}
