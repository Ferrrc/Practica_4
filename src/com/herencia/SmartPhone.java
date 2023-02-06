package com.herencia;

public class SmartPhone extends SmartDevice{

    public boolean conectorAudifonos;
    public int numCamaras;

    public SmartPhone(){

    }

    public SmartPhone(int bateria, String modelo, int botones, boolean apruebaDeAgua, String entradaCargador, boolean conectorAudifonos, int numCamaras) {
        super(bateria, modelo, botones, apruebaDeAgua, entradaCargador);
        this.conectorAudifonos = conectorAudifonos;
        this.numCamaras = numCamaras;
    }
}
