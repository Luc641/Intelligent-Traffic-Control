package TrafficLights;

public enum TrafficLightStates implements Switchable<State> {
    RED,
    YELLOW,
    GREEN,
    RED_YELLOW,
    YELLOW_BLINKING,
    GREEN_ARROW,
    YELLOW_ARROW,
    RED_ARROW
}

