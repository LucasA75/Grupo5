package com.grupo5.proyecto5codigo.models;

public class Usuario extends Usuario_general {

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String correo, int edad) {
        super(nombre, contraseña, correo, edad);
    }


    
    @Override
    public String toString() {
        return super.toString() +"Usuario []";
    }


    
    
    
}
