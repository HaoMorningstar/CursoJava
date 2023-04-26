/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import  java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tipoMotor = new Scanner(System.in);
        System.out.println("Ingrese un valor del 1 al 4 para su tipo de motor");
        int num1 = tipoMotor.nextInt();
        switch(num1){
            case 1 :
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2 :
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3 :
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4 :
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default :
                System.out.println("No existe una descripcion para el valor ingresado");
    }
    }
}
    
