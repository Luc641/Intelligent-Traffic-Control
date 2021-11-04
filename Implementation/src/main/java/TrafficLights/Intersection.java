package TrafficLights;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    Road horizontal;
    Road vertical;

    public Intersection(Standards standards) {
        if (standards.equals(Standards.GERMAN)) {
            horizontal = new Road(standards);
            vertical = new Road(standards);
        } else if (standards.equals(Standards.DUTCH)) {
            horizontal = new Road(standards);
            vertical = new Road(standards);
        } else if (standards.equals(Standards.DUTCH)) {
            horizontal = new Road(standards);
            vertical = new Road(standards);
        }
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