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
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Staff s1 = new Staff("Leite");
        
        Booking b1 = new Booking("Mota", 5, true);
        
        Table t1 = new Table(1, 4, false);
        
        t1.assignStaffMember(s1);
        
        if( t1.bookTable(b1) )
        {
            System.out.println("Table Booked");
        }
        else
        {        
            System.out.println("Booking Unsuccessful");
        }    
        
        
        
    }
    
}
