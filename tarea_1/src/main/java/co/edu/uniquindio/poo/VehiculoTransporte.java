package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class VehiculoTransporte extends Vehiculo {
    public int maximoPasajeros;
    public Collection<Usuario>usuariosAsociados;


    public VehiculoTransporte(String placa, String modelo, String marca, String color, String responsable, int maximoPasajeros) {
        super(placa, modelo, marca, color, responsable);
        this.maximoPasajeros = maximoPasajeros;
        usuariosAsociados=new LinkedList<>();
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public Collection<Usuario> getUsuariosAsociados() {
        return usuariosAsociados;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public void setUsuariosAsociados(Collection<Usuario> usuariosAsociados) {
        this.usuariosAsociados = usuariosAsociados;
    }    
    
}
