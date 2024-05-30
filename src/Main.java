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
        Procesadores_AMD prec5 = new Procesadores_AMD(12, 128,4400,"Ryzen 9 7900X3D","AM5",true);
        Procesadores_AMD prec6 = new Procesadores_AMD(8, 32, 3800, "AMD Ryzen 7 7700", "AM5", true );
        Procesadores_AMD prec7 = new Procesadores_AMD(8, 8, 3.3, "AMD FX-8300", "AM3+", true );


        //Ariel Sanches INTEL 10 11 12







        //Marlon nicolalde AMD 13 14 15







        }
    }
