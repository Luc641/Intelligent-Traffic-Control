package TrafficLights;

import javax.sound.sampled.LineUnavailableException;


public class Intersection {

    Road horizontal;
    Road vertical;


    public Intersection(Standards standards) {
        horizontal = new Road(standards);
        vertical = new Road(standards);

    }


    public void sequence() throws LineUnavailableException, InterruptedException {
        vertical.trafficLightLeft.sequence();
        vertical.trafficLightRight.sequence();
        horizontal.trafficLightLeft.sequence();
        horizontal.trafficLightRight.sequence();

    }

}