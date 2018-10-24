package barking.mad.kennels;
// * @author Leite

import java.util.Scanner;

public class BarkingMadKennels {

    public static void main(String[] args) {
        boolean running = true;
        Kennel k = new Kennel();
        
        while (running == true) {
            Scanner scanIn = new Scanner(System.in);
            System.out.println("Choose an option:\na - Add dog.\nb - Remove dog.\nc- Check dog information.\nd- Close program.");
            String choice = scanIn.nextLine();
            if (choice.equals("a")) {
                k.addDog(new Dog());                
            }
            if (choice.equals("b"))
            {
             //   System.out.println("What is the order number");
             //   int dogId = Integer.parseInt(scanIn.nextLine());
                k.removeDog(1);
            }
        }
    }

}
