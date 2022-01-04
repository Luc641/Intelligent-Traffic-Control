package BusinessLogic.Intersection;

import BusinessLogic.TrafficLights.PedestrianStandard;
import BusinessLogic.TrafficLights.TrafficLightFactory;
import Entities.Cycle;

import java.beans.PropertyChangeSupport;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;


public class Intersection implements Cycle {

    private PropertyChangeSupport support;
    private final ForkJoinPool forkJoinPool = new ForkJoinPool(2);
    Road horizontal;
    Road vertical;


    public Intersection(TrafficLightFactory trafficLightFactory) {
        // Create traffic lights for the horizontal road.
        var first = trafficLightFactory.getTrafficLight("First");
        var second = trafficLightFactory.getTrafficLight("Second");
        var pedFirst = new PedestrianStandard("Horizontal Ped");

        // Create traffic lights for the vertical road with inverse of the horizontal road.
        var inverse = first.getCurrentState().inverse();
        var third = trafficLightFactory.getTrafficLight("Third", inverse);
        var fourth = trafficLightFactory.getTrafficLight("Fourth", inverse);
        var pedSecond = new PedestrianStandard("Vertical Ped");

        horizontal = new Road("Horizontal", first, second, pedFirst);
        vertical = new Road("Vertical", third, fourth, pedSecond);
    }

// use fork join pools to cycle to the whole intersection of 2 roads
    public void sequence() {
        forkJoinPool.submit(horizontal::advanceOnce);
        forkJoinPool.submit(vertical::advanceOnce);
        //noinspection ResultOfMethodCallIgnored
        forkJoinPool.awaitQuiescence(1, TimeUnit.MINUTES);
        System.out.println("--------");
    }

    @Override
    public void cycle() {
        sequence();
    }
}
