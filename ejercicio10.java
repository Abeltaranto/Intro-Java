
package egg.introjava;
import java.util.Scanner;

public class ejercicio10 {
    

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);    
    int num1, num2, num3, num4, num;
    
    num1 = 0;        
    num2 = 0;
    num3 = 0;
    num4 = 0;
    
        do{
           System.out.println("Ingrese un número entre 1 y 20");
           num = leer.nextInt();
           if (num >= 1 && num <= 20){
             if (num1 != 0 && num2 != 0 && num3 != 0){
                   num4 = num;
             } else if (num1 != 0 && num2 != 0 && num4 == 0){
                   num3 = num;
             } else if (num1 != 0 && num3 == 0 && num4 == 0){
                   num2 = num; 
             } else if (num2 == 0 && num3 == 0 && num4 == 0){
                   num1 = num;       
                 }
           }else{
           System.out.println("El numero ingresado está fuera de rango");
           }
        } while (num4 == 0);
        
        System.out.print(num1+" ");
        for ( int i = 0; i < num1; i++) {
            System.out.print("*");
        } 
        System.out.println();
        
         System.out.print(num2+" ");
        for ( int i = 0; i < num2; i++) {
            System.out.print("*");
        } 
        System.out.println();
        
         System.out.print(num3+" ");
        for ( int i = 0; i < num3; i++) {
            System.out.print("*");
        } 
        System.out.println();
        
         System.out.print(num4+" ");
        for ( int i = 0; i < num4; i++) {
            System.out.print("*");
        } 
        System.out.println();
    }
}
