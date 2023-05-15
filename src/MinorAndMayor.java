
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MinorAndMayor {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int a, b;
        
        System.out.println("Ingrese un numero: ");
        a = sn.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        b = sn.nextInt();
        
        if(a > b){
            System.out.println(a + " es mayor que " + b);
        } else if(a == b){
            System.out.println(a + " es igual a " + b);
        } else{
            System.out.println(a + " es menor que " + b);
        }
    }
}
