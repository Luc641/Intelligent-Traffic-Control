package Intersection;

import TrafficLights.TrafficLight;
import TrafficLights.TrafficLightStates;

import java.util.HashMap;

public interface Intersection {

    HashMap<String, TrafficLight> getTrafficLights();

    default void setGreenPhaseDuration(int duration){
        getTrafficLights().forEach((k,v) -> v.setGreenPhaseDuration(duration));
    };

    default boolean check(String s1, String s2){
        return getTrafficLights().get(s1).getTrafficLightState()== TrafficLightStates.RED
                && getTrafficLights().get(s2).getTrafficLightState()==TrafficLightStates.RED;
    }

    default void sequence(String s1, String s2) throws InterruptedException {
        getTrafficLights().get(s1).startThread();
        getTrafficLights().get(s2).startThread();
        getTrafficLights().get(s1).waitUntilFinished();
        getTrafficLights().get(s2).waitUntilFinished();
        Thread.sleep(2000);
    }

    default void start() throws InterruptedException{
        if (check("n","s")){
            sequence("e","w");
        }if (check("e","w")) {
            sequence("n","s");
        }
        start();
    };

}
