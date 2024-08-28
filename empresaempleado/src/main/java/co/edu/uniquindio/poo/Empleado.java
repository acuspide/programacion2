package co.edu.uniquindio.poo;

public abstract class Empleado implements Contribuyente {
    private String nombre;
    private String idEmpleado;
    private Departamento departamento;

    public Empleado(String nombre, String idEmpleado, Departamento departamento) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void mostrarDetalles();
}
