package com.grupo5.proyecto5codigo.models;

import java.io.Console;

public class Usuario_general {
    Console console = System.console();
    //Caracteristicas.
    String nombre;
    String contraseña;
    String correo;
    int edad;

    //Constructores.
    public Usuario_general(String nombre, String contraseña, String correo, int edad) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
    }
    public Usuario_general() {
    }


    //Setters and getters.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Funciones.

    //Bienvenida
    public void bienvenido(String nombre){
        System.out.println("Bienvenido "+ nombre);
    }

    //Preguntas
    public void pregunta(String pregunta){
        System.out.println("Tu pregunta es "+pregunta );
    }

    //Chatbot
    public void chatbot(Boolean bot){
        if(bot){
            System.out.println("Bienvenidos al hymalaya");
        }
        else{
            System.out.println("Paga la membresia porfavor amigo.");
        }
    }

    //Memebresia
    public void membresia(String credito){
        Boolean condicion = true;
        while(condicion){
            int tarjeta = Integer.parseInt(console.readLine("Ingrese tarjeta de credito: "));
            if(tarjeta > 0){
                condicion = false;
            }
            else{
                System.out.println("Ingresa lah moneah oe");
            }
        }
    }
 

    //To string.

    @Override
    public String toString() {
        return "Usuario_general [nombre=" + nombre + ", contraseña=" + contraseña + ", correo=" + correo + ", edad="
                + edad + "]";
    }


}
