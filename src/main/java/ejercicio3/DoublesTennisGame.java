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
public class DoublesTennisGame extends TennisGame{
    private String partner1;
    private String partner2;
    
    public void setNames(String name1, String name2, String partner1, String partner2){
        this.setNames(name1, name2);
        this.partner1 = partner1;
        this.partner2 = partner2;
    }

    public String getPartner1() {
        return partner1;
    }

    public String getPartner2() {
        return partner2;
    }

    @Override
    public String toString() {
        return "DoublesTennisGame{"+ "player1=" + this.getPlayer1() + ", player2=" + this.getPlayer2() + ", finalScoresPlayer1Int=" + this.getFinalScoresPlayer1Int() + ", finalScoresPlayer2Int=" + this.getFinalScoresPlayer2Int() + ", finalScoresPlayer1Str=" + this.getFinalScoresPlayer1Str() + ", finalScoresPlayer2Str=" + this.getFinalScoresPlayer2Str() + "partner1=" + partner1 + ", partner2=" + partner2 + '}';
    }
    
    
}
