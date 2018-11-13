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
public class Car {
    private int ID;
  private String brand;

  public Car (int _ID, String _brand)
  {
    ID = _ID;
    brand = _brand;
  }

  public int getID()
  {
    return ID;
  }

  public String getBrand()
  {
    return brand;
  }
}
