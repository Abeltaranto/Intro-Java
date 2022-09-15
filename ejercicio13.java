
package egg.introjava;

import java.util.Scanner;


public class ejercicio13 {


    public static void main(String[] args) {
       String[] equipo;
        equipo = new String[7];
       Scanner leer = new Scanner(System.in);
       
       for (int i=0; i < 7 ; i++){
           System.out.println("Ingrese el nombre del integrante");
           equipo[i] = leer.nextLine();
       }
           
    }
    
}
