/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg5;

/**
 *
 * @author 4estrj82
 */
public class Passenger {
     private String name;
     private int age;
     private double fare;
     public Passenger(String nameIn, int ageIn, double fareIn)
     {
         name = nameIn;
         age = ageIn;
         fare = fareIn;
     }
     
     public String getName()
     {
         return name;
     }
     public int getAge()
     {
         return age;
     }
     public double getFare()
     {
         return fare;
     }
//    private int ID;
//    
//    public Passenger(int idIn)
//    {
//        ID = idIn;
//    }
//    public int getID()
//    {
//        return ID;
//    }

    @Override
    public String toString() {
        return "Passenger{" + "name=" + name + ", age=" + age + ", fare=" + fare + '}';
    }
    
    
    
    
    
}
