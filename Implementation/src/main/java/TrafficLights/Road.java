package TrafficLights;

public class Road {
    TrafficLight trafficLightRight;
    TrafficLight trafficLightLeft;

    public Road(Standards standards) {
        if (standards.equals(Standards.GERMAN)) {
            trafficLightLeft = new GermanStandard();
            trafficLightRight = new GermanStandard();
        }if (standards.equals(Standards.DUTCH)) {
            trafficLightLeft = new DutchStandard();
            trafficLightRight = new DutchStandard();
        }if (standards.equals(Standards.PEDESTRIAN)) {
            trafficLightLeft = new PedestrianLightStandard();
            trafficLightRight = new PedestrianLightStandard();
        }if (standards.equals(Standards.GERMAN_ARROW_LEFT)) {
            trafficLightLeft = new GermanStandard();
            trafficLightRight = new GermanStandard();
        }if (standards.equals(Standards.GERMAN_ARROW_RIGHT)) {
            trafficLightLeft = new GermanStandard();
            trafficLightRight = new GermanStandard();
        }
    }
}
