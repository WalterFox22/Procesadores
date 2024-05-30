package Procesadores;

public class Procesadores_Escritorio extends Procesadores{
    String soquet;

    public Procesadores_Escritorio() {
    }

    public Procesadores_Escritorio(int nucleos, double consumo, double velocidad, String nombre) {
        super(nucleos, consumo, velocidad, nombre);
    }

    public Procesadores_Escritorio(int nucleos, double consumo, double velocidad, String nombre, String soquet) {
        super(nucleos, consumo, velocidad, nombre);
        this.soquet = soquet;
    }

    //setters y getters

    public void setSoquet(String soquet) {
        this.soquet = soquet;
    }

    public String getSoquet() {
        return soquet;
    }

    //imprimir datos
    public void Imprimir_datos_escritorio(){
        System.out.println(soquet);

    }
}
