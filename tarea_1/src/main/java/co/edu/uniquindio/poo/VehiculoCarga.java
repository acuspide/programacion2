package co.edu.uniquindio.poo;

public class VehiculoCarga extends Vehiculo{
    public double capacidadCarga;
    public int numeroEjes;
    
    public VehiculoCarga(String placa, String modelo, String marca, String color, String responsable, double capacidadCarga,
            int numeroEjes) {
        super(placa, modelo, marca, color, responsable);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
    
}
