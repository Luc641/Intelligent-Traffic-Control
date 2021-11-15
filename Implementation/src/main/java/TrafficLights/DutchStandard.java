package TrafficLights;

import javax.sound.sampled.LineUnavailableException;

public class DutchStandard implements TrafficLight{

    private TrafficLightStates state = TrafficLightStates.RED;
    int greenPhaseDuration = 30;
    private Thread thread;
    private String name;

    public DutchStandard(String name) {
        this.name = name;
    }


    @Override
    public void sequence(){
        try {
            TrafficLight.super.sequence();
        } catch (InterruptedException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    @Override
    public TrafficLightStates getTrafficLightState() {
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
    public void startThread() {
        setThread(new Thread(this::sequence));
        thread.start();
    }

    @Override
    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public Thread getThread() {
        return thread;
    }


}
