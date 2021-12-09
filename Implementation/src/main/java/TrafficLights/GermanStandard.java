package TrafficLights;

public class GermanStandard extends AbstractTrafficLight {

    private TrafficLightStatesGerman state;

    public GermanStandard(String name, State initialState) {
        super(name, initialState);
    }

    public GermanStandard(String name) {
        this(name, TrafficLightStatesGerman.GREEN);
    }
}
