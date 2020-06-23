package com.gm.mundopc;

public class DispoEntrada {

    private String tipoEntrada;
    private String marca;

    public DispoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }

}
