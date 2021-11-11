import TrafficLights.*;

import javax.sound.sampled.LineUnavailableException;

public class main {
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        GermanStandard test = new GermanStandard();
        test.sequence();
    }
}