package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Propietario {
    public String nombre;
    public String cedula;
    public String email;
    public String telefono;
    public String vehiculoRegistrado;
    public Collection<Vehiculo>vehiculosAsociados;

    public Propietario(String nombre, String cedula, String email, String telefono, String vehiculoRegistrado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.vehiculoRegistrado=vehiculoRegistrado;
        vehiculosAsociados=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Vehiculo> getVehiculosAsociados() {
        return vehiculosAsociados;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getVehiculoRegistrado() {
        return vehiculoRegistrado;
    }
    
}
