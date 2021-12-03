package TrafficLights;


public enum TrafficLightStateGerman implements State {
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