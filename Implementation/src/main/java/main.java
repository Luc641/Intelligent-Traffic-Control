import TrafficLights.PedestrianLightStandard;
import javax.sound.sampled.LineUnavailableException;

public class main {
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        PedestrianLightStandard fußgängerTest = new PedestrianLightStandard();
        fußgängerTest.sequence();
    }
}