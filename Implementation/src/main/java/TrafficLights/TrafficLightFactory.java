package TrafficLights;

public enum TrafficLightFactory {

    GERMAN{
        @Override
        public TrafficLight getTrafficLight(String name) {
            return new GermanStandard(name);
        }
    },
    DUTCH{
        @Override
        public TrafficLight getTrafficLight(String name) {
            return new DutchStandard(name);
        }
    },
    PEDESTRIAN{
        @Override
        public TrafficLight getTrafficLight(String name) {
            return new PedestrianLightStandard(name);
        }
    },
    GERMAN_ARROW_LEFT{
        @Override
        public TrafficLight getTrafficLight(String name) {
            return new GermanStandard(name);
        }
    },
    GERMAN_ARROW_RIGHT{
        @Override
        public TrafficLight getTrafficLight(String name) { return new GermanStandard(name); }
    };

    public abstract TrafficLight getTrafficLight(String name);

}
