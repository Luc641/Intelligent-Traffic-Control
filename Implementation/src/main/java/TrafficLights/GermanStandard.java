package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public class GermanStandard implements TrafficLight {

    private TrafficLightStates state = TrafficLightStates.RED;
    private int greenPhaseDuration = 30;

    @Override
    public TrafficLightStates getTrafficLightState() {
        return state;
    }

    @Override
    public void setTrafficLightState(TrafficLightStates state) {
        this.state = state;
        System.out.println(state);
    }

    @Override
    public void setGreenPhaseDuration(int duration) {
        this.greenPhaseDuration = duration;
    }

    @Override
    public int getGreenPhaseDuration() {
        return greenPhaseDuration;
    }

    @Override
    public void nightMode() {
        TrafficLight.super.nightMode();
    }

    @Override
    public void sequence() throws InterruptedException, LineUnavailableException {
        setTrafficLightState(TrafficLightStates.RED_YELLOW);
        TimeUnit.SECONDS.sleep(2);
        TrafficLight.super.sequence();
    }
}
