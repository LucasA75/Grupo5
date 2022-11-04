package com.grupo5.proyecto5codigo.models;

public class Editor extends Usuario_general {

    public Editor() {
        super();
    }

    public Editor(String nombre, String contraseña, String correo, int edad) {
        super(nombre, contraseña, correo, edad);
    }
    
    //Funcion.
    public void verificar(Boolean informacion){
        if(informacion == true){
            System.out.println("Informacion verdadera. (Ticket azul)");
        }

        else{
            System.out.println("Informacion falsa. (Eliminar)");
        }
    }

    public void editar_bot(String editar){
        if(editar == "si"){
            System.out.println("Editaste el bot.");
        }
        else if(editar == "no"){
            System.out.println("No editas el bot.");
        }
        else{
            System.out.println("No haces nada.");
        }
    }

    public void editar_pub(String editar){
        if(editar == "si"){
            System.out.println("Editaste la publicacion.");
        }
        else if(editar == "no"){
            System.out.println("No editas la publicacion.");
        }
        else{
            System.out.println("No haces nada.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Editor []";
    }

    
}
