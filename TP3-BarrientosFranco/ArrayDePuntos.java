/**
 * Clase Ejecutable de Punto
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class ArrayDePuntos implements MenuOption {

    public static void main(String[] args) {
        new ArrayDePuntos().run();
    }

    /**
     * Se declara un arreglo estatico de Punto, y
     * luego se insertan por teclado sus valores, para luego testear su interfaz
     * */
    @Override
    public void run() {
        System.out.println("A continuacion ingrese 6 Puntos ");
        Punto[] puntos = new Punto[6];

        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = this.createPuntoByKeyboard();
            puntos[i].mostrar();
            if (i > 0) {
                System.out.println(String.format("Distancia pto%s-pto%s : %s",
                        i,
                        i + 1,
                        puntos[i].distanciaA(puntos[i - 1])));
            }
        }

    }

    private Punto createPuntoByKeyboard() {
        return new Punto(
                InputHelper.scanDoubleByKeyboardAndPrint("Ingrese la cordenada y: "),
                InputHelper.scanDoubleByKeyboardAndPrint("Ingrese la cordenada x: ")
        );
    }
}
