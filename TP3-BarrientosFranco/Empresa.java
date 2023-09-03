import java.util.Calendar;

public class Empresa {
    public static void main(String[] args) {
        Calendar ingreso = Calendar.getInstance();
        ingreso.set(2000, 0, 1);
        //ingreso.set(2000, 7, 25);
        Empleado miEmpleado = new Empleado(5456158, "BARRIENTOS", "FRANCO", 200000, ingreso);

        System.out.println(miEmpleado.esAniversario());
    }
}
