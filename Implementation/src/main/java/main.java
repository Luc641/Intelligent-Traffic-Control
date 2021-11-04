import TrafficLights.GermanStandard;
import TrafficLights.PedestrianLightStandard;
import TrafficLights.TrafficLightStates;

import javax.sound.sampled.LineUnavailableException;

public class main {
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        PedestrianLightStandard germanStandard = new PedestrianLightStandard();
        germanStandard.sequence();
    }
}