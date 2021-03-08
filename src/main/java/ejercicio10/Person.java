/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Person {
    private String firstName;
    private String lastName;
    private String streetAddres;
    private Integer zipCode;
    private String phoneNumber;        

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddres(String streetAddres) {
        this.streetAddres = streetAddres;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddres() {
        return streetAddres;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    
    public void display(){
        JOptionPane.showMessageDialog(null, (this.getFirstName()+"\n"+this.getLastName()+"\n"+this.getStreetAddres()+"\n"+this.getZipCode()+"\n"+this.getPhoneNumber()));
    }
    
}
