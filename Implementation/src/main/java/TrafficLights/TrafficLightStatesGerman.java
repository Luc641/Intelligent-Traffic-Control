package TrafficLights;


public enum TrafficLightStatesGerman implements State {
    //The enum used for representing the cycle of german traffic lights
    // showSignalOnce shows the current state and also changes to the next state
    // inverse shows the states inverse state
    RED {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(RED_YELLOW);
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
            return RED_YELLOW;
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

    },
    RED_YELLOW {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(GREEN);
        }

        @Override
        public State inverse() {
            return YELLOW;
        }
    }
}