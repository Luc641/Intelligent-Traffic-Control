package TrafficLights;


public enum TrafficLightStates {

    RED {
        @Override
        public void print() {
            System.out.println("RED");
        }
    },

    YELLOW {
        @Override
        public void print() {
            System.out.println("YELLOW");
        }
    },
    GREEN{
        @Override
        public void print() {
            System.out.println("GREEN");
        }
    },
    RED_YELLOW{
        @Override
        public void print(){
            System.out.println(RED_YELLOW);
        }
    },
    YELLOW_BLINKING{
        @Override
        public void print(){
            System.out.println(YELLOW_BLINKING);
        }
    },
    GREEN_ARROW{
        @Override
        public void print(){
            System.out.println(GREEN_ARROW);
        }
    },
    YELLOW_ARROW{
        @Override
        public void print(){
            System.out.println(YELLOW_ARROW);
        }
    },
    RED_ARROW{
        @Override
        public void print(){
            System.out.println(RED_ARROW);
        }
    },
    GREEN_BLINKING{
        @Override
        public void print(){
            System.out.println(GREEN_BLINKING);
        }
    };

    public void print(){
        System.out.println();
    }
}

