import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

/**
 * Clase Banco que representa a una
 * @author Barrientos Franco
 * @version 1.0
 */

public class Banco {
    private String nombre;

    private int nroSucursal;

    private Localidad localidad;

    private List<Empleado> empleados;

    public Banco(String p_nombre, int p_nroSucursal, Localidad p_localidad, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setNroSucursal(p_nroSucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(new ArrayList<>());
        this.agregarEmpleado(p_empleado);
    }

    public Banco(String p_nombre, int p_nroSucursal, Localidad p_localidad, ArrayList<Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setNroSucursal(p_nroSucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(p_empleados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String p_nombre) {
        nombre = p_nombre;
    }

    public int getNroSucursal() {
        return nroSucursal;
    }

    public void setNroSucursal(int p_nroSucursal) {
        nroSucursal = p_nroSucursal;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad p_localidad) {
        localidad = p_localidad;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> p_empleados) {
        empleados = p_empleados;
    }

    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    public boolean quitarEmpleado(Empleado p_empleado){
        Optional<Empleado> empleadoOptional =
                this.getEmpleados()
                        .stream()
                        .filter(e->e.getCuil()==p_empleado.getCuil())
                        .findFirst();

        return  empleadoOptional.isPresent() ?
                this.getEmpleados().remove(empleadoOptional.get())
                :
                false;

    }

    public double sueldosAPagar(){
        return this.getEmpleados()
                .stream()
                .mapToDouble(e->e.sueldoNeto())
                .sum();
    }

    public void listarSueldos(){
        this.getEmpleados()
                .forEach(e-> System.out.println(e.mostrarLinea()));
    }

    public void mostrar(){
        System.out.println("Banco: "+this.getNombre() +
                "   Sucursal: "+this.getNroSucursal());
        System.out.println("Localidad: "+this.getLocalidad().getNombre()+
                "   Provincia: "+this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar " +
                ".".repeat(50) +
                String.format("$%.2f" ,this.sueldosAPagar()));
    }

}
