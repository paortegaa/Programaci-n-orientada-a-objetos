package com.company;


public class Mamifero {

    private int matricula;
    private String marca;
    private String modelo;
    private int km;
    private double precio;

    public Mamifero(int matricula, String marca, String modelo, int km, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "La matricula: "+matricula +"\n" +"La marca: "+marca+"\n"+"El modelo: "+modelo+"\n"+"El km: "+ km+"\n"+"El precio: "+precio+"\n";
    }
}
