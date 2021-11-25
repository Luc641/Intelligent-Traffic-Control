package Intersection;

import TrafficLights.TrafficLight;
import TrafficLights.TrafficLightStates;

import java.util.HashMap;
import java.util.List;
import java.util.Observer;


public interface Intersection extends Observer {

    HashMap<String, TrafficLight> getTrafficLights();

    HashMap<Integer,List<String>> getSequence();

    default void setGreenPhaseDuration(int duration){
        getTrafficLights().forEach((k,v)-> {
            if (!k.contains("Ped")) {
                v.setGreenPhaseDuration(duration);
            }
        });
    };

    default boolean check(List<String> set){
        boolean isRed = false;
        for(String s: set){
            if(getTrafficLights().get(s).getTrafficLightState()==TrafficLightStates.RED){
                isRed = true;
            }
            else {
                return false;
            }
        }
        return isRed;
    }

    default void sequence(List<String> set) throws InterruptedException {
        for(String s: set){
            getTrafficLights().get(s).startThread();
        }
        for(String s: set){
            getTrafficLights().get(s).waitUntilFinished();
        }
        Thread.sleep(2000);
    }

    default void start() throws InterruptedException{
        for(int i = 1; getSequence().size() >= i; i++) {
            if (check(getSequence().get(i))){
                if (i>=getSequence().size()){
                    sequence(getSequence().get(1));
                }else{
                    sequence(getSequence().get(i+1));
                }
            }
        }
        start();
    };

    public void startThread();

    default void pedThread(){

    }
}
