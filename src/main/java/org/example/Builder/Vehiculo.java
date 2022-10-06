package org.example.Builder;

public class Vehiculo {
    public String marca;
    public String tipo;
    public String motor;
    public int puertas;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMotor() {
        return motor;
    }

    public int getPuertas() {
        return puertas;
    }
}


