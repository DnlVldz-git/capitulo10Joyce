/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dani
 */
public class Year {
    private Integer dayInYear;
    private Calendar date;
    
    public Year(){
        this.dayInYear = 365;  
        date = new GregorianCalendar();        
    }
    
    public void daysElapsed(Integer month, Integer day){        
        date.set(2010, (month-1), day);
        System.out.println("Day of year");
        System.out.println(date.get(Calendar.DAY_OF_YEAR));
    }
    
    public Calendar getDate(){
        return this.date;
    }
    
    public void setDayInYear(int days){
        this.dayInYear = days;
    }

    public Integer getDayInYear() {
        return dayInYear;
    }
        
}
