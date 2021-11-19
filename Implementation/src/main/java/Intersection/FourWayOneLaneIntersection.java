package Intersection;
import TrafficLights.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class FourWayOneLaneIntersection implements Intersection {

    private HashMap<String,TrafficLight> trafficLights = new HashMap<>();
    private final List<String> setOne = Arrays.asList("n","s");
    private final List<String> setTwo = Arrays.asList("e","w");
    private HashMap<Integer,List<String>> sequence = new HashMap<>();


    public FourWayOneLaneIntersection(TrafficLightFactory type, int duration) {
        trafficLights.put("n",type.getTrafficLight("n"));
        trafficLights.put("e",type.getTrafficLight("e"));
        trafficLights.put("s",type.getTrafficLight("s"));
        trafficLights.put("w",type.getTrafficLight("w"));
        setGreenPhaseDuration(duration);
        sequence.put(1,setOne);
        sequence.put(2,setTwo);

    }

    public FourWayOneLaneIntersection(TrafficLightFactory type) {
        trafficLights.put("n",type.getTrafficLight("n"));
        trafficLights.put("e",type.getTrafficLight("e"));
        trafficLights.put("s",type.getTrafficLight("s"));
        trafficLights.put("w",type.getTrafficLight("w"));
        sequence.put(1,setOne);
        sequence.put(2,setTwo);
    }

    @Override
    public HashMap<String, TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    @Override
    public HashMap<Integer, List<String>> getSequence() {
        return sequence;
    }
}