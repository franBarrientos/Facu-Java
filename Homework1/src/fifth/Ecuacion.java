package fifth;
import helpers.InputHelper;

/* 5. Crear una clase denominada “Ecuación” que calcule las raíces reales de una ecuación de segundo grado. Los
valores de los coeficientes a, b y c se ingresarán por teclado como argumentos del método main(). Considerar
que si el discriminante > 0 se deben calcular las 2 raíces, si el discriminante = 0 se debe calcular una sola raíz,
especificando por pantalla que x1 = x2. En caso de ser negativo, mostrar un mensaje indicando que se
encuentra frente a una solución compleja (numero imaginario).
Nota: probar con a= -1; b=500; c=-62500; */
public class Ecuacion {

    public static void main(String[] args) throws Exception {
        double a = InputHelper.insertDoubleForKeyboard("Ingresa el coeficiente A: ");
        double b = InputHelper.insertDoubleForKeyboard("Ingresa el coeficiente B: ");
        double c = InputHelper.insertDoubleForKeyboard("Ingresa el coeficiente C: ");
        calculateEcuacion(a, b, c);
    }

    public static double[] calculateTwoRaices(double ca, double cb, double cc) {
        return new double[] {
                (-cb + Math.sqrt(calculateDiscriminante(ca, cb, cc))) / (2 * ca),
                (-cb - Math.sqrt(calculateDiscriminante(ca, cb, cc))) / (2 * ca)

        };
    }

    public static double calculateRaiz(double ca, double cb, double cc) {
        return (-cb) / (2 * ca);
    }

    public static double calculateDiscriminante(double ca, double cb, double cc) {
        return (Math.pow(cb, 2)) - (4 * ca * cc);
    }

 

    public static void calculateEcuacion(double a, double b, double c) {
        if (calculateDiscriminante(a, b, c) < 0) {
            System.out.println("se encuentra frente a una solución compleja (numero imaginario))");
        } else if (calculateDiscriminante(a, b, c) == 0) {
            System.out.println("La raiz es " + calculateRaiz(a, b, c));
        } else {
            double[] raices = calculateTwoRaices(a, b, c);
            System.out.println("La primera raiz es " + raices[0] + " y la segunda raiz es " + raices[1]);

        }
    }
}
