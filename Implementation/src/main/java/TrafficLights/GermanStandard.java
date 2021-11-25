package TrafficLights;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import javax.sound.sampled.LineUnavailableException;
import java.util.concurrent.TimeUnit;

public class GermanStandard implements TrafficLight {

    private TrafficLightStates state = TrafficLightStates.RED;
    private int greenPhaseDuration = 30;
    private Thread thread;
    private String name;

    public GermanStandard(String name) {
        this.name = name;
    }

    @Override
    public void sequence(){
        try {
            setTrafficLightState(TrafficLightStates.RED_YELLOW);
            TimeUnit.SECONDS.sleep(2);
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
        System.out.println(name+": "+state);
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

    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
}
