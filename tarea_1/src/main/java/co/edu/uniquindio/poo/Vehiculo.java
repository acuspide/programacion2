package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Vehiculo {

    public String placa;
    public String modelo;
    public String marca;
    public String color;
    public String responsable;
    public Collection<Propietario>propietariosAsociados;

    public Vehiculo(String placa, String modelo, String marca, String color, String reponsable) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.responsable=reponsable;
        propietariosAsociados=new LinkedList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Collection<Propietario> getPropietariosAsociados() {
        return propietariosAsociados;
    }
    
}
