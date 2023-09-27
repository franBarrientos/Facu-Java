import java.util.HashMap;
import java.util.Map;

/**
 * Clase Comercio que representa un comercio y gestiona su lista de empleados.
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class Comercio {
    private String nombre;
    private Map<Long, Empleado> empleados;

    /**
     * Constructor de la clase Comercio que recibe el nombre del comercio.
     *
     * @param nombre El nombre del comercio.
     */
    public Comercio(String nombre) {
        this.setNombre(nombre);
    }

    /**
     * Constructor de la clase Comercio que recibe el nombre del comercio y un mapa de empleados.
     *
     * @param nombre    El nombre del comercio.
     * @param empleados Un mapa de empleados donde la clave es el número de CUIL y el valor es el objeto Empleado.
     */
    public Comercio(String nombre, HashMap<Long, Empleado> empleados) {
        this.setNombre(nombre);
        this.setEmpleados(empleados);
    }

    /**
     * Obtiene el nombre del comercio.
     *
     * @return El nombre del comercio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del comercio.
     *
     * @param p_nombre El nombre del comercio.
     */
    public void setNombre(String p_nombre) {
        nombre = p_nombre;
    }

    /**
     * Obtiene el mapa de empleados del comercio.
     *
     * @return El mapa de empleados donde la clave es el número de CUIL y el valor es el objeto Empleado.
     */
    public Map<Long, Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece el mapa de empleados del comercio.
     *
     * @param p_empleados El mapa de empleados donde la clave es el número de CUIL y el valor es el objeto Empleado.
     */
    public void setEmpleados(Map<Long, Empleado> p_empleados) {
        empleados = p_empleados;
    }

    /**
     * Agrega un empleado al comercio.
     *
     * @param p_empleado El empleado que se desea agregar.
     */
    public void altaEmpleadoo(Empleado p_empleado) {
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }

    /**
     * Da de baja a un empleado del comercio.
     *
     * @param p_cuild El número de CUIL del empleado que se desea dar de baja.
     * @return El objeto Empleado que fue dado de baja, o null si no se encontró.
     */
    public Empleado bajaEmpleado(long p_cuild) {
        return this.getEmpleados().remove(p_cuild);
    }

    /**
     * Obtiene la cantidad de empleados en el comercio.
     *
     * @return La cantidad de empleados en el comercio.
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleados().size();
    }

    /**
     * Verifica si un empleado con un número de CUIL dado es parte del comercio.
     *
     * @param p_cuil El número de CUIL del empleado a verificar.
     * @return true si el empleado está en el comercio, false si no.
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleados().containsKey(p_cuil);
    }

    /**
     * Busca un empleado en el comercio por su número de CUIL.
     *
     * @param p_cuil El número de CUIL del empleado que se desea buscar.
     * @return El objeto Empleado encontrado o null si no se encontró.
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleados().get(p_cuil);
    }

    /**
     * Muestra el sueldo neto de un empleado en la consola.
     *
     * @param p_cuild El número de CUIL del empleado cuyo sueldo se desea mostrar.
     */
    public void sueldoNeto(long p_cuild) {
        System.out.println(String.format("%.2f",
                this.getEmpleados().get(p_cuild).sueldoNeto()));
    }

    /**
     * Muestra la nómina de empleados del comercio en la consola.
     */
    public void nomina() {
        System.out.println("**** Nomina de empleados de " + this.getNombre() + " **** ");
        this.getEmpleados().forEach((k, v) -> System.out.println(v.mostrarLinea()));
    }
}
