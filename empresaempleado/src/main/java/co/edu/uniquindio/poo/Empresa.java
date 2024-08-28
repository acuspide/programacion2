package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;
    private List<Departamento> departamentos;
    private List<Proyecto> proyectos;

    public Empresa() {
        empleados = new ArrayList<>();
        departamentos = new ArrayList<>();
        proyectos = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void listarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
        }
    }

    public void listarDepartamentos() {
        for (Departamento departamento : departamentos) {
            departamento.mostrarDetalles();
        }
    }

    public void listarProyectos() {
        for (Proyecto proyecto : proyectos) {
            proyecto.mostrarDetalles();
        }
    }
}