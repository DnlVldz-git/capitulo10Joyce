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
public class HolidayCabinRental extends CabinRental{
    
    public HolidayCabinRental(Integer cabinNumber){
        super(cabinNumber);
        this.setWeeklyRental(this.getWeeklyRental()+150);
    }
    
    @Override
    public String toString() {
        return "CabinRental{" + "cabinNumber=" + this.getCabinNumber() + ", weeklyRental=" + this.getWeeklyRental() + '}';
    }
    
    
}
