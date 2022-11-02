package com.generation.firstproyect.models;

public class Celular {
    String tamaño;
    String modelo;
    String marca;
    String camara;
    int ram;
    int rom; 
    String tipoCargador;
    String SO;

    void escucharMusica(){
        System.out.println("pon tu playlist");
    }
    String llamar(String contacto){
        if(contacto=="contesta"){
            return "conectar llamada";    
        }
        return "no responde";
    }
    void jugar(){
        System.out.println("abrir juego");
    }



    
}
