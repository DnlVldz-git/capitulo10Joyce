/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author dani
 */
public class UseYear {
    public static void main(String[] args) {
        Year y1 = new Year();
        LeapYear y2 = new LeapYear();
        
        System.out.println(y1.getDayInYear());
        System.out.println(y2.getDayInYear());
        
        y1.daysElapsed(12, 31);
        y2.daysElapsed(12, 31);
        
        
    }
}
