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
        Procesadores_AMD prec7 = new Procesadores_AMD(12, 128,4.4,"Ryzen 9 7900X3D","AM5",true);
        Procesadores_AMD prec8 = new Procesadores_AMD(8, 32, 3.8, "AMD Ryzen 7 7700", "AM5", true );
        Procesadores_AMD prec9 = new Procesadores_AMD(8, 8, 3.3, "AMD FX-8300", "AM3+", true );
        prec7.imprimir_AMD();
        prec8.imprimir_AMD();
        prec9.imprimir_AMD();


        //Ariel Sanches INTEL 10 11 12
        Procesadores_Intel prec10 = new Procesadores_Intel(6, 22.52, 2.1, "Xeon", "FCLGA2011", true);
        Procesadores_Intel prec11 = new Procesadores_Intel(6, 33.29, 3.5, "Xeon", "FCLGA2011", true);
        Procesadores_Intel prec12 = new Procesadores_Intel(6, 23.60, 2.5, "Xeon", "LGA1366", false);
        prec10.imprimir_Intel();
        prec11.imprimir_Intel();
        prec12.imprimir_Intel();





        //Marlon Nicolalde AMD 13-14-15
        Procesadores_AMD prec13=new Procesadores_AMD(8, 8.98, 10.54, "Ryzen 7", "R7AMD", false);
        Procesadores_AMD prec14=new Procesadores_AMD(4, 2.34, 4.43, "Ryzen 3", "R3AMD", false);
        Procesadores_AMD prec15=new Procesadores_AMD(5, 5.43, 5.12, "Ryzen 5", "R5AMD", true);
        prec13.imprimir_AMD();
        prec14.imprimir_AMD();
        prec15.imprimir_AMD();

        //Joel Parra xenon 3-2286g, silver 4210, gold 6148
        Procesadores_Intel prec16 = new Procesadores_Intel(6, 80, 3.8, "Intel Xeon E5-2286G", "LGA 1151", true );
        Procesadores_Intel prec17 = new Procesadores_Intel(10, 85, 2.2, "Intel Xeon Silver 4210", "LGA 3647", false);
        Procesadores_Intel prec18 = new Procesadores_Intel(20, 150, 2.4, "Intel Xeon Gold 6148", "LGA 3647", false);
        prec16.imprimir_Intel();
        prec17.imprimir_Intel();
        prec18.imprimir_Intel();


        }
    }
