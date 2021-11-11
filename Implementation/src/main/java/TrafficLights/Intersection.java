package TrafficLights;

import javax.sound.sampled.LineUnavailableException;


public class Intersection {

    private Road horizontal;
    private Road vertical;


    public Intersection(Standards standards) {
        horizontal = new Road(standards);
        vertical = new Road(standards);

    }


    public void sequence() throws LineUnavailableException, InterruptedException {
        vertical.getTrafficLightLeft().sequence();
        vertical.getTrafficLightRight().sequence();
        horizontal.getTrafficLightLeft().sequence();
        horizontal.getTrafficLightRight().sequence();

    }

}