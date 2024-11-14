/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre y apellido");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese las siglas de su universidad");
        String universidad = entrada.nextLine();
        
        nombre = nombre.toLowerCase();
        
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s con edad %d, es estudiante de %s",
                        nombre,
                        edad,
                        universidad);
                break;
            
            default:
                System.out.printf("%s con edad %d, es estudiante de %s",
                        nombre,
                        edad,
                        universidad);
                break;
                
                //esto se va a presentar
                //ANA DIAZ con edad 19, es estudiante de UTPL

                //luis vera con edad 19, es estudiante de UNL

        }
        
    }
}
