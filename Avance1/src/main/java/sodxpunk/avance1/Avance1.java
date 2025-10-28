
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sodxpunk.avance1;

/**
 *
 * @author Laboratorios
 */
public class Avance1 {

    public static void main(String[] args) {
        Fecha f1 = new Fecha(26, 10, 2025);
        System.out.println("Fecha inicial: " + f1);

        
        Fecha f2 = f1.vencimiento(10);
        System.out.println("Fecha de vencimiento: " + f2);

        
        Periodo periodo = new Periodo(f1, f2);
        System.out.println("Periodo: " + periodo);

       
        Fecha prueba = new Fecha(30, 10, 2025);
        System.out.println("¿El periodo contiene " + prueba + "? " + periodo.contiene(prueba));

       
        int dias = f2.lapso(f1);
        System.out.println("Días entre " + f1 + " y " + f2 + ": " + dias);
    }
}
