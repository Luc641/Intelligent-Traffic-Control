package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public interface TrafficLight {

     void sequence() throws InterruptedException, LineUnavailableException;

     TrafficLightStates getTrafficLightStates();

     void setGreenPhaseDuration(int duration);
}
