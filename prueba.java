
package egg.introjava;


public class prueba {
    


    public static void main(String[] args) {
String letras,letra2,frase;
    String frase2;
    frase2 = "";
    letra2 = "";
    frase = "Hola mundo";
    int longitud;
    
        longitud = frase.length();
    
        for (int i=0;i<longitud;i++){
            letras = frase.substring(i, i++);
            switch (letras){
                case "a": letra2="@";
                break;
                case "e": letra2="#";
                break;
                case "i": letra2="$";
                break;
                case "o": letra2="%";
                break;
                case "u": letra2="*";
                break;
     
            }
            frase2 = frase2.concat(letra2);
        }
            
    }
}