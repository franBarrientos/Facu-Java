/**
 * Clase que testea las clases Escuela y Docente
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class Secretaria {

    /**
     * Instancia un objeto escuela, un docente, y emite un recibo
     * */
    public static void main(String[] args) {
        Escuela escuela = new Escuela("Belgrano", "bs 1200", "Barrientos Franco");
        Docente docente = new Docente("Mirta Coceres", "sexto", 180000.00, 25000.00);
        System.out.println(".".repeat(80));
        System.out.println(".".repeat(80));
        escuela.imprimirRecibo(docente);
        System.out.println(".".repeat(80));
        System.out.println(".".repeat(80));

    }
}
