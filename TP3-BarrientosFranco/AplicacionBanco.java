import java.util.ArrayList;

/**
 * Clase Ejecutable de Banco
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class AplicacionBanco implements MenuOption {

    /**
     * Se instancia un banco, y se testean sus metodos
     */
    @Override
    public void run() {
        System.out.println("Ingrese un Banco");
        Banco miBanco = new Banco(
                InputHelper.scanStringByKeyboardAndPrint("Ingrese nombre: "),
                InputHelper.scanIntByKeyboardAndPrint("Ingrese nro de Sucursal: "),
                new Localidad(
                        InputHelper.scanStringByKeyboardAndPrint("Ingrese Localidad"),
                        InputHelper.scanStringByKeyboardAndPrint("Ingrese Provincia")),
                new ArrayList<>() {{
                    add(new Empleado(
                            InputHelper.scanLongByKeyboardAndPrint("Ingrese cuild del primer empleado/a: "),
                            InputHelper.scanStringByKeyboardAndPrint("Ingrese Apellido: "),
                            InputHelper.scanStringByKeyboardAndPrint("Ingrese Nombre: "),
                            InputHelper.scanDoubleByKeyboardAndPrint("Ingrese Sueldo Basico: "),
                            InputHelper.scanIntByKeyboardAndPrint("Ingrese Año de Ingreso: ")
                    ));
                    add(new Empleado(
                            InputHelper.scanLongByKeyboardAndPrint("Ingrese cuild del primer empleado/a: "),
                            InputHelper.scanStringByKeyboardAndPrint("Ingrese Apellido: "),
                            InputHelper.scanStringByKeyboardAndPrint("Ingrese Nombre: "),
                            InputHelper.scanDoubleByKeyboardAndPrint("Ingrese Sueldo Basico: "),
                            InputHelper.scanIntByKeyboardAndPrint("Ingrese Año de Ingreso: ")
                    ));
                }},
                new ArrayList<>() {{
                    add(new CuentaBancaria(12121, new Persona(45645852, "Franco", "Barrientos", 2004)));
                    add(new CuentaBancaria(12121, 20, new Persona(32323, "LUIS", "Barrientos", 2004)));
                }}
        );

        miBanco.mostrar();
        miBanco.mostrarResumen();
    }

    public static void main(String[] args) {
        new AplicacionBanco().run();
    }
}
