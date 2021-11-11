package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public class GermanStandard implements TrafficLight {

    public TrafficLightStates state = TrafficLightStates.RED;
    public final Standards standards = Standards.GERMAN;

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

    @Override
    public void sequence() throws InterruptedException, LineUnavailableException {
        state = TrafficLightStates.RED_YELLOW;
        TrafficLightStates.RED_YELLOW.printCurrent();
        TimeUnit.SECONDS.sleep(2);
        TrafficLight.super.sequence();
    }
}
