package com.company;

public class Cantante {
    //Definición de los atributos

    private String nombre;
    private int edad;
    private String fechnaci ;



    //Metodo constructor
    public Cantante(String nombre, int edad,String fechnaci) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechnaci = fechnaci;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Edad: "+edad+"\n"+"Fecha de nacimiento: "+fechnaci+"\n";

    }
}
