package TrafficLights;

public class Road {
    private TrafficLight trafficLightRight;
    private TrafficLight trafficLightLeft;

    public Road(Standards standards) {
       trafficLightRight = standards.getTrafficLight();
       trafficLightLeft = standards.getTrafficLight();
    }

    public TrafficLight getTrafficLightRight() {
        return trafficLightRight;
    }

    public TrafficLight getTrafficLightLeft() {
        return trafficLightLeft;
    }
}
