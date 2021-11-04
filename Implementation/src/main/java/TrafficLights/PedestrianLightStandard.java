package TrafficLights;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.concurrent.TimeUnit;

public class PedestrianLightStandard implements TrafficLight{
    TrafficLightStates state = TrafficLightStates.RED;
    double greenPhaseDuration = 30.0;
    int index;

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public void sequence() throws InterruptedException, LineUnavailableException {
        state = TrafficLightStates.GREEN;
        TrafficLightStates.GREEN.print();
        beep(greenPhaseDuration);
        state = TrafficLightStates.GREEN_BLINKING;
        TrafficLightStates.GREEN_BLINKING.print();
        TimeUnit.SECONDS.sleep(3);
        state = TrafficLightStates.RED;
        TrafficLightStates.RED.print();

    }

    @Override
    public TrafficLightStates getTrafficLightStates() {
        return state;
    }

    @Override
    public void setGreenPhaseDuration(int duration) {
        this.greenPhaseDuration =  duration;
    }

    public void beep(double duration) throws LineUnavailableException, InterruptedException {
        byte[] buf = new byte[ 1 ];
        AudioFormat af = new AudioFormat( (float )44100, 8, 1, true, false );
        SourceDataLine sdl = AudioSystem.getSourceDataLine( af );

        for (int t = 0; t < duration*2; t++) {
            sdl.open();
            sdl.start();
            for( int i = 0; i < 100 * (float )44100 / 1000; i++ ) {
                double freq = (880*(Math.pow(Math.pow(2, (1.0/12.0)),((0)))));
                System.out.println(freq);
                double angle = i / ( (float )44100 / freq ) * 2.0 * Math.PI;
                buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
                sdl.write( buf, 0, 1 );
            }
            Thread.sleep(100);
            sdl.drain();
            sdl.stop();
            Thread.sleep(50);
            sdl.open();
            sdl.start();
            for( int i = 0; i < 100 * (float )44100 / 1000; i++ ) {
                double freq = (880*(Math.pow(Math.pow(2, (1.0/12.0)),((duration+i)%12.0))));
                System.out.println(freq);
                double angle = i / ( (float )44100 / freq) * 2.0 * Math.PI;
                buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
                sdl.write( buf, 0, 1 );
            }
        }
        Thread.sleep(100);
        sdl.drain();
        sdl.stop();
        Thread.sleep(250);
    }
}
