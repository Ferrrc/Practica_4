package com.herencia;

public class SmartDevice {

    public int bateria;
    public String modelo;
    public int botones;
    public boolean apruebaDeAgua;
    public String entradaCargador;

    public SmartDevice () {

    }

    public SmartDevice(int bateria, String modelo, int botones, boolean apruebaDeAgua, String entradaCargador) {
        this.bateria = bateria;
        this.modelo = modelo;
        this.botones = botones;
        this.apruebaDeAgua = apruebaDeAgua;
        this.entradaCargador = entradaCargador;
    }
}
