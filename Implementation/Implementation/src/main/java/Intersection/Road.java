package Intersection;

import TrafficLights.AbstractTrafficLight;
import TrafficLights.PedestrianLightStandard;
import TrafficLights.State;

import java.beans.PropertyChangeSupport;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Road {

    private final AbstractTrafficLight pedestrianLight;
    private final AbstractTrafficLight trafficLightRight;
    private final AbstractTrafficLight trafficLightLeft;
    private final ForkJoinPool forkJoinPool = new ForkJoinPool(2);
    private final String name;
    private final PropertyChangeSupport support;

    public Road(String name, AbstractTrafficLight trafficLightRight, AbstractTrafficLight trafficLightLeft, PedestrianLightStandard pedestrianLight) {
        this.trafficLightRight = trafficLightRight;
        this.trafficLightLeft = trafficLightLeft;
        this.pedestrianLight = pedestrianLight;
        this.name = name;
        // Add listener for road changes.
        support = new PropertyChangeSupport(this);
        support.addPropertyChangeListener(pedestrianLight);
    }

    private State getTrafficLightState() {
        assert trafficLightLeft.getCurrentState() == trafficLightRight.getCurrentState();
        return trafficLightLeft.getCurrentState();
    }

    private Runnable wrapWithSleep(Runnable toWrap, int value, TimeUnit unit) {
        return () -> {
            toWrap.run();
            try {
                unit.sleep(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    void advanceOnce() {
        var old = getTrafficLightState();
        forkJoinPool.submit(wrapWithSleep(trafficLightRight::showCurrentSignal, 3, TimeUnit.SECONDS));
        forkJoinPool.submit(wrapWithSleep(trafficLightLeft::showCurrentSignal, 3, TimeUnit.SECONDS));
        //noinspection ResultOfMethodCallIgnored
        forkJoinPool.awaitQuiescence(1, TimeUnit.MINUTES);
        if (getTrafficLightState().toString().contains("RED")) {
            support.firePropertyChange("trafficLightStateChange", old, getTrafficLightState());
            System.out.println(pedestrianLight.getCurrentState());
        }
    }

}