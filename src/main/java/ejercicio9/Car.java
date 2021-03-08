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
public class Car extends Vehicle{
    
    public Car(double m){
        super(4, m);
    }

    public String toString(){
        return "Car {" + "wheels=" + this.getWheels() + ", milesPerGalon=" + this.getMilesPerGalon() + '}';
    }
    
}
