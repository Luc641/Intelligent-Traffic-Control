package TrafficLights;

import java.util.concurrent.TimeUnit;

public class GermanStandard implements TrafficLight {

    public TrafficLightStates state = TrafficLightStates.RED;
    private int greenPhaseDuration = 45;


    @Override
    public TrafficLightStates getTrafficLightStates() {
        return state;
    }

    @Override
    public void setGreenPhaseDuration(int duration) {
        this.greenPhaseDuration = duration;
    }

    @Override
    public void sequence() throws InterruptedException {
        state = TrafficLightStates.RED_YELLOW;
        TimeUnit.SECONDS.sleep(2);
        state = TrafficLightStates.GREEN;
        TimeUnit.SECONDS.sleep(greenPhaseDuration);
        state = TrafficLightStates.YELLOW;
        TimeUnit.SECONDS.sleep(3);
        state = TrafficLightStates.RED;
    }



}
