/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author dani
 */
public class DemoCabinRental {
    public static void main(String[] args) {
        CabinRental cabin1 = new CabinRental(1);
        HolidayCabinRental cabin2 = new HolidayCabinRental(4);
        
        System.out.println(cabin1);
        System.out.println(cabin2);
    }
    
}
