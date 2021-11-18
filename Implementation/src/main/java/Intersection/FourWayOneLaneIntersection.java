package Intersection;
import TrafficLights.*;


import java.util.HashMap;


public class FourWayOneLaneIntersection implements Intersection {

    HashMap<String,TrafficLight> trafficLights = new HashMap<>();

    public FourWayOneLaneIntersection(TrafficLightFactory type, int duration) {
        trafficLights.put("n",type.getTrafficLight("n"));
        trafficLights.put("e",type.getTrafficLight("e"));
        trafficLights.put("s",type.getTrafficLight("s"));
        trafficLights.put("w",type.getTrafficLight("w"));
        setGreenPhaseDuration(duration);
    }

    public FourWayOneLaneIntersection(TrafficLightFactory type) {
        trafficLights.put("n",type.getTrafficLight("n"));
        trafficLights.put("e",type.getTrafficLight("e"));
        trafficLights.put("s",type.getTrafficLight("s"));
        trafficLights.put("w",type.getTrafficLight("w"));
    }

    @Override
    public HashMap<String, TrafficLight> getTrafficLights() {
        return trafficLights;
    }
}