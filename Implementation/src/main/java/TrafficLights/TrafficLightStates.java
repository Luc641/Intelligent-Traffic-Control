package TrafficLights;


public enum TrafficLightStates {

    RED {

    },

    YELLOW {

    },

    GREEN {

    },

    RED_YELLOW {

    },

    YELLOW_BLINKING {

    },

    GREEN_ARROW {

    },

    YELLOW_ARROW {

    },

    RED_ARROW {

    },

    GREEN_BLINKING {

    };


    public void printCurrent() {
        System.out.println(TrafficLightStates.valueOf(String.valueOf(TrafficLightStates.this)));
    }

}
