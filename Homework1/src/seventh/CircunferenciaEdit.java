package seventh;
import helpers.InputHelper;

/* 7. Modificar la clase Circunferencia para permitir que el usuario pueda calcular el perímetro de muchas
circunferencias, utilizando la estructura while. Modificar además el ingreso de datos, utilizando la clase
Scanner */
public class CircunferenciaEdit {
    public static final double pi = 3.14;

    public static void main(String[] args) throws Exception {
        boolean flat = false;
        while (!flat) {
            double radioOptional = InputHelper.insertDoubleForKeyboard("Ingresa el radio de la circunferencia a calcular o 0 si desea salir... ");
            if (radioOptional == 0) {
                flat = true;
                continue;
            } else {
                printPerimetro(radioOptional);
            }
        }

    }

    public static void printPerimetro(double radioOptional) {
        System.out.println(
                "El perímetro de una circunferencia de radio " + radioOptional + " es "
                        + calculatePerimetroWithRadio(radioOptional));
    }

    public static double calculatePerimetroWithRadio(double radio) {
        return (radio * 2) * pi;
    }
}
