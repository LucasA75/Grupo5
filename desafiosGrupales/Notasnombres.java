import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notasnombres {
    public static void main(String[] args) {
        Console console = System.console();
        Map <String,ArrayList> notasNombres = new HashMap <String,ArrayList>();
        int numPersonas = Integer.parseInt(console.readLine("Ingresa el número de estudiantes: "));

        for (int i=1; i<=numPersonas; i++){
            ArrayList <Double> notasPersonas = new ArrayList<Double>();
            String nombre = console. readLine("Ingrese el nombre de la persona: ");

                for (int j=1; j<=3; j++){
                 Double notasPersonaN = Double.parseDouble(console.readLine("ingrese la nota: " + j + " "));
                    if (notasPersonaN>=1 && notasPersonaN<=7){ //Si ingresa un valor correcto lo agregará al ArrayList de una vez
                    notasPersonas.add(notasPersonaN);
                    }
                     while(notasPersonaN>7 || notasPersonaN<1){ //Mientras el usuario ingrese valores fuera del rango se repetirá este bucle.
                        notasPersonaN = Double.parseDouble(console.readLine("ingrese un valor válido, entre 1 y 7, ingrese de nuevo la nota :"));
                        if (notasPersonaN>=1 && notasPersonaN<=7){ //Para que solo tome los valores que están dentro del rango.
                            notasPersonas.add(notasPersonaN); //Acá los agrega al ArrayList.
                        }
                    }
                 notasNombres.put(nombre,notasPersonas);    
           }
        System.out.println(notasNombres);
        
        for(String y: notasNombres.keySet()){
            float suma = 0.0f;
            for(Object x : notasNombres.get(y)){
                suma = (Float) x + suma;
            } 
            System.out.println("El promedio de: "+ y +" fue de: "+ Math.round(suma/numPersonas));   
        } 
   }
}
}