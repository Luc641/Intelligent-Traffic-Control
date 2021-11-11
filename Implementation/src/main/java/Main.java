import TrafficLights.*;

import javax.sound.sampled.LineUnavailableException;

public class Main {
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        TrafficLight test = new PedestrianLightStandard();
        test.sequence();
    }
}