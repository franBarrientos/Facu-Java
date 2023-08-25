import java.time.Month;
import java.util.Calendar;

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
        Persona franco = new Persona(45645852, "franco", "barrientos", 2004);
        // test Caja de ahorro
        CajaDeAhorro cajaDeAhorroDeFran = new CajaDeAhorro(45661, franco);
        cajaDeAhorroDeFran.mostrar();
        cajaDeAhorroDeFran.depositar(1000000);
        cajaDeAhorroDeFran.mostrar();
        cajaDeAhorroDeFran.extraer(50000);

        CuentaCorriente cuentaCorrienteDeFran = new CuentaCorriente(256641, franco);
        cuentaCorrienteDeFran.mostrar();
        cuentaCorrienteDeFran.depositar(1000000);
        cuentaCorrienteDeFran.mostrar();
        cuentaCorrienteDeFran.extraer(1000500);

        //TP 9
        franco.mostrar();


        Calendar fecha = Calendar.getInstance();
        fecha.set(2003, 7, 24);

        Persona franco2 = new Persona(45645852, "fran2co", "barri2entos", fecha);
        franco2.mostrar(); 
        System.out.println(franco2.esCumpleaños()); 
    }
}
