package TrafficLights;

public enum Standards {

    GERMAN(new GermanStandard()),
    DUTCH(new DutchStandard()),
    PEDESTRIAN(new PedestrianLightStandard()),
    GERMAN_ARROW_LEFT(new GermanStandard()),
    GERMAN_ARROW_RIGHT(new GermanStandard());

    private  final  TrafficLight trafficLight;

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    Standards(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
}
