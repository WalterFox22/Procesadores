package Procesadores;

public class Procesadores_AMD extends Procesadores_Escritorio{
     boolean sensor_temperatura;

    public Procesadores_AMD() {
    }

    public Procesadores_AMD(int nucleos, double consumo, double velocidad, String nombre) {
        super(nucleos, consumo, velocidad, nombre);
    }

    public Procesadores_AMD(int nucleos, double consumo, double velocidad, String nombre, String soquet) {
        super(nucleos, consumo, velocidad, nombre, soquet);
    }

    public boolean isSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    public  void imprimir_AMD(){
        System.out.println("Nucleos del AMD: "+nucleos);

    }
}
