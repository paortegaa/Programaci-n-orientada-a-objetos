package com.company;

public class Arbol {
    private String nomcient;
    private String clase;
    private String familia;
    private int diametro;
    private int edad;



    public Arbol(String nomcient, String clase, String familia,int diametro,int edad) {
        this.nomcient = nomcient;
        this.clase = clase;
        this.familia = familia;
        this.diametro = diametro;
        this.edad = edad;

    }
    @Override
    public String toString(){
        return "Nombre cientifico: "+nomcient +"\n" +"Clase: "+clase+"\n"+"Familia: "+familia+"\n"+"Diametro: "+diametro+"\n"+"Edad: "+edad+"\n";
    }
}

