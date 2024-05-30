import Procesadores.Procesadores;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;

public class Main {
    public static void main(String[] args) {

        // Integrante uno Walter Cobacango 123
        Procesadores_AMD prec1 = new Procesadores_AMD(12, 105, 4.8, "AMD Ryzen 9 5900X", "AM4", true);
        Procesadores_AMD prec2 = new Procesadores_AMD(8, 105, 4.7, "AMD Ryzen 7 5800X", "Socket AM4",true);
        Procesadores_AMD prec3 = new Procesadores_AMD(6, 65, 4.6, "AMD Ryzen 5 5600X", "Socket AM4", true);
        prec1.imprimir_AMD();
        prec2.imprimir_AMD();
        prec3.imprimir_AMD();



        //Richard Padilla 4 5 6
        Procesadores_Intel prec4 = new Procesadores_Intel( );
        Procesadores_Intel prec = new Procesadores_Intel( );
        prec3.imprimir_Intel();
        prec4.imprimir_Intel();

        //Kevin Mendoza AMD 7 8 9





        //Ariel Sanches INTEL 10 11 12







        //Marlon nicolalde AMD 13 14 15







        }
    }
