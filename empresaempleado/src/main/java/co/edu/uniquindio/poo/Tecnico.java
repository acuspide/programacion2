package co.edu.uniquindio.poo;

public class Tecnico extends Empleado {
    public Tecnico(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
    }

    @Override
    public void contribuir() {
        System.out.println("El Técnico " + getNombre() + " está contribuyendo al proyecto con su experiencia técnica.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Técnico: " + getNombre() + " (ID: " + getIdEmpleado() + "), Departamento: " + getDepartamento().getNombre());
    }
}
