import java.util.Calendar;

/**
 * Clase que representa a una persona con su número de DNI, nombre, apellido y
 * año de nacimiento.
 * 
 * @author Barrientos Franco
 * @version V0.01
 */
public class Persona {
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /**
     * Constructor de la clase Persona, instancia un objeto Persona.
     * 
     * @param nroDni         número de DNI de la persona.
     * @param nombre         nombre de la persona.
     * @param apellido       apellido de la persona.
     * @param anioNacimiento año de nacimiento de la persona.
     */
    public Persona(int nroDni, String nombre, String apellido, int p_anio) {
        setNroDni(nroDni);
        setNombre(nombre);
        setApellido(apellido);
        setAnioNacimiento(p_anio);
    }

    /**
     * Constructor de la clase Persona, instancia un objeto Persona.
     * 
     * @param nroDni         número de DNI de la persona.
     * @param nombre         nombre de la persona.
     * @param apellido       apellido de la persona.
     * @param anioNacimiento año de nacimiento de la persona.
     */
    public Persona(int nroDni, String nombre, String apellido, Calendar p_fecha) {
        setNroDni(nroDni);
        setNombre(nombre);
        setApellido(apellido);
        setFechaNacimiento(p_fecha);
    }

    public int getNroDni() {
        return this.nroDni;
    }

    private void setNroDni(int nroDni) {
        this.nroDni = nroDni;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioNacimiento() {
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }

    private void setAnioNacimiento(int p_anio) {
        if (this.getFechaNacimiento() != null) {
            this.fechaNacimiento.set(Calendar.YEAR, p_anio);
        } else {
            this.fechaNacimiento = Calendar.getInstance();
            this.fechaNacimiento.set(Calendar.YEAR, p_anio);
        }
    }

    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    private void setFechaNacimiento(Calendar anioNacimiento) {
        this.fechaNacimiento = anioNacimiento;
    }

    /**
     * Calcula la edad de la persona.
     * 
     * @return la edad de la persona en años.
     */
    public int edad() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.getAnioNacimiento();
    }

    /**
     * Muestra en consola los datos de la persona y su edad.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nombre + " " + this.getApellido());
        System.out.println("DNI: " + this.getNroDni() + " Edad: " + this.edad() + " años");
    }

    public boolean esCumpleaños() {
        boolean dayCondition = (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH));
        boolean monthCondition = (Calendar.getInstance().get(Calendar.MONTH) == this.getFechaNacimiento().get(Calendar.MONTH));
        return (dayCondition && monthCondition);
    }

}
