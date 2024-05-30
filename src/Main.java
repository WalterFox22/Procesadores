import Procesadores.Procesadores;
import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;

public class Main {
    public static void main(String[] args) {

        // Integrante uno
        Procesadores_AMD prec1 = new Procesadores_AMD();
        Procesadores_AMD prec2 = new Procesadores_AMD();
        prec1.imprimir_AMD();



        //Integrante dos
        Procesadores_Intel prec3 = new Procesadores_Intel();
        Procesadores_Intel prec4 = new Procesadores_Intel( );
        prec4.imprimir_Intel();







        }
    }
