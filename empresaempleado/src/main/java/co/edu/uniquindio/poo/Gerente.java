package co.edu.uniquindio.poo;

public class Gerente extends Empleado {
    public Gerente(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
    }

    @Override
    public void contribuir() {
        System.out.println("El Gerente " + getNombre() + " está contribuyendo al proyecto gestionando el equipo.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente: " + getNombre() + " (ID: " + getIdEmpleado() + "), Departamento: " + getDepartamento().getNombre());
    }
}


