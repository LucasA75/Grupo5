/*EJERCICIO 1 EN ARRAY:

Cree una clase que se llame conversorPeso
cree un menú en donde se le pida al usuario ingresar:
1 si desea covertir el peso en marte
2 si desea convertir el peso en luna.
Luego pida al usuario el peso que desea convertir.
realice la busqueda de cuantos kilos en tierra son en marte y en la luna
calcule cuanto sería el peso ingresado
muestre en pantalla el siguente mensaje según la seleccion del usuario
"El peso ingresado en la luna sería de: ...."
"El peso ingresado en Marte sería de: ...."
 */

 //IMPORTACIONES NECESARIAS
import java.io.Console;
import java.util.ArrayList;

public class convertir_peso_array {
    public static void main(String[] args){

        Console console = System.console();

        ArrayList <Double> pesosPesado = new ArrayList <Double> (); // Definimos ArrayList de tipo <Double> como pesosPesado.

              
       int personas = Integer.parseInt(console.readLine("Ingresa cuántas personas se pesarán: ")); // Ingresa la cantidad de personas.

        for(int i = 0 ; i<personas;i++){ // Bucle que repite el ciclo hasta que i llegue a la cantidad de personas ingresadas.

            int planeta = Integer.parseInt((console.readLine("Ingrese 1 si desea Marte o 2 si desea Luna:  "))); // Eleccion planeta o satelite.
            switch(planeta){
           
                case 1: // Si planeta = "1"
                Double peso_dou = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: ")); // Entrada del peso.
                Double peso_marte = (peso_dou / 9.81) * 3.711 ; // Transformacion del peso a peso en Marte.
                System.out.println("El peso en marte es : " + peso_marte); // Salida del peso en Marte.
                pesosPesado.add(peso_marte); // Se añade el peso al array pesosPesado.
                break;
    
                case 2: // Si planeta = "2"
                Double peso_dou2 = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: ")); // Entrada del peso.
                Double peso_luna = (peso_dou2 / 9.81) * 1.622; // Transformacion del peso a peso en la Luna.
                System.out.println("El peso en la luna es: " + peso_luna); // Salida del peso en la Luna.
                pesosPesado.add(peso_luna); // Se añade el peso al array pesosPesado.
                break;
    
                default: // Si la eleccion no es "1" ni "2".
                System.out.println("No seleccionaste un planeta");
            }
        }

        System.out.println("******************************");
        System.out.println(pesosPesado); // Salida que muestra lo que hay en pesosPesado.
        System.out.println("Haz finalizado el programa"); 
    }
}
