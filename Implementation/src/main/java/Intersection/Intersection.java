package Intersection;

import TrafficLights.TrafficLight;
import TrafficLights.TrafficLightStates;

import java.util.HashMap;
import java.util.List;

public interface Intersection {

    HashMap<String, TrafficLight> getTrafficLights();

    default void setGreenPhaseDuration(int duration){
        getTrafficLights().forEach((k,v) -> v.setGreenPhaseDuration(duration));
    };

    default boolean check(List<String> trafficLights){
        boolean re = false;
        for(String s: trafficLights){
            if(getTrafficLights().get(s).getTrafficLightState()==TrafficLightStates.RED){
                re = true;
            }
            else {
                return false;
            }
        }
        return re;
    }

    default void sequence(String s1, String s2) throws InterruptedException {
        getTrafficLights().get(s1).startThread();
        getTrafficLights().get(s2).startThread();
        getTrafficLights().get(s1).waitUntilFinished();
        getTrafficLights().get(s2).waitUntilFinished();
        Thread.sleep(2000);
    }

    default void start() throws InterruptedException{
        if (check("n")&&check("n")){
            sequence("e","w");
        }if (check("e")&&check("w")) {
            sequence("n","s");
        }
        start();
    };

}
