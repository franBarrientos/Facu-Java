public class EjecutableSecretaria {
    public static void main(String[] args) {
        Escuela escuela = new Escuela("Belgrano", "bs 1200", "Barrientos Franco");
        Docente docente = new Docente("Mirta Coceres", "sexto", 180000.00, 25000.00);
        escuela.imprimirRecibo(docente);
    }
}
