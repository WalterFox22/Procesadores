package Procesadores;

public class Procesadores_Intel extends Procesadores_Escritorio{
    boolean tarjeta_video;

    public Procesadores_Intel() {
    }

    public Procesadores_Intel(int nucleos, double consumo, double velocidad, String nombre, String soquet, boolean tarjeta_video) {
        super(nucleos, consumo, velocidad, nombre, soquet);
        this.tarjeta_video = tarjeta_video;
    }

    public boolean getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }
    public void imprimir_Intel(){
        System.out.println("Nucleos: " + getNucleos());
        System.out.println("Consumo: " + getConsumo());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Soquet: " + getSoquet());
        System.out.println("Tarjeta: " + getTarjeta_video());

    }
}
