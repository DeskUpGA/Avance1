/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sodxpunk.avance1;

/**
 *
 * @author Peget
 */
public class Periodo {
    private Fecha desde;
    private Fecha hasta;

    
    public Periodo(Fecha desde, Fecha hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    
    public Fecha getDesde() { return desde; }
    public Fecha getHasta() { return hasta; }

    
    public void setDesde(Fecha desde) { this.desde = desde; }
    public void setHasta(Fecha hasta) { this.hasta = hasta; }

    
    public boolean contiene(Fecha fecha) {
        int inicio = fecha.lapso(desde);
        int fin = hasta.lapso(fecha);
        return inicio >= 0 && fin >= 0;
    }

    @Override
    public String toString() {
        return "Desde: " + desde.toString() + " - Hasta: " + hasta.toString();
    }
}
