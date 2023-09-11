

import java.util.Calendar;
import java.util.Scanner;

/**
 * Clase Helper que contiene metodos para el ingreso por teclado con mensajes
 *
 * @author Barriento Franco
 * @version v0.01
 */
public class InputHelper {
    /**
     * scanner: escaner al ingreso por teclado
     */
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Muestra mensaje en consola, escanea entrada y la devuelve
     *
     * @param message mensaje a mostrar por consola
     * @return valor escaneado
     */
    public static String insertStringByKeyboard(String message) {
        System.out.println(message);
        return scanner.next();
    }

    /**
     * Muestra mensaje en consola, escanea entrada y la devuelve
     *
     * @param message mensaje a mostrar por consola
     * @return valor escaneado
     */
    public static double insertDoubleByKeyboard(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    /**
     * Muestra mensaje en consola, escanea entrada y la devuelve
     *
     * @param message mensaje a mostrar por consola
     * @return valor escaneado
     */
    public static int insertIntByKeyboard(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    /**
     * Muestra mensaje en consola, escanea entrada y la devuelve
     *
     * @param message mensaje a mostrar por consola
     * @return valor escaneado
     */
    public static Long insertLongByKeyboard(String message) {
        System.out.println(message);
        return scanner.nextLong();
    }

    public static Calendar insertCalendarByKeyboard(String message) {
        System.out.println(message);
        Calendar calendar = Calendar.getInstance();
        calendar.set(
                InputHelper.insertIntByKeyboard("Ingrese Año.. "),
                InputHelper.insertIntByKeyboard("Ingrese mes.. Ej Enero 0 - Febrero 1...."),
                InputHelper.insertIntByKeyboard("Ingrese dia.. ")
        );
        return calendar;
    }
}
