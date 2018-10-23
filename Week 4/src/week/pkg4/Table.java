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
public class Table {
    private int number;
    private int numSeats;
    private boolean isOutside;
    private Staff assignedStaff;
    private Booking booking;

    public Table(int num, int seats, boolean outside)
    {
        number = num;
        numSeats = seats;
        isOutside = outside;
    }

    public void assignStaffMember(Staff staffIn)
    {
        assignedStaff = staffIn;
    }
    
    public boolean bookTable(Booking bookIn)
    {
        if(numSeats >= bookIn.getNumGuests() && isOutside == bookIn.wantOutside())
        {
            booking = bookIn;
            return true;
        }
        return false;
    }

    public void clearBooking()
    {
        booking = null;
    }
    
    public int getNumSeats()
    {
    return numSeats;
    }
    
}
