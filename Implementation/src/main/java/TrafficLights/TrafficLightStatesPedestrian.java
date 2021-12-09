package TrafficLights;

public enum TrafficLightStatesPedestrian implements State {

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
