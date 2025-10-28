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
public class Fecha {  
    private int dia;
    private int mes;
    private int año;

   
    public Fecha() {
        GregorianCalendar hoy = new GregorianCalendar();
        this.dia = hoy.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = hoy.get(GregorianCalendar.MONTH) + 1;
        this.año = hoy.get(GregorianCalendar.YEAR);
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
        this.año = fecha.año;
    }

    public Fecha(String fecha) { // formato "dd/mm/aaaa"
        String[] partes = fecha.split("/");
        this.dia = Integer.parseInt(partes[0]);
        this.mes = Integer.parseInt(partes[1]);
        this.año = Integer.parseInt(partes[2]);
    }

    
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return año; }

    
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAño(int año) { this.año = año; }

    
    public void setFecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha vencimiento(int numDias, int numMeses, int numAños) {
        GregorianCalendar cal = new GregorianCalendar(año, mes - 1, dia);
        cal.add(GregorianCalendar.DAY_OF_MONTH, numDias);
        cal.add(GregorianCalendar.MONTH, numMeses);
        cal.add(GregorianCalendar.YEAR, numAños);
        return new Fecha(cal.get(GregorianCalendar.DAY_OF_MONTH),
                         cal.get(GregorianCalendar.MONTH) + 1,
                         cal.get(GregorianCalendar.YEAR));
    }

    public Fecha vencimiento(int numDias) {
        return vencimiento(numDias, 0, 0);
    }

    public int lapso(Fecha desde) {
        GregorianCalendar f1 = new GregorianCalendar(desde.año, desde.mes - 1, desde.dia);
        GregorianCalendar f2 = new GregorianCalendar(año, mes - 1, dia);
        long milis = f2.getTimeInMillis() - f1.getTimeInMillis();
        return (int) (milis / (1000 * 60 * 60 * 24)); 
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}
