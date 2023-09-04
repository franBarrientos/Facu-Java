import java.util.Calendar;
/**
 * Clase ejecutable que testea a las clases EjecutableEmpleadoConJefe.
 * @author Barrientos Franco
 * @version 1.0
 */
public class EjecutableEmpleadoConJefe {


    /**
     * Se instancian objetos de la EjecutableEmpleadoConJefe, Calendar, y se testea sus metodos y comunicacion atravez de
     * mensajes
     */
    public static void main(String[] args) {

        Calendar fechaIngresoEmpleado = Calendar.getInstance();
        fechaIngresoEmpleado.set(2000, 0, 10);

        EmpleadoConJefe jefe = new EmpleadoConJefe(34242, "Barrientos", "Fernando", 2000120, 2000);

        EmpleadoConJefe miEmpleado = new EmpleadoConJefe(2424, "Barrientos", "Franco", 200000, fechaIngresoEmpleado,
                jefe);
        jefe.mostrar();
        miEmpleado.mostrar();
    }
}
