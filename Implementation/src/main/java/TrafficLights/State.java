package TrafficLights;

public interface State {
    void showSignalOnce(Context context);

    State inverse();
}
