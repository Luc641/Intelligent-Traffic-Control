package TrafficLights;

import javax.sound.sampled.LineUnavailableException;


public class Intersection {

    private Road horizontal;
    private Road vertical;


    public Intersection(Standards standard) {
        horizontal = new Road(standard);
        vertical = new Road(standard);

    }


    public void sequence() throws LineUnavailableException, InterruptedException {
        vertical.getTrafficLightLeft().sequence();
        vertical.getTrafficLightRight().sequence();
        horizontal.getTrafficLightLeft().sequence();
        horizontal.getTrafficLightRight().sequence();

    }

}