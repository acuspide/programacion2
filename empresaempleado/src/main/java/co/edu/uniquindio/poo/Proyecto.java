package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Contribuyente> contribuyentes;

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contribuyentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void agregarContribuyente(Contribuyente contribuyente) {
        contribuyentes.add(contribuyente);
    }

    public void mostrarDetalles() {
        System.out.println("Proyecto: " + nombre + " (Código: " + codigo + ")");
        System.out.println("Contribuyentes:");
        for (Contribuyente contribuyente : contribuyentes) {
            contribuyente.contribuir();
        }
    }
}
