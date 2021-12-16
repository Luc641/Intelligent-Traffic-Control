package TrafficLights;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class PedestrianStandard extends AbstractTrafficLight implements PropertyChangeListener {
    //Constructor for the Standard
    //implements a PropertyChangeListener to make it dependent on the TrafficLights

    public PedestrianStandard(String name) {
        super(name, TrafficLightStatesPedestrian.GREEN);
    }

    public PedestrianStandard(String name, State initialState){
        super(name, initialState);
    }


//    @Override
//    public void nightMode() {
//        setTrafficLightState(TrafficLightStates.OFF);
//    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // am besten function schreiben, die country enums auf deinen pedestrian enum mappt.
        changeState((State) evt.getOldValue());
    }


    public void beep(int duration) throws LineUnavailableException, InterruptedException {
        byte[] buf = new byte[1];
        AudioFormat af = new AudioFormat((float) 44100, 8, 1, true, false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open();
        sdl.start();
        for (int t = 0; t < duration * 2; t++) {
            for (int i = 0; i < 100 * (float) 44100 / 1000; i++) {
                double angle = i / ((float) 44100 / 440) * 2.0 * Math.PI;
                buf[0] = (byte) (Math.sin(angle) * 100);
                sdl.write(buf, 0, 1);
            }
            Thread.sleep(100);
            sdl.drain();
            sdl.stop();
            Thread.sleep(50);
            sdl.open();
            sdl.start();
            for (int i = 0; i < 100 * (float) 44100 / 1000; i++) {
                double angle = i / ((float) 44100 / 880) * 2.0 * Math.PI;
                buf[0] = (byte) (Math.sin(angle) * 100);
                sdl.write(buf, 0, 1);
            }
        }
        Thread.sleep(100);
        sdl.drain();
        sdl.stop();
        Thread.sleep(250);
    }

}