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
        Procesadores_Intel prec4 = new Procesadores_Intel(8, 100, 4.2, "Intel Xeon E5-2620 V3", "socket 603", true );
        Procesadores_Intel prec5 = new Procesadores_Intel(16, 117, 4.8, "Intel core i5", "LGA1151", true);
        Procesadores_Intel prec6 = new Procesadores_Intel(24, 122, 5.0, "Intel core i7", "LGA2066", true);
        prec4.imprimir_Intel();
        prec5.imprimir_Intel();
        prec6.imprimir_Intel();

        //Kevin Mendoza AMD 7 8 9





        //Ariel Sanches INTEL 10 11 12
        Procesadores_Intel prec10 = new Procesadores_Intel(6, 22.52, 2.1, "Xeon", "FCLGA2011", true);
        Procesadores_Intel prec11 = new Procesadores_Intel(6, 33.29, 3.5, "Xeon", "FCLGA2011", true);
        Procesadores_Intel prec12 = new Procesadores_Intel(6, 23.60, 2.5, "Xeon", "LGA1366", false);






        //Marlon nicolalde AMD 13 14 15







        }
    }
