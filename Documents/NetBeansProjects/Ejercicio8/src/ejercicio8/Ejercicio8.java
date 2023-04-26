/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//pedirá de nuevo hasta que la nota sea correcta.
    Scanner leer = new Scanner(System.in);
    double nota = 11;
    while (nota > 10 || nota < 0){
        System.out.println("Ingrese una nota entre 0 y 10");
        nota= leer.nextDouble();
        }
        System.out.println("La nota "+ nota +  " ingresada es valida");
    }
     
}
