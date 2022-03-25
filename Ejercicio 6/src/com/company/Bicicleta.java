package com.company;

public class Bicicleta {
    //Definición de los atributos
    private int rodada;
    private String color;
    private String marca;
    private String modelo ;
    private int velocidades;
    private String tipo;

    //Metodo constructor
    public Bicicleta(int rodada, String color, String marca,String modelo, int velocidades,String tipo) {
        this.rodada = rodada;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidades = velocidades;
        this.tipo = tipo;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Rodada: "+rodada +"\n" +"Color: "+color+"\n"+"Marca: "+marca+"\n"+
                "Modelo: "+modelo+"\n"+"Velocidades: "+velocidades+"\n"+"Tipo: "+tipo+"\n";
    }
}
