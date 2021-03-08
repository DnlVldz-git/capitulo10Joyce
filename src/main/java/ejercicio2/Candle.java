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
public class Candle {
    private Integer pricePerInch=2;
    private String color;
    private double height;
    private double price;
    
    public Candle(String color, double height){
        this.color = color;
        this.height = height;
        this.calcularPrecio();
    }
    
    public void calcularPrecio(){
        this.price = this.height*pricePerInch;
    }

    public void setPricePerInch(Integer pricePerInch) {
        this.pricePerInch = pricePerInch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candle{" + ", color=" + color + ", height=" + height + ", price=" + price + '}';
    }
    
    
    
    
}
