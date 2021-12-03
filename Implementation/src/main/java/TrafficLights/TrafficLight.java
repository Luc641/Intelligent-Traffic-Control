//package TrafficLights;
//
//import javafx.beans.Observable;
//
//import javax.sound.sampled.LineUnavailableException;
//import java.beans.PropertyChangeListener;
//import java.beans.PropertyChangeSupport;
//import java.util.concurrent.TimeUnit;
//
//public abstract class TrafficLight extends TrafficLightImpl {
//
//    private final PropertyChangeSupport support;
//    private final TrafficLightStates currentState;
//
//
//    public void sequence() throws InterruptedException {
//        var client = new TrafficLightImpl();
//
//        while (true) {
//            client.showCurrentSignal();
//            TimeUnit.SECONDS.sleep(4);
//        }
//    }
//
//
//    public TrafficLight() {
//        this.support = new PropertyChangeSupport(this);
//        this.currentState = TrafficLightStates.GREEN;
//    }
//
//    public void showCurrentSignal() {
//        currentState.showSignalOnce((Context) this);
//    }
//
//
////    void nightMode() {
////        setTrafficLightState(TrafficLightStates.YELLOW);
////    }
//
//
//    //Observer
//    public PropertyChangeSupport getSupport() {
//        return support;
//    }
//
//    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
//        support.addPropertyChangeListener(propertyChangeListener);
//    }
//
//    //Threads
//    abstract void startThread();
//
//    abstract void setThread(Thread thread);
//
//    abstract Thread getThread();
//}
