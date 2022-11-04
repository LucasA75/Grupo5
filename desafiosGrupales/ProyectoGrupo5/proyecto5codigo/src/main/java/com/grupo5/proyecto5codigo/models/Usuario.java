package com.grupo5.proyecto5codigo.models;

public class Usuario extends Usuario_general {
    
    
    //constructores
    public Usuario() {
        super();
    }

    public Usuario(String nombre, String contraseña, String correo, int edad) {
        super(nombre, contraseña, correo, edad);
    }

    //funciones
    
    public void Anuncios(){
        System.out.println("Mostrar anuncios al pobre");
    }
    //to string
    @Override
    public String toString() {
        return super.toString() +"Usuario []";
    }


    
    
    
}
