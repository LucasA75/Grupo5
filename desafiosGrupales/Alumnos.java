import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//listaNotas.clear(); //Clear se ocupa para vaciar la lista
public class Alumnos {
    public static void main(String[] args) {
        //Pedir el nombre y que me ingrese tres notas
        //o que me ingrese el promedio de las notas
        //Los valores se guardaran en un HashMap donde la llave sera el nombre
        //y el valor sera el arrayList de las notas
        Console console = System.console();
        
        Map<String, ArrayList> infoAlumno = new HashMap <String, ArrayList>();
        
        
        
        System.out.println("--Bienvenido a juegos mentales--");

        int cantidadAlumnos = Integer.parseInt(console.readLine("Ingresa la cantidad de alumnos: "));
        for(int i=0;i<cantidadAlumnos;i++){
            ArrayList <Double> listaNotas = new ArrayList <Double>();
            String nombre = console.readLine("Ingrese el nombre del alumno: ");
            int cantidadDeNotas = Integer.parseInt(console.readLine("Ingresa la cantidad De Notas: "));
                for(int x=0; x < cantidadDeNotas;x++){
                listaNotas.add(Double.parseDouble(console.readLine("Ingresa las notas: "))); //Aqui ingresamos las notas a un arrayList
                infoAlumno.put(nombre,listaNotas);
                }
            Double sum = listaNotas.stream().mapToDouble(Double::valueOf).sum();
            System.out.println("El Promedio es: "+ sum / cantidadDeNotas);
            }
        infoAlumno.forEach((k,v)-> System.out.println("Nombre: " + k + " Notas: " + v));

    }
            

}
