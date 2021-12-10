package TrafficLights;

public abstract class AbstractTrafficLight implements Context {
    private State currentState;
    private final String name;

    protected AbstractTrafficLight(String name, State initialState) {
        this.name = name;
        this.currentState = initialState;
    }

    @Override
    public void changeState(State newState) {
        currentState = newState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public String getName() {
        return name;
    }

    public void showCurrentSignal() {
        System.out.println( name + " Traffic Light: " + currentState);
        currentState.showSignalOnce(this);
    }

}