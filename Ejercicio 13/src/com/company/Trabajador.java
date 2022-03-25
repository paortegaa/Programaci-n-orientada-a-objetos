package com.company;
public class Trabajador {
    //Definición de los atributos

    private String nombre;
    private String apellido;
    private int edad;
    private String cargo ;
    private int sueldo;
    private String direccion;





    //Metodo constructor
    public Trabajador(String nombre,String apellido,int edad, String cargo,int sueldo,String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.direccion = direccion;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Cargo: "+cargo+"\n"+"Sueldo: "+sueldo+"\n"+"Dirección: "+direccion+"\n";

    }
}
