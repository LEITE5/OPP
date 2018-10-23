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

    public boolean passEnter(Passenger idIN) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = idIN;
                return true;
            }

        }
        return false;
    }

    public String toString() {
        String ret = "";
         for (int i = 0; i < passengers.length; i++) {
           if(passengers[i] != null)
           {
               ret = ret + passengers[i].toString() +"\n";
           }
         }
//        
        return ret;
    }
    public int coisa()
    {
        for (int i = 0; i < passengers.length; i++) {
           if(passengers[i] != null){}
           int nao = i;
           System.out.println(nao);
        }
    }
    
}
