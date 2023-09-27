import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

/**
 * Clase Banco que representa a un Banco
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class Banco {
    private String nombre;

    private int nroSucursal;

    private Localidad localidad;

    private List<Empleado> empleados;


    private List<CuentaBancaria> cuentas;

    /**
     * Constructor de la clase Banco para inicializar con un empleados.
     *
     * @param p_nombre    El nombre del banco.
     * @param p_nroSucursal El número de sucursal del banco.
     * @param p_localidad La localidad donde se encuentra el banco.
     * @param p_empleado  El empleados que se asigna al banco.
     */
    public Banco(String p_nombre, int p_nroSucursal, Localidad p_localidad, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setNroSucursal(p_nroSucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(new ArrayList<>());
        this.agregarEmpleado(p_empleado);
    }


    /**
     * Constructor de la clase Banco para inicializar con una lista de empleados.
     *
     * @param p_nombre    El nombre del banco.
     * @param p_nroSucursal El número de sucursal del banco.
     * @param p_localidad La localidad donde se encuentra el banco.
     * @param p_empleados  La lista de empleados que se asigna al banco.
     */
    public Banco(String p_nombre, int p_nroSucursal, Localidad p_localidad, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setNroSucursal(p_nroSucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(p_empleados);
    }

    /**
     * Constructor de la clase Banco para inicializar con una lista de empleados y cuentas bancarias.
     *
     * @param p_nombre    El nombre del banco.
     * @param p_nroSucursal El número de sucursal del banco.
     * @param p_localidad La localidad donde se encuentra el banco.
     * @param p_empleados  La lista de empleados que se asigna al banco.
     * @param p_cuentas    La lista de cuentas bancarias que se asigna al banco.
     */
    public Banco(String p_nombre, int p_nroSucursal, Localidad p_localidad,
                 ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas) {
        this.setNombre(p_nombre);
        this.setNroSucursal(p_nroSucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
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

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> p_cuentas) {
        cuentas = p_cuentas;
    }


    /**
     * Agrega un empleado al banco.
     *
     * @param p_empleado El empleado que se desea agregar.
     * @return true si se agregó con éxito, false si no.
     */
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }

    /**
     * Quita un empleado del banco.
     *
     * @param p_empleado El empleado que se desea quitar.
     * @return true si se quitó con éxito, false si no.
     */
    public boolean quitarEmpleado(Empleado p_empleado) {
        Optional<Empleado> empleadoOptional =
                this.getEmpleados()
                        .stream()
                        .filter(e -> e.getCuil() == p_empleado.getCuil())
                        .findFirst();

        return empleadoOptional.isPresent() ?
                this.getEmpleados().remove(empleadoOptional.get())
                :
                false;
    }

    /**
     * Calcula el total de sueldos a pagar a los empleados del banco.
     *
     * @return El total de sueldos a pagar.
     */
    public double sueldosAPagar() {
        return this.getEmpleados()
                .stream()
                .mapToDouble(e -> e.sueldoNeto())
                .sum();
    }

    /**
     * Lista los sueldos de todos los empleados del banco en la consola.
     */
    public void listarSueldos() {
        this.getEmpleados()
                .forEach(e -> System.out.println(e.mostrarLinea()));
    }

    /**
     * Muestra información general del banco y los sueldos de los empleados en la consola.
     */
    public void mostrar() {
        System.out.println("Banco: " + this.getNombre() +
                "   Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() +
                "   Provincia: " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar " +
                ".".repeat(50) +
                String.format("$%.2f", this.sueldosAPagar()));
    }

    /**
     * Muestra las cuentas bancarias con saldo igual a cero en la consola.
     */
    public void mostrarSaldoCero() {
        this.getCuentas()
                .forEach(e -> {
                    if (e.getSaldo() == 0) {
                        System.out.println(e.getNroCuenta() +
                                " ".repeat(20) +
                                e.getTitular().getNombre() + " " +
                                e.getTitular().getApellido());
                    }
                });
    }

    /**
     * Cuenta las cuentas bancarias con saldo activo (mayor que cero).
     *
     * @return El número de cuentas con saldo activo.
     */
    public int cuentasSaldoActivo() {
        return (int) this.getCuentas()
                .stream()
                .filter(c -> c.getSaldo() > 0)
                .count();
    }

    /**
     * Muestra un resumen de cuentas bancarias del banco en la consola.
     */
    public void mostrarResumen(){
        System.out.println("Banco: " + this.getNombre() +
                "   Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() +
                "   Provincia: " + this.getLocalidad().getProvincia());
        System.out.println("*".repeat(100));
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("*".repeat(100));
        System.out.println("Numero total de Cuentas Bancarias: " + this.getCuentas().size());
        System.out.println("Cuentas Activas: " + this.cuentasSaldoActivo());
        System.out.println(".".repeat(100));
        System.out.println("Cuentas con Cuenta en Saldo Cero");
        System.out.println(".".repeat(100));
        this.mostrarSaldoCero();
        System.out.println(".".repeat(100));
    }

}




















