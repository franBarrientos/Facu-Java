/**
 * * Clase ejecutable que testea a las clases Persona y CuentaBancaria.
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class EjecutableCuentaBancaria {

    /**
     * Se instancian objetos de la clase Cuenta Bancaria, Persona, y se testea sus metodos y comunicacion atravez de
     * mensajes
     */
    public static void main(String[] args) {
        Persona francoB = new Persona(4564585, "fran", "barrientos", 2004);
        CuentaBancaria cuentaFranco = new CuentaBancaria(4565, 456616, francoB);


        System.out.println(".".repeat(80));
        System.out.println("Metodo to String");
        System.out.println(cuentaFranco.toString());
        System.out.println(".".repeat(80));
        System.out.println("Cuenta de Franco");
        System.out.println(".".repeat(80));
        cuentaFranco.mostrar();


    }
}
