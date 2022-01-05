package BusinessLogic.TrafficLights;

import Entities.Context;
import Entities.State;

public enum TrafficLightStatesDutch implements State {
    /**
     * The enum used for representing the cycle of Dutch traffic lights
     * showSignalOnce shows the current state and also changes to the next state
     * inverse shows the states inverse state
     */
    RED {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(GREEN);
        }

        @Override
        public State inverse() {
            return GREEN;
        }
    },

    YELLOW {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(RED);
        }

        @Override
        public State inverse() {
            return YELLOW;
        }
    },

    GREEN {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(YELLOW);
        }

        @Override
        public State inverse() {
            return RED;
        }

    }
}

