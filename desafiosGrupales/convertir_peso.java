/*EJERCICIO 2 EN HashMap:

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

 // IMPORTACIONES NECESARIAS
import java.io.Console;
import java.util.Map;
import java.util.HashMap;

public class convertir_peso {
    public static void main(String[] args){
        Console console = System.console();

        Map<String, Double> nombrePeso = new HashMap <String, Double>(); // Definimos HashMap de tipo <String, Double> como nombrePeso.

        int personas = Integer.parseInt(console.readLine("Ingresa cuántas personas se pesarán: ")); // Ingresa la cantidad de personas.

        for(int i = 0 ; i < personas; i++){ // Bucle que repite el ciclo hasta que i llegue a la cantidad de personas ingresadas.

            int planeta = Integer.parseInt((console.readLine("Ingrese 1 si desea Marte o 2 si desea Luna:  "))); // Eleccion planeta o satelite.
            switch(planeta){

                case 1: // Si planeta = "1"
                String nombre = console.readLine("Ingrese su nombre: "); // Entrada donde se ingresa el nombre.
                Double peso_dou = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: ")); // Entrada del peso.
                Double peso_marte = (peso_dou / 9.81) * 3.711 ; // Conversion peso a peso Marte.
                System.out.println("El peso en marte es : " + peso_marte); // Se muestra el peso en Marte.
                nombrePeso.put(nombre, peso_marte); // Se añade los keys y los values a nuestro HashMap nombrePeso.       
                break;

                case 2: // Si planeta = "2"
                String nombre1 = console.readLine("Ingrese su nombre: "); // Entrada donde se ingresa el nombre.
                Double peso_dou2 = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: ")); // Entrada del peso.
                Double peso_luna = (peso_dou2 / 9.81) * 1.622; // Conversion peso a peso en la Luna.
                System.out.println("El peso en la luna es: " + peso_luna); // Se muestra el peso en la Luna.
                nombrePeso.put(nombre1, peso_luna); // Se añade los keys y los values a nombrePeso
                break;

                default: // Si planeta no es "1" ni "2"
                System.out.println("No seleccionaste un planeta");

            }
        } 
        // OPCIONES PARA MOSTRAR EL CONTENIDO DE <nombrePeso>:
        // Opcion 1:
        /*for (String i : nombrePeso.keySet()) {
            System.out.println("nombres: " + i + " peso: "+ nombrePeso.get(i));

        }
        System.out.println("******************************");
        System.out.println("Haz finalizado el programa"); */

        // Opcion 2:
        nombrePeso.forEach((k,v) -> System.out.println("Nombre: " + k + " || Peso: " + v)); // Muestra los keys y los values.

    }
}

