package Procesadores;

public class Procesadores_AMD extends Procesadores_Escritorio{
     boolean sensor_temperatura;

    public Procesadores_AMD() {
    }

    public Procesadores_AMD(int nucleos, double consumo, double velocidad, String nombre, String soquet, boolean sensor_temperatura) {
        super(nucleos, consumo, velocidad, nombre, soquet);
        this.sensor_temperatura = sensor_temperatura;
    }
    public boolean getSensor_temperatura() {
        return sensor_temperatura;
    }
    public void setSensor_temperatura(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    public  void imprimir_AMD(){
        System.out.println("Nucleos del AMD: "+nucleos);

    }
}
