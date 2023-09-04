import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Clase Banco que representa a una clase que testea las clases Caja de Ahorro y
 * Cuenta Corriente
 * @author Barrientos Franco
 * @version 1.0
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
        System.out.println(".".repeat(80));
        System.out.println("CAJA DE AHORRO DE FRANCO");
        System.out.println(".".repeat(80));
        cajaDeAhorroDeFran.mostrar();
        System.out.println(".".repeat(80));
        System.out.println("SE DEPOSITA $1000000");
        System.out.println(".".repeat(80));
        cajaDeAhorroDeFran.depositar(1000000);
        cajaDeAhorroDeFran.mostrar();
        System.out.println(".".repeat(80));
        System.out.println("SE EXTRAE 50000");
        System.out.println(".".repeat(80));
        cajaDeAhorroDeFran.extraer(50000);
        System.out.println(".".repeat(80));
        System.out.println(".".repeat(80));

        System.out.println(".".repeat(80));
        System.out.println("CUENTA CORRIENTE DE FRANCO");
        System.out.println(".".repeat(80));

        CuentaCorriente cuentaCorrienteDeFran = new CuentaCorriente(256641, franco);
        cuentaCorrienteDeFran.mostrar();
        System.out.println(".".repeat(80));
        System.out.println("SE DEPOSITA 1000000");
        System.out.println(".".repeat(80));
        cuentaCorrienteDeFran.depositar(1000000);
        cuentaCorrienteDeFran.mostrar();
        System.out.println(".".repeat(80));
        System.out.println("SE EXTRAE 1000500");
        System.out.println(".".repeat(80));
        cuentaCorrienteDeFran.extraer(1000500);

        //TP 9
        System.out.println(".".repeat(80));
        System.out.println("EMPIEZA TP 9");
        System.out.println(".".repeat(80));


        Calendar fecha = Calendar.getInstance();
        fecha.set(2003, 8, 3);
        System.out.println("Fecha de Nacimiento de Franco es "+  new SimpleDateFormat("dd MMMM yyyy").format(fecha.getTime()));
        Persona franco2 = new Persona(45645852, "Franco", "Barrientos", fecha);
        franco2.mostrar();
        System.out.println("Es cumpleaños de : "+franco2.getNombre()
                + (franco2.esCumpleaños()? " SI" : " NO"));
    }
}
