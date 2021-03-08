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
public class CabinRental {
    private Integer cabinNumber;
    private double weeklyRental;
    
    public CabinRental(Integer cabinNumber){
        this.setCabinNumber(cabinNumber);
    }
    

    public Integer getCabinNumber() {
        return cabinNumber;
    }

    public void setCabinNumber(Integer cabinNumber) {
        if ((cabinNumber==1)||(cabinNumber==2)||(cabinNumber==3)) {
            this.weeklyRental = 950;
        }else{
            this.weeklyRental = 1100;
        }
        this.cabinNumber = cabinNumber;
    }

    public double getWeeklyRental() {
        return weeklyRental;
    }

    public void setWeeklyRental(double weeklyRental) {
        this.weeklyRental = weeklyRental;
    }

    @Override
    public String toString() {
        return "CabinRental{" + "cabinNumber=" + cabinNumber + ", weeklyRental=" + weeklyRental + '}';
    }
    
    
    
}
