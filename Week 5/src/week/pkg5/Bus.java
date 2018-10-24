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
public class Bus {

    private Passenger[] passengers = new Passenger[15];

    public boolean passEnter(Passenger idIn) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = idIn;
                return true;
            }

        }
        return false;
    }

    public boolean passLeave(int id) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getID() == id) {
                passengers[i] = null;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                ret = ret + passengers[i].toString() + "\n";
            }
        }
        return ret;
    }

    public int passNum() {
        int tally = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                tally++;

            }

        }
        System.out.println("Total number of passengers is " + tally);
        return tally;
    }

    public double getTotalFare() {
        double total = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                total += passengers[i].getFare();
            }
        }
        return total;
    }

}
