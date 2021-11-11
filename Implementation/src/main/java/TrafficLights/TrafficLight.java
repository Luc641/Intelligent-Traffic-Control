package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public interface TrafficLight {

    default void sequence() throws InterruptedException, LineUnavailableException {

        TrafficLightStates trafficLightStates = TrafficLightStates.GREEN;
        System.out.println("" + trafficLightStates);
        TimeUnit.SECONDS.sleep(45);
        trafficLightStates = TrafficLightStates.YELLOW;
        System.out.println("" + trafficLightStates);
        TimeUnit.SECONDS.sleep(3);
        trafficLightStates = TrafficLightStates.RED;
        System.out.println("" + trafficLightStates);
    }

    TrafficLightStates getTrafficLightStates();

    void setTrafficLightStates(TrafficLightStates state);

    void setGreenPhaseDuration(int duration);

    default void nightMode() {
        setTrafficLightStates(TrafficLightStates.YELLOW_BLINKING);
    }
}
