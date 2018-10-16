/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 4estrj82
 */
public class Dog {
    // Attributes
private String name;
private int weight;
private int energy;
private int hunger;
private boolean isGood;
private Heart heart;
// Constructor WITH parameters
public Dog(String nameIn, int weightIn)
{
    name = nameIn;
    weight = weightIn;
    energy = 100;
    hunger = 50;
    isGood = true;
    heart = new Heart(60);
}
// Methods
public void chasePostman()
{
    System.out.println("BARK! BARK! BARK! GRRRRRRRRRR!");
    energy--;
    hunger--;
    weight--;
    isGood = false;
}
public void walk()
{
    if( heart.increaseBPM(5) )
    {
    weight--;
    energy--;
    }
    else
    {
    System.out.println("The dog is under too much strain");
    }
}
public void sleep()
{
    energy = 100;
    hunger--;
    heart.rest();
}
public void eat()
{
    hunger = 100;
    weight++;
}
// 'Getter' methods
public String getName()
{
return name;
}
public int getWeight()
{
return weight;
}
public int getEnergy()
{
return energy;
}
public int getHunger()
{
return hunger;
}
public boolean hasBeenGood()
{
return isGood;
}


}
