package barking.mad.kennels;
// * @author Leite

import java.util.Scanner;

public class Kennel {
    
    private Dog[] maxDogs = new Dog[11];
    private double fare;
    Scanner scanIn = new Scanner(System.in);
    
    public boolean addDog(Dog dogIn)
    {
     for(int i = 1; i < maxDogs.length; i++)
     {
         if(maxDogs[i] == null)
         {
             maxDogs[i] = dogIn;
             System.out.println("Insert dog name: ");
             String dogName = scanIn.nextLine();
             dogIn.setName(dogName);
             dogIn.setId(i);
//             System.out.println("Insert dog id: ");
  //           int dogId = Integer.parseInt(scanIn.nextLine());
    //         dogIn.setId(dogId);
             System.out.println("Insert owner name: ");
             String ownerName = scanIn.nextLine();
             dogIn.setOwner(ownerName);
             System.out.println("How many days is the dog staying? ");
             int timeStaying = Integer.parseInt(scanIn.nextLine());
             dogIn.setNumDays(timeStaying);
             fare = timeStaying * 8;
             System.out.println("The fare is £" + fare);
             System.out.println();
             return true;
         }
     }
     System.out.println("Sorry, we are full.");
     return false;
    }
    
    public boolean removeDog(int dogOut)
    {
        
     for(int i = 0; i < maxDogs.length; i++)
     {
         if(maxDogs[i].getId() == dogOut)
         {
             maxDogs[i] = null;
             System.out.println("Dog removed successfully.");
             
             return true;
         }
     }
    // maxDogs[i].getId() == null;
     System.out.println("There are no dogs to remove.");
     return false;
    }
    
   
    
}
