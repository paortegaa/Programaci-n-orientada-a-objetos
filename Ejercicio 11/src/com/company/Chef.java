package com.company;

public class Chef {
    //Definición de los atributos

    private String nombre;
    private String especialidad;
    private int añoExpe ;



    //Metodo constructor
    public Chef(String nombre, String especialidad, int añoExpe) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añoExpe = añoExpe;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Especialidad: "+especialidad+"\n"+"Años de experiencia: "+añoExpe+"\n";

    }
}