/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sodxpunk.avance1;
import java.util.Scanner;
/**
 *
 * @author Laboratorios
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha f1 = new Fecha();
        System.out.println("La fecha de hoy es: " + f1);
        System.out.println("Escriba una nueva fecha en el formato DD/MM/YYYY");
        String f2 = sc.nextLine();
        Fecha F2 = new Fecha(f2);
        int dias = F2.lapso(f1);
        Periodo p0 = new Periodo(f1,F2);
        System.out.println("El primer periodo es: " + p0);
        System.out.println("El lapso contiene: " + dias + " dia/dias");
        F2 = F2.vencimiento(7);
        System.out.println("A su fecha se le agregaron 7 dias");
        Periodo p1 = new Periodo(f1,F2);
        System.out.println("Su nuevo periodo es: " + p1);
        Fecha f3 = new Fecha(F2);
        System.out.println("¿que parte de la fecha va a modificar?");
        System.out.println("1. dia");
        System.out.println("2. mes");
        System.out.println("3. año");
        System.out.println("4. no modificar");
        System.out.println("Seleccione la opccion (1-4)");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nuevo día: ");
                int nuevoDia = sc.nextInt();
                f3.setDia(nuevoDia);
                break;
            case 2:
                System.out.print("Ingrese el nuevo mes: ");
                int nuevoMes = sc.nextInt();
                f3.setMes(nuevoMes);
                break;
            case 3:
                System.out.print("Ingrese el nuevo año: ");
                int nuevoAnio = sc.nextInt();
                f3.setAño(nuevoAnio);
                break;
            case 4:
                System.out.println("No se modificará la fecha.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        System.out.println("Su fecha la ha modificado a: " + f3);
        Periodo p2 = new Periodo(F2,f3);
        System.out.println("El nuevo periodo es:" + p2);
        System.out.println("Se encuentra la nueva fecha: " + f3.lapso(F2) + " dia/dias");
        System.out.println("La nueva fecha se encuentra: " + p1.contiene(f3));
    }   
}
