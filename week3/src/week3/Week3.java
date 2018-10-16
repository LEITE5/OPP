/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 4estrj82
 */
public class Week3 
{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(30, 90);
        
        c1.setCurrentSpeed(50);
        c1.setMaxSpeed(150);
        c1.setFuelLevel(50);
        
        c2.setFuelLevel(50);
        
        c1.acceleration();
        System.out.println();
        
        System.out.println("Current speed: " + c1.getCurrentSpeed());
        System.out.println("Max speed: " + c1.getMaxSpeed());
        System.out.println("Fuel level: " + c1.getFuelLevel());
        
        System.out.println("Current speed: " + c2.getCurrentSpeed());
        System.out.println("Max speed: " + c2.getMaxSpeed());
        System.out.println("Fuel level: " + c2.getFuelLevel());
}
    
}
