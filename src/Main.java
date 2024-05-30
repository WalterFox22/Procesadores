import Procesadores.Procesadores;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;

public class Main {
    public static void main(String[] args) {

        // Integrante uno Walter Cobacango 123
        Procesadores_AMD prec1 = new Procesadores_AMD(12, 105, 4.8, "AMD Ryzen 9 5900X", "AM4", true);
        Procesadores_AMD prec2 = new Procesadores_AMD();
        Procesadores_AMD prec3 = new Procesadores_AMD();
        prec2.imprimir_AMD();



        //Richard Padilla 4 5 6
        //Procesadores_Intel prec3 = new Procesadores_Intel( );
        Procesadores_Intel prec4 = new Procesadores_Intel( );
        //prec3.imprimir_Intel();
        prec4.imprimir_Intel();

        //Kevin Mendoza AMD 7 8 9





        //Ariel Sanches INTEL 10 11 12







        //Marlon nicolalde AMD 13 14 15
        Procesadores_AMD prec13=new Procesadores_AMD(8, 3.56, 8.98, "Ryzen 5", "R5AMD", true);
        Procesadores_AMD prec14=new Procesadores_AMD(12, 6.78, 9.67, "Ryzen 7", "R7AMD", false);
        Procesadores_AMD prec15=new Procesadores_AMD(4, 2.45, 4.65, "Ryzen 3", "R3AMD", true);
        prec13.imprimir_AMD();
        prec14.imprimir_AMD();
        prec15.imprimir_AMD();






        }
    }
