package UserInterface;

import TrafficLights.TrafficLightFactory;

import java.util.Scanner;

public class UserInterface {


    private final Scanner scanner;



    public UserInterface(Scanner scanner) {

        this.scanner = scanner;



    }


    public void run() {

        System.out.print("Choose what kind of function to display: \n" +
                "1 = Simple Traffic Light \n" +
                "2 = Road (2 traffic Light + 1 Pedestrian Light\n" +
                "3 = Intersection (2 Roads, 4 Traffic Lights)\n");

        Integer type = Integer.valueOf(scanner.nextLine());

        System.out.print("Choose what kind of State pattern to display: \n" +
                "1 = Dutch \n" +
                "2 = German\n" +
                "3 = Pedestrian\n");

        Integer pattern = Integer.valueOf(scanner.nextLine());
        TrafficLightFactory trafficLightFactory = null;

        if (type.equals(1)) {
            if (pattern.equals(1)) {
                trafficLightFactory = TrafficLightFactory.DUTCH;
            } else if (pattern.equals(2)) {
//                  trafficLightFactory.getTrafficLight("GERMAN");
                trafficLightFactory = TrafficLightFactory.GERMAN;
            }
//              trafficLightFactory.getTrafficLight("PEDESTRIAN");
            trafficLightFactory = TrafficLightFactory.PEDESTRIAN;
        }

        System.out.println();

        System.out.println("Commands:");

        System.out.println("cycle - cycle");

        System.out.println("stop - stops the program");

        System.out.println();


        while (true) {

            System.out.print("Enter command: ");

            String command = scanner.nextLine();


            if (command.equals("stop")) {

                break;

            }


            if (command.equals("cycle")) {

                System.out.print("How many times do you want it to cycle");

                int cycle = Integer.parseInt(scanner.nextLine());

                System.out.println();

                System.out.println("Cycling\n" +
                        cycle + "times");

                for (int i = cycle; i < 10; i++) {
//                    trafficLightFactory.getTrafficLight("GERMAN").showCurrentSignal();
                    assert trafficLightFactory != null;
                    trafficLightFactory.getTrafficLight("GERMAN").showCurrentSignal();

                }

            }
        }
    }
}