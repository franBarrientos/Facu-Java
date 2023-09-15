import java.io.IOException;
import java.util.ArrayList;

public class AplicacionBanco implements MenuOption {

    @Override
    public void run() {
        System.out.println("Ingrese un Banco");
        Banco miBanco = new Banco(
                InputHelper.insertStringByKeyboard("Ingrese nombre: "),
                InputHelper.insertIntByKeyboard("Ingrese nro de Sucursal: "),
                new Localidad(
                        InputHelper.insertStringByKeyboard("Ingrese Localidad"),
                        InputHelper.insertStringByKeyboard("Ingrese Provincia")),
                new ArrayList<>() {{
                    add(new Empleado(
                            InputHelper.insertLongByKeyboard("Ingrese cuild del primer empleado/a: "),
                            InputHelper.insertStringByKeyboard("Ingrese Apellido: "),
                            InputHelper.insertStringByKeyboard("Ingrese Nombre: "),
                            InputHelper.insertDoubleByKeyboard("Ingrese Sueldo Basico: "),
                            InputHelper.insertIntByKeyboard("Ingrese Año de Ingreso: ")
                    ));
                    add(new Empleado(
                            InputHelper.insertLongByKeyboard("Ingrese cuild del primer empleado/a: "),
                            InputHelper.insertStringByKeyboard("Ingrese Apellido: "),
                            InputHelper.insertStringByKeyboard("Ingrese Nombre: "),
                            InputHelper.insertDoubleByKeyboard("Ingrese Sueldo Basico: "),
                            InputHelper.insertIntByKeyboard("Ingrese Año de Ingreso: ")
                    ));
                }}
        );

        miBanco.mostrar();
    }

    public static void main(String[] args) {
        new AplicacionBanco().run();
    }
}
