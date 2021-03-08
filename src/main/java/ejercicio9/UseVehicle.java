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
public class UseVehicle {
    public static void main(String[] args) {
        Car car = new Car(30);
        MotorCycle moto = new MotorCycle(50);
        
        System.out.println(car);
        System.out.println(moto);
    }
}
