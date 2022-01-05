package Entities;

public interface Context {
    /**
     *
     * @param newTrafficLightState changes the State to the new given one
     */
    void changeState(State newTrafficLightState);
}
