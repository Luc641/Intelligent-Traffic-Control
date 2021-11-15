package TrafficLights;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.concurrent.TimeUnit;

public class PedestrianLightStandard implements TrafficLight {

    private TrafficLightStates state = TrafficLightStates.RED;
    private int greenPhaseDuration = 5;
    private Thread thread;
    private String name;

    public PedestrianLightStandard(String name) {
        this.name = name;
    }

    @Override
    public void sequence(){
        try {
            setTrafficLightState(TrafficLightStates.GREEN);
            beep(greenPhaseDuration);
            setTrafficLightState(TrafficLightStates.GREEN_BLINKING);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException | LineUnavailableException e) {
            e.printStackTrace();
        }
        setTrafficLightState(TrafficLightStates.RED);
    }

    @Override
    public TrafficLightStates getTrafficLightState() {
        return state;
    }

    @Override
    public void setTrafficLightState(TrafficLightStates state) {
        this.state = state;
        System.out.println(state);
    }

    @Override
    public void setGreenPhaseDuration(int duration) {
        this.greenPhaseDuration = duration;
    }

    @Override
    public int getGreenPhaseDuration() {
        return greenPhaseDuration;
    }

    @Override
    public void startThread() {
        setThread(new Thread(this::sequence));
        thread.start();
    }

    @Override
    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public Thread getThread() {
        return thread;
    }

    @Override
    public void nightMode() {
        setTrafficLightState(TrafficLightStates.OFF);
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