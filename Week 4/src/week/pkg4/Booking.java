/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg4;

/**
 *
 * @author 4estrj82
 */
public class Booking {
    private String name;
    private int numGuests;
    private boolean outside;
    
    public Booking(String nameIn, int guests, boolean isOutside){
        name = nameIn;
        numGuests = guests;
        outside = isOutside;
    }
    public String getName(){
        return name;
    }
    public int getNumGuests() {
        return numGuests;
    }
    public boolean wantOutside(){
        return outside;
    }
    
    
    
    
    
}
