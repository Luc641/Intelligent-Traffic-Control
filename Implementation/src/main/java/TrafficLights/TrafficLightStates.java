//package TrafficLights;
//
//
//public enum TrafficLightStates implements State {
//
//    RED {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(RED_YELLOW);
//        }
//    },
//
//    YELLOW {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(RED);
//        }
//    },
//    GREEN {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(YELLOW);
//        }
//    },
//    RED_YELLOW {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(GREEN);
//        }
//   },
//    YELLOW_BLINKING {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(GREEN_ARROW);
//        }
//    },
//    GREEN_ARROW {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(YELLOW_ARROW);
//        }
//    },
//    YELLOW_ARROW {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(RED_ARROW);
//        }
//    },
//    RED_ARROW {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(GREEN_BLINKING);
//        }
//    },
//    GREEN_BLINKING {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(OFF);
//        }
//    },
//    OFF {
//        @Override
//        public void showSignalOnce(Context context) {
//            System.out.println(this);
//            context.changeState(RED);
//        }
//    }
//
//}
