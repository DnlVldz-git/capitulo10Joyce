/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author dani
 */
public class CarRental {
    private String nombreRentador;
    private int zipCode;
    private Tamanio sizeCar;
    private double lengthtFee;
    private double dailyFee;
    private double priceFee;
    
    public CarRental(String n, int z, Tamanio s, double l){
        this.nombreRentador = n;
        this.zipCode = z;
        this.sizeCar = s;       
        this.lengthtFee = l;
        dailyFee();
        calcularPrecio();
    }
    
    public void dailyFee(){
        if (sizeCar == Tamanio.ECONOMY) {
            this.dailyFee = 29.99;
        }else if (sizeCar == Tamanio.MIDSIZE) {
            this.dailyFee = 38.99;
        }else if (sizeCar == Tamanio.FULL_SIZE) {
            this.dailyFee = 43.50;
        }
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }
    
    public void calcularPrecio(){
        if (this.sizeCar==Tamanio.ECONOMY) {
            this.priceFee = this.lengthtFee*29.99;
        }else if (this.sizeCar==Tamanio.MIDSIZE) {
            this.priceFee = this.lengthtFee*38.99;
        }else if (this.sizeCar==Tamanio.FULL_SIZE) {
            this.priceFee = this.lengthtFee*43.50;
        }
    }

    public String getNombreRentador() {
        return nombreRentador;
    }

    public void setNombreRentador(String nombreRentador) {
        this.nombreRentador = nombreRentador;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Tamanio getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(Tamanio sizeCar) {
        this.sizeCar = sizeCar;
    }

    public double getLengthtFee() {
        return lengthtFee;
    }

    public void setLengthtFee(double lengthtFee) {
        this.lengthtFee = lengthtFee;
    }

    public double getPriceFee() {
        return priceFee;
    }

    public void setPriceFee(double priceFee) {
        this.priceFee = priceFee;
    }
    
    public String display() {
        return "CarRental{" + "nombreRentador=" + nombreRentador + ", zipCode=" + zipCode + ", sizeCar=" + sizeCar + ", lengthtFee=" + lengthtFee + ", dailyFee=" + dailyFee + ", priceFee=" + priceFee + '}';
    }

}
    
