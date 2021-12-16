package TrafficLights;

public class DutchStandard extends AbstractTrafficLight {
    //Constructor for the Standard
    private TrafficLightStatesDutch state;

    public DutchStandard(String name) {
        this(name, TrafficLightStatesDutch.GREEN);
    }

    public DutchStandard(String name, State initialState) {
        super(name, initialState);
    }

}
