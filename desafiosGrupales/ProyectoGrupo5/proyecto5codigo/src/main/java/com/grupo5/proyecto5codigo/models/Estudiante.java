package com.grupo5.proyecto5codigo.models;
import java.io.Console;

public class Estudiante extends Usuario_general {
    Console console = System.console();
    //Constructores.
    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String contraseña, String correo, int edad) {
        super(nombre, contraseña, correo, edad);
    }


    public void curso(String hacer){
        hacer = console.readLine("Desea hacer el curso X: Si/No");
        if (hacer == "si"){
            System.out.println("Haz elegido hacer el curso.");
        }
        else if (hacer == "no"){
            System.out.println("No quieres hacer el curso.");
        }
        else{
            System.out.println("opcion no valida.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +  "Estudiante []";
    }

   


    
    
    
}
