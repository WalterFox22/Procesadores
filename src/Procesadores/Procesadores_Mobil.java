package Procesadores;

public class Procesadores_Mobil extends  Procesadores{
    boolean optimizacion_energia;

    public Procesadores_Mobil() {
    }

    public Procesadores_Mobil(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    // setters y gettes
    public boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    //imprimir datos
    public void imprimir_datos_mobiles(){
        System.out.println(optimizacion_energia);
    }
}
