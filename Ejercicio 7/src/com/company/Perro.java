package com.company;

public class Perro {
    //Definición de los atributos
    private int numpatas;
    private String nombre;
    private String raza;
    private String color ;
    private int años;


    //Metodo constructor
    public Perro(int numpatas, String nombre, String raza,String color, int años) {
        this.numpatas = numpatas;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.años = años;
    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Número de patas: "+numpatas +"\n" +"Nombre: "+nombre+"\n"+"Raza: "+raza+"\n"+
                "Color: "+color+"\n"+"Años: "+años+"\n";
    }
}