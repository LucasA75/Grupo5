package com.grupo5.proyecto5codigo.models;

public class Admin extends Usuario_general {
    //Constructores.
    public Admin() {
        super();
    }

    public Admin(String nombre, String contraseña, String correo, int edad) {
        super(nombre, contraseña, correo, edad);
    }

    //Funciones:

    //Publicaciones.
    public void publicaciones(Boolean aceptas){
        if(aceptas == true){
            System.out.println("Se confirma la publicacion.");
        }
        else{
            System.out.println("Se rechazo la publicacion.");
        }
    }

    //To string
    @Override
    public String toString() {
        return super.toString() + "Admin []";
    }
    

}
