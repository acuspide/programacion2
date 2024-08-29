package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Sistema de Gestión de Empleados");
            System.out.println("1. Agregar Gerente");
            System.out.println("2. Agregar Técnico");
            System.out.println("3. Agregar Departamento");
            System.out.println("4. Agregar Proyecto");
            System.out.println("5. Lista de Empleados");
            System.out.println("6. Lista de Departamentos");
            System.out.println("7. Lista de Proyectos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarGerente(empresa);
                    break;
                case 2:
                    agregarTecnico(empresa);
                    break;
                case 3:
                    agregarDepartamento(empresa);
                    break;
                case 4:
                    agregarProyecto(empresa);
                    break;
                case 5:
                    empresa.listarEmpleados();
                    break;
                case 6:
                    empresa.listarDepartamentos();
                    break;
                case 7:
                    empresa.listarProyectos();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void agregarGerente(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del gerente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese ID del gerente: ");
        String idEmpleado = scanner.nextLine();
        System.out.print("Ingrese nombre del departamento: ");
        String departamentoNombre = scanner.nextLine();
        Departamento departamento = buscarOcrearDepartamento(empresa, departamentoNombre);
        Gerente gerente = new Gerente(nombre, idEmpleado, departamento);
        empresa.agregarEmpleado(gerente);
        departamento.agregarEmpleado(gerente);
    }

    private static void agregarTecnico(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del técnico: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese ID del técnico: ");
        String idEmpleado = scanner.nextLine();
        System.out.print("Ingrese nombre del departamento: ");
        String departamentoNombre = scanner.nextLine();
        Departamento departamento = buscarOcrearDepartamento(empresa, departamentoNombre);
        Tecnico tecnico = new Tecnico(nombre, idEmpleado, departamento);
        empresa.agregarEmpleado(tecnico);
        departamento.agregarEmpleado(tecnico);
    }

    private static Departamento buscarOcrearDepartamento(Empresa empresa, String departamentoNombre) {
        Departamento departamento = null;
        for (Departamento d : empresa.getDepartamentos()) {
            if (d.getNombre().equals(departamentoNombre)) {
                departamento = d;
                break;
            }
        }
        if (departamento == null) {
            System.out.println("Departamento no encontrado. Creando un nuevo departamento.");
            departamento = new Departamento(departamentoNombre, "DEP" + (empresa.getDepartamentos().size() + 1));
            empresa.agregarDepartamento(departamento);
        }

        return departamento;
    }

    private static void agregarDepartamento(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del departamento: ");
        String nombre = scanner.nextLine();
        String codigo = "DEP" + (empresa.getDepartamentos().size() + 1);
        Departamento departamento = new Departamento(nombre, codigo);
        empresa.agregarDepartamento(departamento);
    }

    private static void agregarProyecto(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del proyecto: ");
        String nombre = scanner.nextLine();
        String codigo = "PROY" + (empresa.getProyectos().size() + 1);
        Proyecto proyecto = new Proyecto(nombre, codigo);
        empresa.agregarProyecto(proyecto);
    }
}
