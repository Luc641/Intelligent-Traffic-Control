package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public class DutchStandard implements TrafficLight{
    
    TrafficLightStates state = TrafficLightStates.RED;

    @Override
    public void sequence() throws InterruptedException, LineUnavailableException {
        TrafficLight.super.sequence();
    }

    @Override
    public TrafficLightStates getTrafficLightStates() {
        return state;
    }

    @Override
    public void setTrafficLightStates(TrafficLightStates state) {

    }

    @Override
    public void setGreenPhaseDuration(int duration) {
    }

    @Override
    public void nightMode() {
        TrafficLight.super.nightMode();
    }
}
