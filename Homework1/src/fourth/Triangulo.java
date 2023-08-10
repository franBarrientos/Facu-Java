package fourth;

import helpers.InputHelper;

/* 4. Crear clase ejecutable “Triangulo”, declarar las variables a, b y c de tipo double, que corresponden a los lados
de un triángulo. Los valores deben ser ingresados por teclado como argumentos del método main(). Calcular y
mostrar el semiperímetro y el área del triángulo.
 semiperimetro= (a+b+c)/2
 area= raíz cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))
Nota: probar con a=2, b=2.7, c=3.5 */
public class Triangulo {

    public static void main(String[] args) throws Exception {
        double a = InputHelper.insertDoubleForKeyboard("Ingresar primer lado: ");
        double b = InputHelper.insertDoubleForKeyboard("Ingresar segundo lado: ");
        double c = InputHelper.insertDoubleForKeyboard("Ingresar tercer lado: ");
        Triangulo.printAreaAndSemiperimetro(a, b, c);
    }

    public static double calculateSemiperimetro(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double calculateArea(double a, double b, double c) {
        double semiperimetro = calculateSemiperimetro(a, b, c);
        return Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    }

    public static void printAreaAndSemiperimetro(double a, double b, double c) {
        System.out.println("El semipemitro de un triangulo con lados " + a + " " + b + " " + c + " es "
                + calculateSemiperimetro(a, b, c));
        System.out.println(
                "El area de un triangulo con lados " + a + " " + b + " " + c + " es " + calculateArea(a, b, c));
    }

}