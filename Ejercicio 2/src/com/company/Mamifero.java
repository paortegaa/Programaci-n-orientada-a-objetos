package com.company;

public class Mamifero {

    private String nombre;
    private int numExtr;
    private String clasif;



    public Mamifero(String nombre, int numExtr, String clasif) {
        this.nombre = nombre;
        this.numExtr = numExtr;
        this.clasif = clasif;

    }
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Numero de extremidades: "+numExtr+"\n"+"Clasificacion: "+clasif+"\n";
    }
}
