package com.company;

public class Figura {
    //Definición de los atributos

    private String nombre;
    private int anginter;
    private int numlad;
    private int numdia;


    //Metodo constructor
    public Figura(String nombre,int anginter,int numlad, int numdia) {
        this.nombre = nombre;
        this.anginter = anginter;
        this.numlad = numlad;
        this.numdia = numdia;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Medida de los angulos internos: "+anginter+"\n"+"Número de lados: "+numlad+"\n"+"Número de diagonales: "+numdia+"\n";
    }
}
