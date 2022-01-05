package UserInterface;

import BusinessLogic.Intersection.Intersection;
import BusinessLogic.Intersection.Road;
import BusinessLogic.TrafficLights.DutchStandard;
import BusinessLogic.TrafficLights.GermanStandard;
import BusinessLogic.TrafficLights.PedestrianStandard;
import BusinessLogic.TrafficLights.TrafficLightFactory;
import Entities.Cycle;

import java.util.Scanner;

public class UserInterface {


    private final Scanner scanner;


    public UserInterface(Scanner scanner) {

        this.scanner = scanner;

    }


    public void run() {

        System.out.print("""
                Choose what kind of function to display:\s
                1 = Simple Traffic Light\s
                2 = Road (2 traffic Light + 1 Pedestrian Light
                3 = Intersection (2 Roads, 4 Traffic Lights)
                """);

        Integer type = Integer.valueOf(scanner.nextLine());

        System.out.print("""
                Choose what kind of State pattern to display:\s
                1 = Dutch\s
                2 = German
                3 = Pedestrian
                """);

        Integer pattern = Integer.valueOf(scanner.nextLine());
        Cycle cycle = null;


        if (type.equals(1)) {
            if (pattern.equals(1)) {

                cycle = new DutchStandard("DUTCH");
            } else if (pattern.equals(2)) {

                cycle = new GermanStandard("GERMAN");
            }
        }

        if (type.equals(2)) {
            if (pattern.equals(1)) {
                cycle = new Road("ROAD", new DutchStandard("FIRST"), new DutchStandard("SECOND"), new PedestrianStandard("PEDESTRIAN"));
            } else if (pattern.equals(2)) {
                cycle = new Road("ROAD", new GermanStandard("FIRST"), new GermanStandard("SECOND"), new PedestrianStandard("PEDESTRIAN"));
            } else
                System.out.println("That is not logical");
        }

        if (type.equals(3)) {
            cycle = new PedestrianStandard("PEDESTRIAN");
            if (pattern.equals(1)) {
                cycle = new Intersection(TrafficLightFactory.DUTCH);
            } else if (pattern.equals(2)) {
                cycle = new Intersection(TrafficLightFactory.GERMAN);
            } else
                System.out.println("Not going to work");
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

                System.out.print("How many times do you want it to cycle: ");

                int cycling = Integer.parseInt(scanner.nextLine());

                System.out.println();

                System.out.println("Cycling \n" +
                        cycling + " times");

                for (int i = 0; i < cycling; i++) {
                    assert cycle != null;
                    cycle.cycle();

                }

            }
        }
    }
}