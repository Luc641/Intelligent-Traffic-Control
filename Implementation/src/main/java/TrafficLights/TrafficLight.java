package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public interface TrafficLight {

      default void sequence() throws InterruptedException, LineUnavailableException {

          TrafficLightStates trafficLightStates = TrafficLightStates.GREEN;
          TrafficLightStates.GREEN.printCurrent();
          TimeUnit.SECONDS.sleep(45);
          trafficLightStates = TrafficLightStates.YELLOW;
          TrafficLightStates.YELLOW.printCurrent();
          TimeUnit.SECONDS.sleep(3);
          trafficLightStates = TrafficLightStates.RED;
          TrafficLightStates.RED.printCurrent();
     }

     TrafficLightStates getTrafficLightStates();

     void setGreenPhaseDuration(int duration);

     default void nightMode() {
         TrafficLightStates night = TrafficLightStates.YELLOW_BLINKING;
     }
}
