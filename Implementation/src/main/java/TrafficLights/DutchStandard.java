package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public class DutchStandard implements TrafficLight{

    private TrafficLightStates state = TrafficLightStates.RED;
    int greenPhaseDuration = 30;

    @Override
    public void sequence() throws InterruptedException, LineUnavailableException {
        TrafficLight.super.sequence();
    }

    @Override
    public TrafficLightStates getTrafficLightStates() {
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
}
