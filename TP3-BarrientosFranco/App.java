/**
 * Clase principal que sirve como entry point para el programa. Permite al usuario seleccionar
 * diferentes opciones para ejecutar los trabajos correspondientes.
 */
public class App {
    /**
     * Método principal que inicia la aplicación y muestra un menú interactivo para seleccionar las opciones.
     *
     */
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Trabajo 1 - GestionStock");
            System.out.println("2. Trabajo 2 - EjecutablePunto");
            System.out.println("3. Trabajo 3 - CreaFigura");
            System.out.println("4. Trabajo 4 - CreaFigura");
            System.out.println("5. Trabajo 5 - EjecutableCuentaBancaria");
            System.out.println("6. Trabajo 6 - Secretaria");
            System.out.println("7. Trabajo 7 - Banco");
            System.out.println("8. Trabajo 8 - GestionHospital");
            System.out.println("9. Trabajo 9 - Banco");
            System.out.println("10. Trabajo 10 - RegistroCivil");
            System.out.println("11. Trabajo 11 - Empresa");
            System.out.println("12. Trabajo 12 - CreaFigura");
            System.out.println("0. Salir");
            choice = InputHelper.insertIntByKeyboard("Ingrese el número de la opción: ");
            switch (choice) {
                case 1:
                    GestionStock.main(null);
                    break;
                case 2:
                    EjecutablePunto.main(null);
                    break;
                case 3:
                    CreaFigura.main(null);
                    break;
                case 4:
                    CreaFigura.main(null);
                    break;
                case 5:
                    EjecutableCuentaBancaria.main(null);
                    break;
                case 6:
                    Secretaria.main(null);
                    break;
                case 7:
                    Banco.main(null);
                    break;
                case 8:
                    GestionHospital.main(null);
                    break;
                case 9:
                    Banco.main(null);
                    break;
                case 10:
                    RegistroCivil.main(null);
                    break;
                case 11:
                    Empresa.main(null);
                    break;
                case 12 :
                    CreaFigura.main(null);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            choice = askToContinue();
        } while (choice != 0);
    }

    public static int askToContinue() {
        return InputHelper.insertIntByKeyboard("Ingrese 1 si desea continuar o 0 si desea salir....");
    }
}
