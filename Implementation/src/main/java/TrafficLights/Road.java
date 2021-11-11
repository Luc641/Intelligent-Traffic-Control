package TrafficLights;

public class Road {
    private TrafficLight trafficLightRight;
    private TrafficLight trafficLightLeft;

    public Road(Standards standard) {
       trafficLightRight = standard.getTrafficLight();
       trafficLightLeft = standard.getTrafficLight();
    }

    public TrafficLight getTrafficLightRight() {
        return trafficLightRight;
    }

    public TrafficLight getTrafficLightLeft() {
        return trafficLightLeft;
    }
}
