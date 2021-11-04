package TrafficLights;

public class Road {
    TrafficLight trafficLightRight;
    TrafficLight trafficLightLeft;

    public Road(Standards standards) {
       trafficLightRight = standards.getTrafficLight();
       trafficLightLeft = standards.getTrafficLight();
    }
}
