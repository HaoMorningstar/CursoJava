/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un numero");
                int num1 = leer.nextInt();
                System.out.println("Ingrese un numero distinto");
                int num2 = leer.nextInt();
                
                if (num1 >= 25 && num2 >=25){
                    System.out.println("Ambos numeros son mayores a 25");}
                else if (num1 >= 25 || num2 >=25){
                    System.out.println("Uno de los numeros es igual o mayor a 25");
                }
                else{
                    System.out.println("Ambos numeros son menores a 25");}
                }
                   
    }
    

