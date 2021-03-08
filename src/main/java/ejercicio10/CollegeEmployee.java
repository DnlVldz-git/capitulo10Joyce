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
public class CollegeEmployee extends Person{
    private Integer socialSecur;
    private double anualSalary;
    private String depName;

    public Integer getSocialSecur() {
        return socialSecur;
    }

    public void setSocialSecur(Integer socialSecur) {
        this.socialSecur = socialSecur;
    }

    public double getAnualSalary() {
        return anualSalary;
    }

    public void setAnualSalary(double anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
   
    @Override
    public void display(){
        JOptionPane.showMessageDialog(null, ("College Employee"+"\nNombre: "+this.getFirstName()+"\nApellido: "+this.getLastName()+"\nDirección: "+this.getStreetAddres()+"\nCódigo postal: "+this.getZipCode()+"\nNúmero tel: "+this.getPhoneNumber()+"\nNumero seguridad social: "+this.getSocialSecur()+"\nNDepartamento: "+this.getDepName()+"\nSalario"+this.getAnualSalary()));
    }
    
    
    
}
