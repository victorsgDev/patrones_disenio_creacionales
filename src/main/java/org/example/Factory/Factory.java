package org.example.Factory;

public class Factory {
    private Precio precio;

    public Factory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            this.precio = new PrecioEUR();
        } else {
            this.precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}

