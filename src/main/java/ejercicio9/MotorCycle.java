/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author dani
 */
public class MotorCycle extends Vehicle{
    public MotorCycle(double m){
        super(2, m);
    }
    
    public String toString(){
        return "MotorCycle {" + "wheels=" + this.getWheels() + ", milesPerGalon=" + this.getMilesPerGalon() + '}';
    }
    
}
