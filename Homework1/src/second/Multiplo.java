package second;

/* Crear la clase “Multiplo”, que contenga el método main(), en el que se determinen y muestren por pantalla los
números múltiplos de 4 a partir de 42 y hasta el 150 inclusive. Usar la instrucción iterativa más apropiada. */
public class Multiplo {
    public static void main(String[] args) throws Exception {
        showMultiplos(4, 42, 150);
    }

    public static void showMultiplos(int number, int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(number + " * " + i + " = " + (i * number));
        }
    }
}
