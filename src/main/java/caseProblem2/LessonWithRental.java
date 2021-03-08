/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author dani
 */
public class LessonWithRental extends Rental {
    private final String[] NAMES = {"JOSE", "JULIAN", "RAMON", "JULIETA", "MARGARITO", "MARIANO"};
    private boolean lesson;
    
    public LessonWithRental(String eventNumber, Integer minutes, Integer eqType){
        super(minutes, eventNumber);
        this.setEqui_type(eqType);
    }
    
    public void setLesson(Integer eq){
        if ((eq == 1)||(eq == 2)) {
            this.lesson=true;
        }else  {
            this.lesson = false;
        }
    }
    
    public String getInstructor(Integer eq){
        return ("Instructor: "+this.NAMES[eq]);
    }
}
