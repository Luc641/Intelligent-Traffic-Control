package TrafficLights;

public enum TrafficLightStatesPedestrian implements State {
    //The enum used for representing the cycle of german traffic lights
    // showSignalOnce shows the current state and also changes to the next state
    // inverse shows the states inverse state


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

    GREEN {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(GREEN_BLINKING);
        }

        @Override
        public State inverse() {
            return RED;
        }

    },
    GREEN_BLINKING {
        @Override
        public void showSignalOnce(Context context) {
            context.changeState(RED);
        }

        @Override
        public State inverse() {
            return RED;
        }
    }
}
