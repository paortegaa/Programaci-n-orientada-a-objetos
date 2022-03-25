package com.company;

public class Aves {
    //Definición de los atributos

    private String nombre;
    private String familia;
    private String orden ;
    private String filo;


    //Metodo constructor
    public Aves(String nombre, String familia, String orden,String filo) {
        this.nombre = nombre;
        this.familia = familia;
        this.orden = orden;
        this.filo = filo;
    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Familia: "+familia+"\n"+"Orden: "+orden+"\n"+
                "Filo: "+filo+"\n";
    }
}