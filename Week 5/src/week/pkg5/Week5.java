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

        b.passEnter(new Passenger("fred", 25, 2.5));
        b.passEnter(new Passenger("joao", 25, 2.5));
        b.passEnter(new Passenger("paulo", 25, 2.5));
        b.passEnter(new Passenger("estrela", 25, 2.5));

        System.out.println(b.toString());
        System.out.println();

        b.coisa();
// TODO code application logic here
    }

}
