package week3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4estrj82
 */
public class Car {
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    
    public Car(int currentSpeedIn, int maxSpeedIn)
    {
        currentSpeed = currentSpeedIn;
        maxSpeed = maxSpeedIn;
        fuelLevel = 75;
    }
    
    public Car()
    {
        currentSpeed = 0;
        maxSpeed = 0;
        fuelLevel = 0;
    }
            
    
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
    public int getFuelLevel()
    {
        return fuelLevel;
    }
    
    public void setCurrentSpeed(int currSpeed)
    {
        currentSpeed = currSpeed;
    }
    public void setMaxSpeed(int maSpeed)
    {
        maxSpeed = maSpeed;
    }
    public void setFuelLevel(int fuLevel)
    {
        fuelLevel = fuLevel;
    }
    
    public void acceleration()
    {
        currentSpeed = currentSpeed + 5;
        fuelLevel = fuelLevel - 2;
    }
    public void brake()
    {
        currentSpeed = currentSpeed - 10;
    }
    
    
}
