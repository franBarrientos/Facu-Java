package eighth;

import java.util.Arrays;
import java.util.Scanner;

/* 8. Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner) 5 notas de alumnos, las
que serán almacenadas en un array de enteros. Calcular el promedio y determinar la mayor nota. El promedio
debe permitir resultado con decimales (aplicar cast a los elementos enteros cuando sea necesario para obtener
dicho resultado). Mostrar los elementos ingresados, separados por un tabulador. Mostrar el promedio y la
mayor nota con el mensaje respectivo.  */
public class OperarVector {
    public static void main(String[] args) {
        int amountOfExams;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de notas a calcular.. ");
        amountOfExams = scanner.nextInt();
        double[] exams = new double[amountOfExams];
        Arrays.setAll(exams, index -> {
            System.out.print("Ingresa la cantidad de nota de alumno " + (1 + index) + ": ");
            return scanner.nextDouble();
        });

        System.out.println("Las notas ingresadas fueron");
        for (double exam : exams) {
            System.out.println(exam);
        }
        System.out.println("Las Mayor nota fue: " + String.format("%.2f", calculateMax(exams)));
        System.out.println("El promedio total fue: " + String.format("%.2f", calculatePromedio(exams)));
        scanner.close();
    }

    public static double calculatePromedio(double[] exams) {
        return ((Arrays.stream(exams).reduce(0, (acc, exam) -> acc + exam)) / exams.length);
    }

    public static double calculateMax(double[] exams) {
        return (Arrays.stream(exams).max().getAsDouble());
    }

}
