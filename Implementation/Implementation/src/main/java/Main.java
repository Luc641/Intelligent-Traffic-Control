
import Intersection.Intersection;
import Presentation.MainFX;
import TrafficLights.GermanStandard;
import TrafficLights.TrafficLightFactory;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author jay
 */
public class Main {

    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        MainFX.initiate(args);
        GermanStandard germanStandard = new GermanStandard("German");
        var intersection = new Intersection(TrafficLightFactory.GERMAN);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            intersection.sequence();
        }

    }
}
