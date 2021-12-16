//import Intersection.Intersection;
//import TrafficLights.*;
//
//import javax.sound.sampled.LineUnavailableException;
//
//public class Main {
//    public static void main(String[] args) {
//        GermanStandard germanStandard = new GermanStandard("German");
//        DutchStandard dutchStandard = new DutchStandard("Dutch", TrafficLightStatesDutch.YELLOW);
//        PedestrianStandard pedestrianStandard = new PedestrianStandard("Pedestrian");
//        var intersectionGerman = new Intersection(TrafficLightFactory.GERMAN);
//        var intersectionDutch = new Intersection(TrafficLightFactory.DUTCH);
//        var intersectionPedestrian = new Intersection(TrafficLightFactory.PEDESTRIAN);
//
//        for (int i = 0; i < 10; i++) {
//            intersectionDutch.sequence();
//        }
//    }
//}