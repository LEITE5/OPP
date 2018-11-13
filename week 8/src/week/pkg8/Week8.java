/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg8;

import java.util.Scanner;

/**
 *
 * @author 4estrj82
 */
public class Week8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainScreen gui = new MainScreen();
        gui.pack();
        gui.setVisible(true);

        CarPark c1 = new CarPark();

        c1.addCar(new Car(1, "ferrari"));
        c1.addCar(new Car(2, "ferrari"));
        c1.addCar(new Car(3, "ferrari"));

        System.out.println(c1.getNumCars());

        char state = 1;

        while (state == 1) {

            System.out.println("Please enter the letter which corresponds with your choice:");
            System.out.println("a - add a car");
            System.out.println("b - remove a car");
            System.out.println("c - View number of cars in the car park");
            System.out.println("x - Exit");

            Scanner scanIn = new Scanner(System.in);

            String input = scanIn.nextLine();

            if (input.equals("a")) {
                // user presses A
                System.out.println("You have selected A - Add a car");
                System.out.println("Please enter a plate (to simplify things enter an integer):");
                Scanner in = new Scanner(System.in);
                int plate = in.nextInt();
                System.out.println("Please enter the brand of your car:");
                String brand = in.next();

                //add car
                if (c1.addCar(new Car(plate, brand))) {
                    System.out.println("car inserted!");
                } else {
                    System.out.println("car park is full");
                }
            }

            if (input.equals("b")) {
                // user presses A
                System.out.println("You have selected B - Remove a car");
                System.out.println("Please enter a plate (to simplify things enter an integer):");
                Scanner in = new Scanner(System.in);
                int plate = in.nextInt();

                //remove car
                if (c1.removeCar(plate)) {
                    System.out.println("Car removed!");
                } else {
                    System.out.println("car not removed!");
                }
            }

            if (input.equals("c")) {
                // user presses A
                System.out.println("You have selected C - View number of cars");
                System.out.println("There are: " + c1.getNumCars() + " cars in the car park");
            }

            if (input.equals("x")) {
                state = 0;
                scanIn.close();
            }
        }
    }
}
