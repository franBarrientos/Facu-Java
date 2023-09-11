import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DatosVip implements MenuOption {

    public static void main(String[] args) throws IOException {
        new DatosVip().run();
    }


    @Override
    public void run() throws IOException {

        List<Empleado> empleadosVip = new ArrayList<>();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("Empleado.dat"));

        while (dataInputStream.available() > 0) {
            Empleado readEmpleado = this.mapperStreamToEmpleado(dataInputStream);
            if(readEmpleado.antiguedad() > 10){
                empleadosVip.add(readEmpleado);
            }

        }

        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("EmpleadoVip.dat"));
        for (Empleado i_empleadoVip : empleadosVip) {
            this.writeEmpleado(i_empleadoVip, dataOutputStream);
        }

        this.readFile();

    }

    private Empleado mapperStreamToEmpleado(DataInputStream dataInputStream) throws IOException {
                long cuil = dataInputStream.readLong();
                String apellido = dataInputStream.readUTF();
                String nombre = dataInputStream.readUTF();
                double salarioBasico = dataInputStream.readDouble();
                double salarioNeto = dataInputStream.readDouble();
                int dia = dataInputStream.readInt();
                int mes = dataInputStream.readInt();
                int año = dataInputStream.readInt();

                Calendar añoIngreso = Calendar.getInstance();
                añoIngreso.set(año, mes,año );

                return new Empleado(cuil, apellido, nombre, salarioBasico, añoIngreso);

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

    private void  readFile() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("EmpleadoVip.dat"));
        while (dataInputStream.available() > 0) {
            Empleado readEmpleado = this.mapperStreamToEmpleado(dataInputStream);
            readEmpleado.mostrar();
        }
    }
}
