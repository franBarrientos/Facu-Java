import java.util.Calendar;

/**
 * Clase que representa a una persona con su número de DNI, nombre, apellido y
 * año de nacimiento.
 * 
 * Esta clase modela los datos de una persona y sus características.
 * 
 * @author Barrientos Franco
 * @version 1.0
 */
public class Persona {
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /**
     * Constructor de la clase Persona, instancia un objeto Persona.
     * 
     * @param p_nroDni         número de DNI de la persona.
     * @param p_nombre         nombre de la persona.
     * @param p_apellido       apellido de la persona.
     * @param p_anioNacimiento año de nacimiento de la persona.
     */
    public Persona(int p_nroDni, String p_nombre, String p_apellido, int p_anioNacimiento) {
        this.setNroDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anioNacimiento);
    }

    /**
     * Constructor de la clase Persona, instancia un objeto Persona.
     * 
     * @param p_nroDni         número de DNI de la persona.
     * @param p_nombre         nombre de la persona.
     * @param p_apellido       apellido de la persona.
     * @param p_fechaNacimiento fecha de nacimiento de la persona.
     */
    public Persona(int p_nroDni, String p_nombre, String p_apellido, Calendar p_fechaNacimiento) {
        this.setNroDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fechaNacimiento);
    }

    public int getNroDni() {
        return this.nroDni;
    }

    private void setNroDni(int p_nroDni) {
        this.nroDni = p_nroDni;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public int getAnioNacimiento() {
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }

    private void setAnioNacimiento(int p_anioNacimiento) {
        if (this.getFechaNacimiento() != null) {
            this.fechaNacimiento.set(Calendar.YEAR, p_anioNacimiento);
        } else {
            this.fechaNacimiento = Calendar.getInstance();
            this.fechaNacimiento.set(Calendar.YEAR, p_anioNacimiento);
        }
    }

    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    private void setFechaNacimiento(Calendar p_fechaNacimiento) {
        this.fechaNacimiento = p_fechaNacimiento;
    }

    /**
     * Calcula la edad de la persona.
     * 
     * @return la edad de la persona en años.
     */
    public int edad() {
        int ActualYear = Calendar.getInstance().get(Calendar.YEAR);
        return ActualYear - this.getAnioNacimiento();
    }

    /**
     * Muestra en consola los datos de la persona y su edad.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nombre + " " + this.getApellido());
        System.out.println("DNI: " + this.getNroDni() + " Edad: " + this.edad() + " años");
    }

    /**
     * Verifica si el día de hoy es el cumpleaños de la persona.
     * 
     * @return true si es su cumpleaños, false en caso contrario.
     */
    public boolean esCumpleaños() {
        boolean dayCondition = (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH));
        boolean monthCondition = (Calendar.getInstance().get(Calendar.MONTH) == this.getFechaNacimiento().get(Calendar.MONTH));
        return (dayCondition && monthCondition);
    }
}
