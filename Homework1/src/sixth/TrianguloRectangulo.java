package sixth;

import java.util.Scanner;

public class TrianguloRectangulo {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud del cateto 1: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingresa la longitud del cateto 2: ");
        double cateto2 = scanner.nextDouble();

        System.out.print("Ingresa la longitud de la hipotenusa: ");
        double hipotenusa = scanner.nextDouble();
        scanner.close();
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
