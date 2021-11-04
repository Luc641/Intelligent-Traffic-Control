package TrafficLights;

import javax.sound.sampled.LineUnavailableException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {
    ArrayList<TrafficLight> trafficLights = new ArrayList<>();

    public Intersection(Standards standards) {
        if (standards.equals(Standards.GERMAN)) {
            for (int i = 0; i < 4; i++) {
                trafficLights.add(new GermanStandard(i));
            }
        }
    }

    public List<TrafficLight> getTrafficLights() {
        return trafficLights;
    }
/*
    public void sequence() {
       trafficLights.stream()
                .filter(x -> x.getIndex()%2 == 0)
                .forEach(x -> {
                    try {
                        x.sequence();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    }
                });


        */
}