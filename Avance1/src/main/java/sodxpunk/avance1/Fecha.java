/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sodxpunk.avance1;
import java.util.GregorianCalendar;
/**
 *
 * @author Laboratorios
 */
public class Fecha extends GregorianCalendar{

    public Fecha() {
    }

    public Fecha(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }
    
    public Fecha (fecha Fecha){
        
    }
    public Fecha (String Fecha){
        
    }

    public static int getYEAR() {
        return YEAR;
    }

    public static int getMONTH() {
        return MONTH;
    }

    public static int getDATE() {
        return DATE;
    }
    
}
