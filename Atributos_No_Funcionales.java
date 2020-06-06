/*
 * Diseñe un algoritmo que le permita ingresar los atributos no
funcionales en un diseño experimental de un vehículo autónomo
*/
package atributos_no_funcionales;

/**
 *
 * @author Alex Beltran
 */
import java.util.Scanner;
public class Atributos_No_Funcionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner objeto=new Scanner (System.in);
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("INGENIERÍA AUTOMOTRIZ\n");
        System.out.println("ATRIBUTOS NO FUNCIONALES\n");
        
        System.out.println("Ingrese el atributo no funcional 1:");
        String atributonf1=objeto.nextLine();
        
        System.out.println("\nIngrese el atributo no funcional 2:");
        String atributonf2=objeto.nextLine();
        
        System.out.println("\nIngrese el atributo no funcional 3:");
        String atributonf3=objeto.nextLine();
        
    }
    
}
