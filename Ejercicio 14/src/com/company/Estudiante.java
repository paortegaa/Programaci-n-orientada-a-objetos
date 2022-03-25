package com.company;

public class Estudiante {
    //Definición de los atributos

    private String nombre;
    private String apellido;
    private int edad;
    private String matricula ;
    private int semestre;
    private String carrera;





    //Metodo constructor
    public Estudiante(String nombre,String apellido,int edad, String matricula,int semestre,String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.matricula = matricula;
        this.semestre = semestre;
        this.carrera = carrera;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Nombre: "+nombre +"\n" +"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Matricula: "+matricula+"\n"+"Semestre: "+semestre+"\n"+"Carrera: "+carrera+"\n";
    }
}
