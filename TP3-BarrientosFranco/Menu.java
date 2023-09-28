import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase principal que sirve como entry point para el programa. Permite al usuario seleccionar
 * diferentes opciones para ejecutar los trabajos correspondientes.
 * @author Barrientos Franco
 * @version 1.0
 */
public class Menu {
    /**
     * Método principal que inicia la aplicación y muestra un menú interactivo para seleccionar las opciones.
     */
    private List<MenuOption> options;

    public Menu() {

        this.setOptions(new ArrayList<>());

    }

    public void start() {
        //variable flat para la opcion
        int choice;

        //mapeo la ejecucion de las opcion a un mapa, con una key que es el indice
        Map<Integer, Runnable> actions = new HashMap<>();
        for (int i = 0; i < this.getOptions().size(); i++) {
            int option = i;
            actions.put(i + 1, () -> {
                this.getOptions().get(option).run();
            });
        }

        //ejecuto el do while , mientras no se escoja 0
        do {
            System.out.println("Seleccione una opción:");
            for (int i = 0; i < this.getOptions().size(); i++) {
                System.out.println((i + 1) + ". Trabajo " + (i + 1) + " - " + this.getOptions().get(i).getClass().getName());
            }
            System.out.println("0. Salir");
            choice = InputHelper.scanIntByKeyboardAndPrint("Ingrese el número de la opción: ");


            Runnable action = actions.get(choice);
            if (action != null) {
                action.run();
                choice = askToContinue();
            } else if (choice != 0) {
                System.out.println("Opción inválida. Intente nuevamente.");

            }
        } while (choice != 0);
    }

    public static int askToContinue() {
        return InputHelper.scanIntByKeyboardAndPrint("Ingrese 1 si desea continuar o 0 si desea salir....");
    }

    private List<MenuOption> getOptions() {
        return this.options;
    }

    public void setOptions(List<MenuOption> p_options) {
        this.options = p_options;
    }

    public void addOption(Class<? extends MenuOption> p_option) {
        try {
            this.getOptions().add(p_option.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
