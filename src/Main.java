// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
//Esta libreria es para el almacenamiento de pares ordenados que serviran para las transiciones
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
class Maquinaturing {
    private static class maquinaTuring{
        char leer;
        char escribir;
        char movimiento;
        String sigmovimiento;

        // Realizar el constructor es de maquinaTuring
        public maquinaTuring(char leer, char escribir, char movimiento, String sigmovimiento){
            this.leer = leer;
            this.escribir=escribir;
            this.movimiento=movimiento;
            this.sigmovimiento=sigmovimiento;

        }
    }

    private Map<String, Map<Character, maquinaTuring>>transiciones;
    private String estadoInicial;//q1
    private Set<String> estadoFinal;//le estamos diciendo que es un conjunto de estadosfinales
    private char blanco ='%';

    public Maquinaturing (String estadoInicial, Set<String> estadoFinal){
        //Inicializacion del mapa de transisciones de pares ordenados con tabla de hash
        this.transiciones= new HashMap<>();
        this.estadoInicial=estadoInicial;
        this.estadoFinal=estadoFinal;
    }

    //Metodo de Agregar Transiciones
    public void añadir(String EstadoActual,char leer, char escribir, char movimiento, String EstadoSiguiente){
        transiciones.putIfAbsent(EstadoActual, new HashMap<>());// verifica la exitencia del estado sino lo crea
        transiciones.get(EstadoActual).put(leer, new maquinaTuring(leer, escribir, movimiento, EstadoSiguiente));// sirve para asginarle las condiciones al estado actual
    }





}






public class Main {
    public static void main(String[] args) {

    }
}