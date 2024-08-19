package co.edu.uniquindio.poo;

public class Usuario {
    public String nombre;
    public int edad;
    public double peso;
    public String vehiculoAsociado;

public Usuario(String nombre, int edad, double peso, String vehiculoAsociado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vehiculoAsociado=vehiculoAsociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVehiculoAsociado(String vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public int getEdad() {
        return edad;
    }

    public String getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public double getPeso() {
        return peso;
    }
    
}
