import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EjecutableEmpleado implements MenuOption {
    public static void main(String[] args) {
        new EjecutableEmpleado().run();
    }

    @Override
    public void run() {
        //flat para continuar el ingreso de empleados
        int choice;

        //array de empleados
        List<Empleado> empleados = new ArrayList<>();

        //ingreso hasta que el usuario ingrese 0
        do {
            System.out.println("Ingrese Datos del Empleado!");
            //agrega un empleado , por teclado
            empleados.add(
                    new Empleado(
                            InputHelper.insertLongByKeyboard("Ingrese Cuil.. "),
                            InputHelper.insertStringByKeyboard("Ingrese Apellido.. "),
                            InputHelper.insertStringByKeyboard("Ingrese Nombre.. "),
                            InputHelper.insertDoubleByKeyboard("Ingrese Sueldo Basico.. "),
                            InputHelper.insertCalendarByKeyboard("Ingrese Fecha de Ingreso..")
                    ));
            choice = InputHelper.insertIntByKeyboard("Ingrese 1 si desea agregar otro empleado o 0 si desea salir....");


        } while (choice != 0);


        //por cada usuario, muestro en pantalla sus datos, y los grabo en el Empleado.dat
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Empleado.dat"))) {
            for (Empleado i_empleado : empleados) {
                i_empleado.mostrar();
                this.writeEmpleado(i_empleado, dataOutputStream);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void writeEmpleado(Empleado p_empleado, DataOutputStream p_dataOutputStream) throws IOException {
        p_dataOutputStream.writeLong(p_empleado.getCuil());
        p_dataOutputStream.writeUTF(p_empleado.getApellido());
        p_dataOutputStream.writeUTF(p_empleado.getNombre());
        p_dataOutputStream.writeDouble(p_empleado.getSueldoBasico());
        p_dataOutputStream.writeDouble(p_empleado.sueldoNeto());
        p_dataOutputStream.writeInt(p_empleado.getFechaIngreso().get(Calendar.DAY_OF_MONTH));
        p_dataOutputStream.writeInt(p_empleado.getFechaIngreso().get(Calendar.MONTH));
        p_dataOutputStream.writeInt(p_empleado.getFechaIngreso().get(Calendar.YEAR));
    }



}
