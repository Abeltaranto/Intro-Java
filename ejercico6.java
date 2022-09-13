/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;
import java.util.Scanner;

/**
 *
 * @author A257926
 */
public class ejercico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numerso enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if(num1 > 25 && num2 > 25) {
        System.out.println("Ambos números son mayores que 25");
        }else if (num1 > 25 && num2 < 26){
        System.out.println(num1 + " es mayor que 25 solamente.");
        }else if (num1 < 26 && num2 > 25) {
        System.out.println(num2 + " solamente es mayor que 25.");
        }else {System.out.println("Ningun número ingresado es mayor que 25.");
        }
    }
}
