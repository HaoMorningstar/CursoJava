/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
    import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.*/
       Scanner leer = new Scanner (System.in);
           int count = 0;
           int suma = 0;
       do   {           
           System.out.println("Ingrese un numero");
           int num = leer.nextInt();
       
           if (num == 0){
               System.out.println("Se ha ingresado el numero 0");
           break;}
           if (num > 0);{
                   suma = suma += num;
       }
           count++;
            }
       while (count < 20);
        System.out.println("El total de los numeros positivos ingresados es " + suma);
       }
                   
       
    }
       
       
    
    

