package com.company;

public class Persona {
    //Definición de los atributos

    private String nombre;
    private String curp;
    private int edad ;
    private String sexo;
    private String telefono;



    //Metodo constructor
    public Persona(String nombre, String curp, int edad,String sexo,String telefono) {
        this.nombre = nombre;
        this.curp = curp;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Curp: "+curp+"\n"+"Edad: "+edad+"\n"+
                "Sexo: "+sexo+"\n"+"Telefono: "+telefono+"\n";
    }
}