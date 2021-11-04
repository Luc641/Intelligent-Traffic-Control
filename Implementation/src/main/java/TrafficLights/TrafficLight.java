package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public interface TrafficLight {

     int getIndex();

     void sequence() throws InterruptedException, LineUnavailableException;

     TrafficLightStates getTrafficLightStates();

     void setGreenPhaseDuration(int duration);
}
