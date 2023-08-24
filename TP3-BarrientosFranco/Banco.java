/**
 * Clase Banco que representa a una clase que testea las clases Caja de Ahorro y
 * Cuenta Corriente
 */
public class Banco {
    /**
     * Se instancian objetos de las clases Persona, Caja de Ahorro y Cuenta
     * Corriente, luego se testean sus metodos
     * 
     * @param args
     */
    public static void main(String[] args) {
        var franco = new Persona(45645852, "franco", "barrientos", 2004);
        // test Caja de ahorro
        var cajaDeAhorroDeFran = new CajaDeAhorro(45661, franco);
        cajaDeAhorroDeFran.mostrar();
        cajaDeAhorroDeFran.depositar(1000000);
        cajaDeAhorroDeFran.mostrar();
        cajaDeAhorroDeFran.extraer(50000);

        var cuentaCorrienteDeFran = new CuentaCorriente(256641, franco);
        cuentaCorrienteDeFran.mostrar();
        cuentaCorrienteDeFran.depositar(1000000);
        cuentaCorrienteDeFran.mostrar();
        cuentaCorrienteDeFran.extraer(1000500);
    }
}
