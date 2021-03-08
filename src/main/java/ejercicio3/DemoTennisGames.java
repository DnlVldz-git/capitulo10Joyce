/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author dani
 */
public class DemoTennisGames {
    public static void main(String[] args) {
        TennisGame game1 = new TennisGame();
        DoublesTennisGame game2 = new DoublesTennisGame();
        
        game1.setNames("Julian", "José");
        game1.setScoresInt(4, 2);
        System.out.println(game1);
        
        game2.setNames("Julian", "José", "Ramón", "Beto");
        game2.setScoresInt(3, 4);
        System.out.println(game2);
    }
}
