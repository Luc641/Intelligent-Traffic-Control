package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public interface TrafficLight{

    default void sequence() throws InterruptedException, LineUnavailableException {
        setTrafficLightState(TrafficLightStates.GREEN);
        TimeUnit.SECONDS.sleep(getGreenPhaseDuration());
        setTrafficLightState(TrafficLightStates.YELLOW);
        TimeUnit.SECONDS.sleep(3);
        setTrafficLightState(TrafficLightStates.RED);
    }

    TrafficLightStates getTrafficLightState();

    void setTrafficLightState(TrafficLightStates state);

    void setGreenPhaseDuration(int duration);

    int getGreenPhaseDuration();

    void startThread();

    void setThread(Thread thread);

    default void waitUntilFinished() throws InterruptedException {
        getThread().join();
    }

    Thread getThread();

    default void nightMode() {
        setTrafficLightState(TrafficLightStates.YELLOW_BLINKING);
    }
}
