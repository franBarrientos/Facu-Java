import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Clase ejecutable que testea a la clase Empleado
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class Empresa {

    /**
     * Instancia un empleado y se imprime un permiso de salida, si corresponde.
     */
    public static void main(String[] args) {
        Calendar ingreso = Calendar.getInstance();
        ingreso.set(2000, 0, 1);
        Empleado miEmpleado = new Empleado(5456158, "BARRIENTOS", "FRANCO", 200000, ingreso);

        System.out.println("Fecha de Ingreso de Franco es "+  new SimpleDateFormat("dd MMMM yyyy").format(ingreso.getTime()));
        System.out.println("Fecha de Hoy es "+  new SimpleDateFormat("dd MMMM yyyy").format(Calendar.getInstance().getTime()));



        System.out.println("Es Aniversario de Franco : " + (miEmpleado.esAniversario()? "SI":"NO"));
    }
}
