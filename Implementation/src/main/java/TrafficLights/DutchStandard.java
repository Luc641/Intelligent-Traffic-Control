package TrafficLights;

import java.util.concurrent.TimeUnit;

public class DutchStandard extends AbstractTrafficLight {

    private TrafficLightStatesDutch state;

    public DutchStandard(String name, State initialState) {
        super(name,initialState);
    }

    public DutchStandard(String name) {
        this(name, TrafficLightStatesDutch.GREEN);
    }
}
