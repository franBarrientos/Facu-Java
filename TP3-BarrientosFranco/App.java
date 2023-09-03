public class App {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Trabajo 1");
            System.out.println("2. Trabajo 2");
            System.out.println("3. Trabajo 3");
            System.out.println("4. Trabajo 4");
            System.out.println("5. Trabajo 5");
            System.out.println("6. Trabajo 6");
            System.out.println("7. Trabajo 7");
            System.out.println("8. Trabajo 8");
            System.out.println("9. Trabajo 9");
            System.out.println("10. Trabajo 10");
            System.out.println("11. Trabajo 11");
            System.out.println("12. Trabajo 12");
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
