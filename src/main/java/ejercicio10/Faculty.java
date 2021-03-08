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
public class Faculty extends CollegeEmployee{
    private boolean permanente;

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }
    
    @Override
    public void display(){
        JOptionPane.showMessageDialog(null, ("Faculty"+"\nNombre: "+this.getFirstName()+"\nApellido: "+this.getLastName()+"\nDirección: "+this.getStreetAddres()+"\nCódigo postal: "+this.getZipCode()+"\nNúmero tel: "+this.getPhoneNumber()+"\nNumero seguridad social: "+this.getSocialSecur()+"\nNDepartamento: "+this.getDepName()+"\nSalario"+this.getAnualSalary()+"\nPermantente: "+this.isPermanente()));
    }
    
}
