/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;


/**
 *
 * @author administrador
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Con esta clase guardamos valores ingresados por consola en las variables");
        
        System.out.println("Ingresa tu nombre");
        String nombre1= leer.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        String nombre= "Carlos";
        int numero=35;
        float decimales= 789.34F;
        long numEnteroLong= 223372036854775807L;
        boolean bandera= true;
        char oneCharacter= 'd';
        byte password= 1;
        int numero2 = 48;
        double decimales2 = 3.55;
        boolean bandera2 = false;
        
        int suma = numero + numero2;
        boolean comp= numero > numero2;
        String concatLetras = "Hola " + nombre1;
        
        System.out.println(suma);
        System.out.println(comp);
        System.out.println(concatLetras);
        
        
    }
    
}