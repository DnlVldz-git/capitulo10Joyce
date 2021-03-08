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
public class TennisGame {

    private String player1;
    private String player2;
    private Integer finalScoresPlayer1Int;
    private Integer finalScoresPlayer2Int;
    private String finalScoresPlayer1Str;
    private String finalScoresPlayer2Str;

    public void setNames(String name1, String name2) {
        this.player1 = name1;
        this.player2 = name2;
    }

    @Override
    public String toString() {
        return "TennisGame{" + "player1=" + player1 + ", player2=" + player2 + ", finalScoresPlayer1Int=" + finalScoresPlayer1Int + ", finalScoresPlayer2Int=" + finalScoresPlayer2Int + ", finalScoresPlayer1Str=" + finalScoresPlayer1Str + ", finalScoresPlayer2Str=" + finalScoresPlayer2Str + '}';
    }
    
    

    public void setScoresInt(Integer score1, Integer score2) {
        if ((score1 == 4) && (score2 == 4)) {
            this.setTo0();
        } else if (((score1 < 0) || (score1 > 4)) || ((score2 > 4) || (score2 < 0))) {
            this.setTo0();
        } else {
            this.finalScoresPlayer1Int = score1;
            this.finalScoresPlayer2Int = score2;
            this.setStringScore1(score1);
            this.setStringScore2(score2);
        }
    }
    
    public void setStringScore2(Integer score2){
        switch (score2) {
                case 0:
                    this.finalScoresPlayer2Str = "love";
                    break;
                case 1:
                    this.finalScoresPlayer2Str = "15";
                    break;
                case 2:
                    this.finalScoresPlayer2Str = "30";
                    break;
                case 3:
                    this.finalScoresPlayer2Str = "40";
                    break;
                case 4:
                    this.finalScoresPlayer2Str = "game";
            }
    }
    
    public void setStringScore1(Integer score1){
        switch (score1) {
                case 0:
                    this.finalScoresPlayer1Str = "love";
                    break;
                case 1:
                    this.finalScoresPlayer1Str = "15";
                    break;
                case 2:
                    this.finalScoresPlayer1Str = "30";
                    break;
                case 3:
                    this.finalScoresPlayer1Str = "40";
                    break;
                case 4:
                    this.finalScoresPlayer1Str = "game";
            }
    }

    public void setTo0() {
        this.finalScoresPlayer1Int = 0;
        this.finalScoresPlayer2Int = 0;
        this.finalScoresPlayer1Str = "error";
        this.finalScoresPlayer2Str = "error";
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Integer getFinalScoresPlayer1Int() {
        return finalScoresPlayer1Int;
    }

    public void setFinalScoresPlayer1Int(Integer finalScoresPlayer1Int) {
        this.finalScoresPlayer1Int = finalScoresPlayer1Int;
    }

    public Integer getFinalScoresPlayer2Int() {
        return finalScoresPlayer2Int;
    }

    public void setFinalScoresPlayer2Int(Integer finalScoresPlayer2Int) {
        this.finalScoresPlayer2Int = finalScoresPlayer2Int;
    }

    public String getFinalScoresPlayer1Str() {
        return finalScoresPlayer1Str;
    }   

    public String getFinalScoresPlayer2Str() {
        return finalScoresPlayer2Str;
    }    

}
