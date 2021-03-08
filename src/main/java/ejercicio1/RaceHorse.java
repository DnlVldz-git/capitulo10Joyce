/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dani
 */
public class RaceHorse extends Horse{
    private Integer nRaces;

    public Integer getnRaces() {
        return nRaces;
    }

    public void setnRaces(Integer nRaces) {
        this.nRaces = nRaces;
    }

    @Override
    public String toString() {
        
        return "RaceHorse{" + "name=" + this.getName() + ", color=" + this.getColor() + ", birthYear=" + this.getBirthYear() + '}'+  "nRaces=" + nRaces + '}';
    }
    
    
    
}
