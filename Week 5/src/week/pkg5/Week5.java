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
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus b = new Bus();

        b.passEnter(new Passenger(1,"fred", 25, 2.5));
        b.passEnter(new Passenger(2,"joao", 25, 2.5));
        b.passEnter(new Passenger(3,"paulo", 25, 2.5));
        b.passEnter(new Passenger(4,"estrela", 25, 2.5));
        b.passLeave(1);
        b.passNum();
        
        System.out.println(b.toString());
        System.out.println();
        
 
// TODO code application logic here
    }

}
