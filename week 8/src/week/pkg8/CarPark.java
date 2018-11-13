/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg8;

/**
 *
 * @author 4estrj82
 */
public class CarPark {
    private Car[] spots;

  public CarPark()
  {
    spots = new Car[15];
  }

  public boolean addCar (Car c)
  {
    for(int i = 0; i < spots.length; i++)
    {
      if(spots[i] == null)
      {
        spots[i] = c;   
        return true;
      }
    }
    return false;
  }

  public boolean removeCar (int id)
  {
    for(int i = 0; i < spots.length; i++)
    {
      if(spots[i] != null)
      {
        if(spots[i].getID() == id)
        {
          spots[i] = null;
          return true;
        }
      }
    }
    return false;
  }

  public int getNumCars()
  {
    int cnt = 0;

    for(int i = 0; i<spots.length; i++)
    {
      if(spots[i] != null)
      {
        cnt++;
      }
    }
    return cnt;
  }

  public int CalcFreeSpaces()
  {
    int c = 0;

    for(int i = 0; i < spots.length; i++)
    {
      if(spots[i] == null)
      {
        c++;
      }
    }
    return c;
  }

}
