import Procesadores.Procesadores;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;

public class Main {
    public static void main(String[] args) {

        // Integrante uno Walter Cobacango
        Procesadores_AMD prec1 = new Procesadores_AMD(34, 23.55, 45.66, "WALT", "AA", true);
        Procesadores_AMD prec2 = new Procesadores_AMD();

        prec2.imprimir_AMD();



        //Richard Padilla
        Procesadores_Intel prec3 = new Procesadores_Intel( );
        Procesadores_Intel prec4 = new Procesadores_Intel( );
        prec3.imprimir_Intel();
        prec4.imprimir_Intel();

        //Kevin Mendoza AMD





        //Ariel Sanches INTEL







        //Marlon Nicolalde AMD (13-15)
        Procesadores_AMD prec13=new Procesadores_AMD(8, 8.45, 12.56, "Ryzen 9", "R9AMD", true);
        Procesadores_AMD prec14=new Procesadores_AMD(4, 16.55, 4.56, "Ryzen 3", "R3AMD", false);
        Procesadores_AMD prec15=new Procesadores_AMD(5, 7.32, 5.89, "Ryzen 5", "R5AMD",false);
        prec13.imprimir_AMD();
        prec14.imprimir_AMD();
        prec15.imprimir_AMD();





        }
    }
