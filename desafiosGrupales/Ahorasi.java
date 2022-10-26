import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//listaNotas.clear(); //Clear se ocupa para vaciar la lista
public class Ahorasi {
    public static void main(String[] args) {
        //Pedir el nombre y que me ingrese tres notas
        //o que me ingrese el promedio de las notas
        //Los valores se guardaran en un HashMap donde la llave sera el nombre
        //y el valor sera el arrayList de las notas
        //el promedio tiene que salir con 1 decimal (+)
        //ahora no se pueden ingresar notas menores a 0 y mayores a 7
        // tiene que volver a pedir la nota

        Console console = System.console();
        
        Map<String, ArrayList> infoAlumno = new HashMap <String, ArrayList>();
        
        
        
        System.out.println("--Bienvenido a juegos mentales--");

        int cantidadAlumnos = Integer.parseInt(console.readLine("Ingresa la cantidad de alumnos: "));
        for(int i=0;i<cantidadAlumnos;i++){
            
            ArrayList <Float> listaNotas = new ArrayList <Float>();
            String nombre = console.readLine("Ingrese el nombre del alumno: ");
            
            int cantidadDeNotas = Integer.parseInt(console.readLine("Ingresa la cantidad De Notas: "));
                while(cantidadDeNotas != 0){
                    Float nota = Float.parseFloat(console.readLine("Ingresa las notas: "));//Aqui ingresamos las notas a un arrayList
                    
                        if(nota >= 1 && nota <= 7){
                            listaNotas.add(nota);
                            --cantidadDeNotas;
                            infoAlumno.put(nombre,listaNotas);
                        }
                        else{
                            System.out.println("Ingresaste una nota incorrecta , coloca dentro una del rango del 1 al 7 ");
                            System.out.println("la nota que ingresaste fue: " +  nota);
                        }
                        
                }
            for(String y: infoAlumno.keySet()){
            float suma = 0.0f;
            for(Object x : infoAlumno.get(y)){
                suma = (Float) x + suma;
            }
            System.out.println("El promedio de: "+ y +" fue de: "+ Math.round(suma/cantidadAlumnos));
        }
    }
    }
}

