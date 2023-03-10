package BusinessLogic.TrafficLights;

import Entities.State;

public class DutchStandard extends AbstractTrafficLight {
    //Constructor for the Standard
    private TrafficLightStatesDutch state;

    public DutchStandard(String name) {
        this(name, TrafficLightStatesDutch.RED);
    }

    public DutchStandard(String name, State initialState) {
        super(name, initialState);
    }

}
