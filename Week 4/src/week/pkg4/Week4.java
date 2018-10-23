/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg4;

import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author 4estrj82
 */
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Staff s1 = new Staff("Leite");
        Staff s2 = new Staff("Darren");
        
        Booking b1 = new Booking("Mota", 2, true);
        Booking b2 = new Booking("Cisa", 3, false);
        Booking b3 = new Booking("Familia", 9, false);
        
        Table t1 = new Table(1, 4, true);
        Table t2 = new Table(2, 10, false);
        
        t1.assignStaffMember(s1);
        t2.assignStaffMember(s2);
          
        
        if( t1.bookTable(b1) )
        {
            System.out.println("B1 - Table Booked");
        }
        else
        {        
            System.out.println("B1 - Booking Unsuccessful");
        }    
        
        if( t1.bookTable(b2) )
        {
            System.out.println("B2 - Table Booked");
        }
        else
        {        
            System.out.println("B2 - Booking Unsuccessful");
        }  
        
        if( t2.bookTable(b3) )
        {
            System.out.println("B3 - Table Booked");
        }
        else
        {        
            System.out.println("B3 - Booking Unsuccessful");
        }  
        
        if(t1.getNumSeats() >= b3.getNumGuests())
        {
            t1.bookTable(b1);
            System.out.println("B1 - Table Booked");
        }

        
        
        
        
        
    }
    
}
