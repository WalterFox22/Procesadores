import Procesadores.Procesadores;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;

public class Main {
    public static void main(String[] args) {

        // Integrante uno Walter Cobacango 123
        Procesadores_AMD prec1 = new Procesadores_AMD(34, 23.55, 45.66, "WALT", "AA", true);
        Procesadores_AMD prec2 = new Procesadores_AMD();
        Procesadores_AMD prec3 = new Procesadores_AMD();
        prec2.imprimir_AMD();



        //Richard Padilla 4 5 6
        Procesadores_Intel prec3 = new Procesadores_Intel( );
        Procesadores_Intel prec4 = new Procesadores_Intel( );
        prec3.imprimir_Intel();
        prec4.imprimir_Intel();

        //Kevin Mendoza AMD 7 8 9





        //Ariel Sanches INTEL 10 11 12







        //Marlon nicolalde AMD 13 14 15







        }
    }
