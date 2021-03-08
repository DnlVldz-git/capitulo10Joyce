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
public class ScentedCandle extends Candle{
    private String scent;
    
    public ScentedCandle(String color, double height, String scent){        
        super(color, height);
        super.setPricePerInch(3);
        super.calcularPrecio();
        this.scent = scent;        
    }

    @Override
    public String toString() {
        return  "ScentedCandle{"+", color=" + this.getColor() + ", height=" + this.getHeight() + ", price=" + this.getPrice() + '}' + "scent=" + scent + '}';
    }
       
    
}
