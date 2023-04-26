/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
        import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 valores entre 1 y 20");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        
    if (num1 > 0 && num1 < 21 && num2 > 0 && num2 < 21 && num3 > 0 && num3 < 21 && num4 > 0 && num4 < 21){
       System.out.print(num1 + " ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");}
        System.out.println("");
            
       System.out.print(num2 + " ");
        for (int i2 = 0; i2 < num2; i2++) {
            System.out.print("*");}
        System.out.println(""); 
            
        System.out.print(num3+ " ");
        for (int i3 = 0; i3 < num3; i3++) {
            System.out.print("*");}
        System.out.println("");
        
        System.out.print(num4 + " ");          
        for (int i4 = 0; i4 < num4; i4++) {
            System.out.print("*");}
        System.out.println("");
        }
    else {
        System.out.println("Ingreso un valor incorrecto");
    }
          
      
    }
}

 
