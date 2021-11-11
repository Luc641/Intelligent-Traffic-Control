package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public class NightMode implements TrafficLight{

    public TrafficLightStates state = TrafficLightStates.YELLOW_BLINKING;

    @Override
    public void sequence() throws InterruptedException, LineUnavailableException {
    TrafficLight.super.sequence();
    }

    @Override
    public TrafficLightStates getTrafficLightStates() {
        return state;
    }

    @Override
    public void setGreenPhaseDuration(int duration) {

    }
}

