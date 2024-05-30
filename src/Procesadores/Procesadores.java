package Procesadores;

public class Procesadores {
    int nucleos;
    double consumo, velocidad;
    String nombre;

    public Procesadores() {
    }

    public Procesadores(int nucleos, double consumo, double velocidad, String nombre) {
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    // setter y getters


    public int getNucleos() {
        return nucleos;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // imprimir datos
    public void imprimir_datos(){
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Nombre: " + nombre);
    }
}
