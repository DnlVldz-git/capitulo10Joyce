/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Student extends Person{
    private String major;
    public double average;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null, ("Student"+"\nNombre: "+this.getFirstName()+"\nApellido: "+this.getLastName()+"\nDirección: "+this.getStreetAddres()+"\nCódigo postal: "+this.getZipCode()+"\nNúmero tel: "+this.getPhoneNumber()+"\nCarrera: "+this.getMajor()+"\nPromedio: "+this.getAverage()));
    }
    
}
