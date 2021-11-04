package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public interface TrafficLight {


     void sequence() throws InterruptedException, LineUnavailableException;

     TrafficLightStates getTrafficLightStates();

     void setGreenPhaseDuration(int duration);

     default void nightMode() {
         TrafficLightStates night = TrafficLightStates.YELLOW_BLINKING;
     }
}
