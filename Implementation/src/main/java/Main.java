import TrafficLights.*;
import Intersection.*;
import javax.sound.sampled.LineUnavailableException;

public class Main {
    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        Intersection test = IntersectionFactory.FourWayOneLane.getIntersection(TrafficLightFactory.GERMAN,2);
        test.start();
    }
}