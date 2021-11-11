package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public class DutchStandard implements TrafficLight{
    int index;
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
    public void setGreenPhaseDuration(int duration) {
    }
}
