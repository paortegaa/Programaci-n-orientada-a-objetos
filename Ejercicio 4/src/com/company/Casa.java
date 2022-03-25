package com.company;

public class Casa {
    //Definición de los atributos
    private int numhab;
    private String color;
    private String material;
    private String largo;
    private String ancho;
    private String altura;

    //Metodo constructor
    public Casa(int numhab, String color, String material,String largo,String ancho,String altura) {
        this.numhab = numhab;
        this.color = color;
        this.material = material;
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Numero de habitaciones: "+numhab +"\n" +"Color: "+color+"\n"+"Material: "+material+"\n"+
                "Largo: "+largo+"\n"+"Ancho: "+ancho+"\n"+"Altura: "+altura+"\n";
    }
}

