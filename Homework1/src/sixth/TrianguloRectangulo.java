package sixth;

import helpers.InputHelper;

public class TrianguloRectangulo {

    public static void main(String[] args) throws Exception {
        double cateto1 = InputHelper.insertDoubleForKeyboard("Ingresa la longitud del cateto 1: ");
        double cateto2 = InputHelper.insertDoubleForKeyboard("Ingresa la longitud del cateto 2: ");
        double hipotenusa = InputHelper.insertDoubleForKeyboard("Ingresa la longitud de la hipotenusa: ");
        printResults(cateto1, cateto2, hipotenusa);
    }

    public static void printResults(double cateto1, double cateto2, double hipotenusa) {
        if (esTrianguloRectangulo(cateto1, cateto2, hipotenusa)) {
            System.out.println("El triángulo es rectángulo.");
        } else {
            System.out.println("El triángulo no es rectángulo.");
        }
    }

    public static boolean esTrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) {
        return ((Math.pow(hipotenusa, 2)) == ((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2))));
    }
}
