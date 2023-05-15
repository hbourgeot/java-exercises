/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacion = 0;
        double numero1 = 0, numero2 = 0;
        System.out.print("Ingrese un numero: ");
        numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese otro numero: ");
        numero2 = scanner.nextDouble();
        
        System.out.println("\nIngrese una operacion: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División.\nIngrese: ");
        operacion = scanner.nextInt();
        
        switch(operacion){
                case 1:
                    System.out.println("La suma es igual a: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es igual a: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación es igual a: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("La división es igual a: " + (numero1 / numero2));
                    break;
                default:
                    System.out.println("La opcion no existe, adios.");
        }
    }
    
}
