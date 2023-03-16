
import java.util.Scanner;

/**
 * Sección 5: fundamentos java: sentencias de control
 *
 * 36. Sentencia de control switch en java 37. Ejercicio: cálculo estación del
 * año con switch
 *
 * @author Angel P.
 */

public class SentenciaCoSwitch {

    public static void main(String[] args) {
        /*
        Las comprobaciones con EXPRESIONES numéricas o String
        
        No es necesario agregar el úlitmo break, pero se hace por buena práctica
        
        EJEMPLO uno
         */
        int numero = 5;
        String numeroTexto = "número fuera de rango";

        switch (numero) {
            case 1:
                numeroTexto = "número uno";
                /*
                En caso de que se cumpla el caso, el uso de "break" va a impedir
                que se evualúen los siguientes casos.
                 */
                break;
            case 2:
                numeroTexto = "número dos";
                break;
            case 3:
                numeroTexto = "número tres";
                break;
            case 4:
                numeroTexto = "número cuatro";
                break;
//          default:
//          numeroTexto = "número fuera de rango";
        }
        System.out.println("Se ha ingresado: " + numeroTexto);

        //EJEMPLO dos
        Scanner consola = new Scanner(System.in);
        int mes;
        String mesTexto = "no has ingresado un mes válido";

        System.out.println("Ingresa el número del mes: ");
        mes = Integer.parseInt(consola.nextLine());

        switch (mes) {
            case 1:
            case 2:
            case 12:
                mesTexto = "nos encontramos en invierno";
                break;
            case 3:
            case 4:
            case 5:
                mesTexto = "nos encontramos en primavera";
                break;
            case 6:
            case 7:
            case 8:
                mesTexto = "nos encontramos en verano";
                break;
            case 9:
            case 10:
            case 11:
                mesTexto = "nos encontramos en otoño";
                break;
//          default:
//              mesTexto = "no has ingresado un mes válido";                   
        }
        System.out.println("Estación del año: " + mesTexto);
    }
}
