package TrafficLights;

public enum TrafficLightFactory {

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
//    DUTCH {
//        @Override
//        public AbstractTrafficLight getAbstractTrafficLight(String name) {
//            return new DutchStandard(name);
//        }
//
//    },
//    PEDESTRIAN {
//        @Override
//        public AbstractTrafficLight getAbstractTrafficLight(String name) {
//            return new PedestrianLightStandard(name);
//        }
//
//    };
//
//    GERMAN_ARROW_LEFT {
//        @Override
//        public AbstractTrafficLight getAbstractTrafficLight (String name){
//            return new GermanStandard(name);
//        }
//
//        @Override
//        public AbstractTrafficLight getAbstractTrafficLightWithState (String name, AbstractTrafficLightStates state){
//            return null;
//        }
//    },
//
//    GERMAN_ARROW_RIGHT {
//        @Override
//        public AbstractTrafficLight getAbstractTrafficLight (String name){
//            return new GermanStandard(name);
//        }
//
//        @Override
//        public AbstractTrafficLight getAbstractTrafficLightWithState (String name, AbstractTrafficLightStates state){
//            return null;
//        }
//    }

    ;

    public abstract AbstractTrafficLight getTrafficLight(String name);

    public abstract AbstractTrafficLight getTrafficLight(String name, State initialState);


}
