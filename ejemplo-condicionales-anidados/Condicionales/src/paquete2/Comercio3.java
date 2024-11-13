/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro = 8;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();        
        
        System.out.println("Ingrese el porcentaje adicional del seguro "
                + "por favor");
        porcentajeSeguro = entrada.nextDouble();
        
        // calcular la productividad
        
         // opción 1 si es valida ya que al momento de ingresar los valores 
// las condicionales si se cumplen ya sea ingresando valores de tipo negativos o positivos por como programado esto si se cumple
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeSeguro = porcentajeSeguro + 0;
        } else {
            porcentajeSeguro = 10;
        }
/*
        // opción 2 esta condicion no se cumple ya que ya 
//que al momento de poner un numero menor al 1 el valor de 15 no sera tomado 
        if (porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
/* 
        
        */      
        }
    

/*
         // opción 3 esta condicion si es valida pero no fue considerada
        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
/*
        // opción 4 esta condicion no es valida ya que al momento de no se pude obtener o no existe un numero menor a 1 o mayor a 15
        if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
/*
        
        */
        productividad = numeroProductos * coeficiente;
        
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * 8)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
            }
        }
    }
    
}
