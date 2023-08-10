package helpers;

import java.util.Scanner;

public class InputHelper {
        public static Scanner scanner = new Scanner(System.in);

        public static double insertDoubleForKeyboard(String message) {
            System.out.print(message);
            return scanner.nextDouble();
        }
        public static int insertIntegerForKeyboard(String message) {
            System.out.print(message);
            return scanner.nextInt();
        }
}
