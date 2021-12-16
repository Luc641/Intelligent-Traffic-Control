package TrafficLights;

public enum TrafficLightFactory {
// An enum that creates based on the input the correlating traffic light
    GERMAN {
        @Override
        public AbstractTrafficLight getTrafficLight(String name) {
            return new GermanStandard(name);
        }

        @Override
        public AbstractTrafficLight getTrafficLight(String name, State initialState) {
            return new GermanStandard(name, initialState);
        }


    },
    DUTCH {
        @Override
        public AbstractTrafficLight getTrafficLight(String name) {
            return new DutchStandard(name);
        }

        @Override
        public AbstractTrafficLight getTrafficLight(String name, State initialState) {
            return new DutchStandard(name, initialState);
        }

    },
    PEDESTRIAN {
        @Override
        public AbstractTrafficLight getTrafficLight(String name) {
            return new PedestrianStandard(name);
        }

        @Override
        public AbstractTrafficLight getTrafficLight(String name, State initialState) {
            return new PedestrianStandard(name, initialState);
        }

    };


    public abstract AbstractTrafficLight getTrafficLight(String name);

    public abstract AbstractTrafficLight getTrafficLight(String name, State initialState);


}
