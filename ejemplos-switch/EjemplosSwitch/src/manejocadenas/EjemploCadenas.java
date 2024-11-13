/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un método que nos permite modificar una variable y hacer que todo dentro de ella sea minusculas
        // toUpperCase es un métodoque nos permite modificar una variable y hacer que todo dentro de ella sea mayusculas
        //en este problema no qued otra vez como minusculas ya que el lowercase esta sin declararse en un igual
    }
}
