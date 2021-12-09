package TrafficLights;

public class GermanStandard extends AbstractTrafficLight {

    private TrafficLightStatesGerman state;
    private final int greenPhaseDuration = 5;


    public GermanStandard(String name, State initialState) {
        super(name, initialState);
    }

    public GermanStandard(String name) {
        this(name, TrafficLightStatesGerman.GREEN);
    }
}
