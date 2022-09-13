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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingreseun número entre 0 y 10.");
                num = leer.nextInt();
                if (num >=0 && num <=10){break;
                }
        } while( num <0 || num >10);      
     System.out.println("Ingresaste un numero correcto!");
    }
    
}
