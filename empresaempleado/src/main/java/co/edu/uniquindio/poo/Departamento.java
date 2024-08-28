package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> empleados;

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarDetalles() {
        System.out.println("Departamento: " + nombre + " (Código: " + codigo + ")");
        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
        }
    }
}
