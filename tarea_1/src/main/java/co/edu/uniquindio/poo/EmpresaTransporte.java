package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class EmpresaTransporte {

    public Collection<Propietario>propietarios;
    public Collection<VehiculoTransporte>vehiculosTransporte;
    public Collection<VehiculoCarga>vehiculosCarga;



    public EmpresaTransporte(){        
        propietarios = new LinkedList<>();
        vehiculosCarga = new LinkedList<>();
        vehiculosTransporte = new LinkedList<>();

    }


    public Collection<Propietario> getPropietarios() {
        return propietarios;
    }



    public Collection<VehiculoTransporte> getVehiculosTransporte() {
        return vehiculosTransporte;
    }



    public Collection<VehiculoCarga> getVehiculosCarga() {
        return vehiculosCarga;
    }

    
}
