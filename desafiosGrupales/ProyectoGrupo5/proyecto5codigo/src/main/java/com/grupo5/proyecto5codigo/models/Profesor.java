package com.grupo5.proyecto5codigo.models;

public class Profesor extends Usuario_general {
    //Constructores.
    public Profesor() {
        super();
    }

    public Profesor(String nombre, String contraseña, String correo, int edad) {
        super(nombre, contraseña, correo, edad);
    }


    //To string
    @Override
    public String toString() {
        return super.toString() +  "Profesor []";
    }
}
