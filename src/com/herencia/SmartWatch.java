package com.herencia;

public class SmartWatch extends  SmartDevice{

    public int hora;
    public boolean llamadas;

    public SmartWatch (){

    }

    public SmartWatch(int bateria, String modelo, int botones, boolean apruebaDeAgua, String entradaCargador, int hora, boolean llamadas) {
        super(bateria, modelo, botones, apruebaDeAgua, entradaCargador);
        this.hora = hora;
        this.llamadas = llamadas;
    }
}
