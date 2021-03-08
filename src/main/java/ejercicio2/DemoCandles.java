/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author dani
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle vela = new Candle("Rojo", 20);
        ScentedCandle vela2 = new ScentedCandle("Azul", 20, "Canela");
        
        System.out.println(vela);
        System.out.println(vela2);
    }
}
