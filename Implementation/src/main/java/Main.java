import Intersection.Intersection;
import TrafficLights.DutchStandard;
import TrafficLights.GermanStandard;
import TrafficLights.PedestrianStandard;
import TrafficLights.TrafficLightFactory;

import javax.sound.sampled.LineUnavailableException;

public class Main {
    public static void main(String[] args) {
        GermanStandard germanStandard = new GermanStandard("German");
        DutchStandard dutchStandard = new DutchStandard("Dutch");
        PedestrianStandard pedestrianStandard = new PedestrianStandard("Pedestrian");
        var intersectionGerman = new Intersection(TrafficLightFactory.GERMAN);
        var intersectionDutch = new Intersection(TrafficLightFactory.DUTCH);
        var intersectionPedestrian = new Intersection(TrafficLightFactory.PEDESTRIAN);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            intersectionPedestrian.sequence();
        }
    }
}