/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Calendar;

/**
 *
 * @author dani
 */
public class LeapYear extends Year{
    
    public LeapYear(){
        this.setDayInYear(366);
    }
    
    @Override
    public void daysElapsed(Integer month, Integer day){
        this.getDate().set(2020, (month-1), day);
        System.out.println("Day of year");
        System.out.println(this.getDate().get(Calendar.DAY_OF_YEAR));
    }
    
}
