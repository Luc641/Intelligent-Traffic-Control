package TrafficLights;

public class NightMode implements TrafficLight{

    public TrafficLightStates state = TrafficLightStates.YELLOW_BLINKING;

    @Override
    public void sequence() throws InterruptedException {

    }

    @Override
    public TrafficLightStates getTrafficLightStates() {
        return state;
    }

    @Override
    public void setGreenPhaseDuration(int duration) {

    }
}

