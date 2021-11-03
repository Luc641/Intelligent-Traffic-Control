package TrafficLights;

public interface TrafficLight {

     void sequence() throws InterruptedException;

     TrafficLightStates getTrafficLightStates();

     void setGreenPhaseDuration(int duration);
}
