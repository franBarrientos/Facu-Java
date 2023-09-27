import java.util.HashMap;

/**
 * Clase ejecutable GestionComercio que permite gestionar un comercio y su lista de empleados.
 * Esta clase implementa la interfaz MenuOption y se utiliza para interactuar con el usuario a través de la consola.
 * Permite crear un comercio con valores predeterminados que incluyen empleados, y luego muestra la nómina de empleados.
 * La información se ingresa a través de la entrada estándar.
 *
 * @author Barrientos Franco y Cabrera Romani Lucas
 * @version V0.01
 */
public class GestionComercio implements MenuOption {

    /**
     * Método principal que crea una instancia de GestionComercio y llama al método run() para iniciar la interacción.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        new GestionComercio().run();
    }

    /**
     * Implementación del método run() de la interfaz MenuOption.
     * Permite interactuar con el usuario a través de la consola para crear un comercio con empleados y mostrar la nómina de empleados.
     */
    @Override
    public void run() {
        Comercio miComercio = new Comercio(
                "Fran Company",
                new HashMap<>(){{
                    put(2121l, new Empleado(2121l, "Barrientos",
                            "Franco", 9000000,
                            2000));
                    put(4535l, new Empleado(4535l,
                            "Barrientos", "Fernando",
                            90000, 2000));
                    put(8233l, new Empleado(8233l, "Gomez",
                            "Camila", 9000000,
                            2020));
                }}
        );
        miComercio.nomina();
    }


}
