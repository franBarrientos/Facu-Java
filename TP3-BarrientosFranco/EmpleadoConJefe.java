import java.util.Calendar;

/**
 * Clase que representa a un empleado observado desde lo laboral, con sus datos
 * personales y sueldo.
 * 
 * @author Barrientos Franco y Cabrera Romani Lucas
 * @version V0.01
 */
public class EmpleadoConJefe {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * Constructor de la clase Empleado, instancia un objeto Empleado
     * 
     * @param p_cuil         nro de cuill del empleado
     * @param p_apellido     apellido del empleado
     * @param p_nombre       nombre del empleado
     * @param p_sueldoBasico sueldo basico del empleado
     * @param p_anioIngreso  año de ingreso del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
    }

    /**
     * Constructor de la clase EmpleadoConJefe, instancia un objeto EmpleadoConJefe
     * 
     * @param p_cuil         nro de cuill del empleado
     * @param p_apellido     apellido del empleado
     * @param p_nombre       nombre del empleado
     * @param p_sueldoBasico sueldo basico del empleado
     * @param p_fechaIngreso fecha de ingreso del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fechaIngreso) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fechaIngreso);
    }
    /**
     * Constructor de la clase EmpleadoConJefe, instancia un objeto EmpleadoConJefe
     * 
     * @param p_cuil         nro de cuill del empleado
     * @param p_apellido     apellido del empleado
     * @param p_nombre       nombre del empleado
     * @param p_sueldoBasico sueldo basico del empleado
     * @param p_fechaIngreso fecha de ingreso del empleado
     * @param p_jefe jefe del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fechaIngreso, EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fechaIngreso);
        this.setJefe(p_jefe);
    }

    public long getCuil() {
        return this.cuil;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    public int getAnioIngreso() {
        return this.getFechaIngreso().get(Calendar.YEAR);
    }

    private void setAnioIngreso(int p_anio) {
        if (this.getFechaIngreso() != null) {
            this.fechaIngreso.set(Calendar.YEAR, p_anio);
        } else {
            this.fechaIngreso = Calendar.getInstance();
            this.fechaIngreso.set(Calendar.YEAR, p_anio);
        }
    }

    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }

    
    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }

    public void setJefe(EmpleadoConJefe jefe) {
        this.jefe = jefe;
    }


    /**
     * Calcula la antiguedad del empleado
     * 
     * @return la cantidad de años
     */
    public int antiguedad() {
        return (Calendar.getInstance().get(Calendar.YEAR) - this.getAnioIngreso());
    }

    /**
     * calcula el monto a descontar por empleado que es 2% del sueldo basico + el
     * seguro de vida
     * 
     * @return monto a descontar
     */
    private double descuento() {
        return (((this.getSueldoBasico() * 2) / 100) + 1500);
    }

    /**
     * calcula la asignacion que se realiza sobre el sueldo basico, en base a la
     * antiguedad:
     * < 2 años : 2% || >= 2 y < 10 : 4% || >= 10 : 6%
     * 
     * @return el monto adicional
     */
    private double adicional() {
        if (this.antiguedad() < 2) {
            return ((this.getSueldoBasico() * 2) / 100);
        } else if (this.antiguedad() >= 10) {
            return ((this.getSueldoBasico() * 6) / 100);
        } else {
            return ((this.getSueldoBasico() * 4) / 100);
        }
    }

    /**
     * calcula el sueldo neto del empleado, descontando seguro de vida etc , y
     * adicionando lo asignado por la antiguedad.
     * 
     * @return sueldo neto
     */
    public double sueldoNeto() {
        return ((this.getSueldoBasico() + this.adicional()) - this.descuento());
    }

    /**
     * Muestra en consola los datos del empleado, su antiguedad y su sueldo neto.
     * Ejemplo: <blockquote>
     * 
     * <pre>
     *  Nombre y Apellido: Juan Perez
        CUIL: 20351234385 Antigüedad: 22 años de servicio
        Sueldo Neto: $ 300000.00
     * </pre>
     * 
     * </blockquote>
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL : " + this.getCuil() + " Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + String.format("%.2f", this.sueldoNeto()));
        if(this.getJefe() != null){
            System.out.println("Responde a: "+ this.getJefe().apeYNom());
        }else{
            System.out.println("GERENTE GENERAL");
        }
    }

    /**
     * Datos del empleado
     * 
     * @return una cadena como la siguiente : "20351234385 Perez, Juan …………… $
     *         300000.00"
     */
    public String mostrarLinea() {
        return this.getCuil() + "  " + this.getApellido() + "," + this.getNombre() + "........$"
                + String.format("%.2f", this.sueldoNeto());
    }

    /**
     * metodo que devuelve el nombre y apellido
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * metodo que devuelve apellido y nombre
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    public boolean esAniversario() {
        boolean dayCondition = (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == this.getFechaIngreso()
                .get(Calendar.DAY_OF_MONTH));
        boolean monthCondition = (Calendar.getInstance().get(Calendar.MONTH) == this.getFechaIngreso()
                .get(Calendar.MONTH));
        return (dayCondition && monthCondition);
    }

}
