package com.generation.firstproyect.models;

public class Lapiz {
    String color;
    String material;
    String punta;
    String marca;
    int largo;

    void escribir(){
        System.out.println("estas escribiendo");
    }
    void traqueotomia(Boolean ahogado){
        if(ahogado==true){
        System.out.println("traqueotomia en proceso");
        }
    }
    void apuñalar(Boolean peligro){
        if(peligro==true){
            System.out.println("apuñalar en el ojo y no retirar");
        }
    }
}
