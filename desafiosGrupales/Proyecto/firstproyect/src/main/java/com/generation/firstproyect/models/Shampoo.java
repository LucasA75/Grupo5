package com.generation.firstproyect.models;

public class Shampoo {
    String colorDeEnvase;
    String tapa;
    String FormatoDeEnvase;
    int largo;
    int volumen;
    String olor;
    String marca;

    void limpiar(){
        System.out.println("cabello limpio");
    }
    void aromatizar(Integer PH){
        if(PH>5){
            System.out.println("cambia de shampoo");
        }else{
            System.out.println("quedo olorocito mi rey");
        }
    }
    void espuma(){
        System.out.println("enjuage mi rey");
    }
}
