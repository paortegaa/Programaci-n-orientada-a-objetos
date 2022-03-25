package com.company;

public class Calzado {
    //Definición de los atributos
    private int num;
    private String color;
    private String material;
    private String tipoCalz;

    //Metodo constructor
    public Calzado(int num, String color, String material,String tipoCalz) {
        this.num = num;
        this.color = color;
        this.material = material;
        this.tipoCalz = tipoCalz;

    }
    //Se sobreescriben los valores con toString
    @Override
    public String toString(){
        return "Número del calzado: "+num +"\n" +"Color: "+color+"\n"+"Material: "+material+"\n"+
                "Tipo de calzado: "+tipoCalz+"\n";
    }
}

