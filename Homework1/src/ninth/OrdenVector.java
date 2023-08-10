package ninth;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 9. Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner) 4 elementos de tipo
doble, y almacenarlos en un array. Determinar el menor elemento y mostrarlo. Ordenar los elementos del
vector de menor a mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar instrucción
FOR para el ingreso de datos. Utilizar método de la Burbuja. */
public class OrdenVector {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean flat = false;
        ArrayList<Double> numbers = new ArrayList<>();
        do {
            System.out.print(
                    "Ingresa un numero para insertarlo al vertor o 0 si desea obtener el menor de los ingresados... ");
            double numberOptional = scanner.nextDouble();
            if (numberOptional == 0) {
                flat = true;
                continue;
            } else {
                numbers.add(numberOptional);
            }
        } while (!flat);

        if (numbers.isEmpty()) {
            System.out.print("Ingrese al menos un numero... ");
            main(args);
        }
        bubbleSort(numbers);
        System.out.println(numbers.stream().map(num -> (num + "   ")).collect(Collectors.toList()));
        System.out.println("El menor valor ingresado es " + numbers.get(0));
        scanner.close();
    }

    public static void bubbleSort(ArrayList<Double> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) > array.get(j)) {
                    double aux = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, aux);
                }
            }
        }
    }

}
