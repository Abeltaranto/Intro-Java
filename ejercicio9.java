
package egg.introjava;
import java.util.Scanner;

public class ejercicio9 {

   public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int conteo, num, suma;
     conteo = 0;
     suma = 0;
     num = 0;
     System.out.println("Ingrese 20 numeros");
     
     do{conteo++;
        num = leer.nextInt();
        if (num == 0){System.out.println("Se capturó el número cero.");
            break;}
          else if (num < 0){continue;}   
        
          else if (num > 0){
            suma = suma + num;    
            }
         
        if (conteo == 20){System.out.println("Se completaron los 20 intentos");
            System.out.println("La suma de los números es: "+suma);
            break;
        } 

     }while (conteo < 20);
   }
    
}
