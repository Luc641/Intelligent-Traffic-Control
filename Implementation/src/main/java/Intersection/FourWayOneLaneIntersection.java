package Intersection;
import TrafficLights.*;

import java.util.*;


public class FourWayOneLaneIntersection implements Intersection {

    private HashMap<String,TrafficLight> trafficLights = new HashMap<>();
    private final List<String> setOne = Arrays.asList("North","South","PedEast","PedWest");
    private final List<String> setTwo = Arrays.asList("East","West","PedNorth","PedSouth");
    private HashMap<Integer,List<String>> sequence = new HashMap<>();
    private Thread pedThread;

    public FourWayOneLaneIntersection(TrafficLightFactory type, int duration) {
        trafficLights.put("North",type.getTrafficLight("North"));
        trafficLights.put("East",type.getTrafficLight("East"));
        trafficLights.put("South",type.getTrafficLight("South"));
        trafficLights.put("West",type.getTrafficLight("West"));
        trafficLights.put("PedWest",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedWest"));
        trafficLights.put("PedEast",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedEast"));
        trafficLights.put("PedSouth",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedSouth"));
        trafficLights.put("PedNorth",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedNorth"));
        setGreenPhaseDuration(duration);
        sequence.put(1,setOne);
        sequence.put(2,setTwo);

    }

    public FourWayOneLaneIntersection(TrafficLightFactory type) {
        trafficLights.put("North",type.getTrafficLight("North"));
        trafficLights.put("East",type.getTrafficLight("East"));
        trafficLights.put("South",type.getTrafficLight("South"));
        trafficLights.put("West",type.getTrafficLight("West"));
        trafficLights.put("PedWest",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedWest"));
        trafficLights.put("PedEast",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedEast"));
        trafficLights.put("PedSouth",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedSouth"));
        trafficLights.put("PedNorth",TrafficLightFactory.PEDESTRIAN.getTrafficLight("PedNorth"));
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

    @Override
    public void startThread() {
        pedThread = new Thread(this::pedThread);
        pedThread.start();
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the {@code notifyObservers}
     */
    @Override
    public void update(Observable o, Object arg) {
        
    }
}