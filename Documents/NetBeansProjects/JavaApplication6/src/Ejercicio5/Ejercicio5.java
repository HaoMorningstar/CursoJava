/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     
       
        System.out.println("true o false");
     boolean flag = leer.nextBoolean();
        System.out.println("Ingresa una letra");
               char letra = leer.next().charAt(0);
        System.out.println("ingrese un numero real");
                       double num = leer.nextDouble();

                     System.out.print("Las respuestas ingresadas son "+ flag);
                     System.out.print(", " + letra);
                     System.out.print(" y " + num);
    }
    
    
}
