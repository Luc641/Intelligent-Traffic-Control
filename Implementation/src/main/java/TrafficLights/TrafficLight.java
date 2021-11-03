package TrafficLights;

public interface TrafficLight {

    public void sequnce() throws InterruptedException;

    public TrafficLightStates getTrafficLightStates();

    public void setGreenphaseDuration(int duration);
}
