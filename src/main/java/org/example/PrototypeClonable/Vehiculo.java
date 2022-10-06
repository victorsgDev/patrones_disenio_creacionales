package org.example.PrototypeClonable;

public class Vehiculo implements Cloneable {
    public String marca;
    public String modelo;
    int anyoFabricacion;

    public Vehiculo clonar() throws CloneNotSupportedException {
        return (Vehiculo) this.clone();
    }
}
