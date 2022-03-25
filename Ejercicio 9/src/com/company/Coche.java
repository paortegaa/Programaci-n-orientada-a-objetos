package com.company;

public class Coche {
    //Definición de los atributos

    private String matricula;
    private String marca;
    private String modelo ;
    private String color;
    private String trans;
    private String kilom;


    //Metodo constructor
    public Coche(String matricula, String marca, String modelo,String color,String trans,String kilom) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.trans = trans;
        this.kilom = kilom;
    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Matricula: "+matricula +"\n" +"Marca: "+marca+"\n"+"Modelo: "+modelo+"\n"+
                    "Color: "+color+"\n"+"Transmisión: "+trans+"\n"+"Kilometros: "+kilom+"\n";
    }
}