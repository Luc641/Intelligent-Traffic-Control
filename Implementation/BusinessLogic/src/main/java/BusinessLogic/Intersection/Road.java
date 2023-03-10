package BusinessLogic.Intersection;

import BusinessLogic.TrafficLights.AbstractTrafficLight;
import BusinessLogic.TrafficLights.PedestrianStandard;
import Entities.Cycle;
import Entities.State;

import java.beans.PropertyChangeSupport;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Road implements Cycle {

    private final AbstractTrafficLight pedestrianLight;
    private final AbstractTrafficLight trafficLightRight;
    private final AbstractTrafficLight trafficLightLeft;
    private final ForkJoinPool forkJoinPool = new ForkJoinPool(2);
    private final String name;
    private final PropertyChangeSupport support;

    /**
     * @param name              Name for the road to distinguish
     * @param trafficLightRight set the traffic light on the right side
     * @param trafficLightLeft  same as right but for left
     * @param pedestrianLight   set the pedestrian light
     */

    public Road(String name, AbstractTrafficLight trafficLightRight, AbstractTrafficLight trafficLightLeft, PedestrianStandard pedestrianLight) {
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

    /**
     * @param toWrap wraps the road
     * @param unit   giving the time
     * @return returns the amount of time between cycling
     */

    private Runnable wrapWithSleep(Runnable toWrap, TimeUnit unit) {
        return () -> {
            toWrap.run();
            try {
                unit.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    /**
     * let the complete road advance one cycle shifting
     */

    void advanceOnce() {
        var old = getTrafficLightState();
        forkJoinPool.submit(wrapWithSleep(trafficLightRight::showCurrentSignal, TimeUnit.SECONDS));
        forkJoinPool.submit(wrapWithSleep(trafficLightLeft::showCurrentSignal, TimeUnit.SECONDS));
        //noinspection ResultOfMethodCallIgnored
        forkJoinPool.awaitQuiescence(1, TimeUnit.MINUTES);
//        if (getTrafficLightState().toString().contains("RED")) {
//            support.firePropertyChange("trafficLightStateChange", old, getTrafficLightState());
//            System.out.println(pedestrianLight.getCurrentState());
//
//        } else {
//            System.out.println(pedestrianLight.getCurrentState());
//        }
    }

    /**
     * sets the cycle for the road
     */

    @Override
    public void cycle() {
        advanceOnce();
    }
}
