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
public class DemoHorses {
    public static void main(String[] args) {
        Horse caballo1 = new Horse();
        RaceHorse caballo2 = new RaceHorse();
        
        caballo1.setName("Julian");
        caballo1.setColor("Negro");
        caballo1.setBirthYear(2012);
        
        caballo2.setName("José");
        caballo2.setColor("Café");
        caballo2.setBirthYear(2013);
        caballo2.setnRaces(10);
        
        System.out.println(caballo1);
        System.out.println(caballo2);
        
        
    }
    
}
