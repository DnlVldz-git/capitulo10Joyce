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
public class Vehicle {
    private Integer wheels;
    private double milesPerGalon;
    
    public Vehicle(int w, double m){
        this.wheels = w;
        this.milesPerGalon = m;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "wheels=" + wheels + ", milesPerGalon=" + milesPerGalon + '}';
    }

    public Integer getWheels() {
        return wheels;
    }

    public double getMilesPerGalon() {
        return milesPerGalon;
    }
        
}

