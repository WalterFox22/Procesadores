package Procesadores;

public class Procesadores_Escritorio extends Procesadores{
    String soquet;

    public Procesadores_Escritorio() {
    }

    public Procesadores_Escritorio(String soquet) {
        this.soquet = soquet;
    }

    //setters y getters
    public String getSoquet() {
        return soquet;
    }

    public void setSoquet(String soquet) {
        this.soquet = soquet;
    }

    //imprimir datos
    public void Imprimir_datos_escritorio(){
        System.out.println(soquet);
    }
}