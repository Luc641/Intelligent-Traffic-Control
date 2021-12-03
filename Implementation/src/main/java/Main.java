import Intersection.Intersection;
import TrafficLights.GermanStandard;
import TrafficLights.TrafficLightFactory;
import TrafficLights.TrafficLightStateGerman;

import javax.sound.sampled.LineUnavailableException;

public class Main {
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        GermanStandard germanStandard = new GermanStandard("German");
        var intersection = new Intersection(TrafficLightFactory.GERMAN);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            intersection.sequence();
        }
    }
}