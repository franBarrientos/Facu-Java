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
    private String nombre = "";
    private String apellido = "";
    private int anioNacimiento;

    /**
     * Constructor de la clase Persona, instancia un objeto Persona.
     * 
     * @param nroDni         número de DNI de la persona.
     * @param nombre         nombre de la persona.
     * @param apellido       apellido de la persona.
     * @param anioNacimiento año de nacimiento de la persona.
     */
    public Persona(int nroDni, String nombre, String apellido, int anioNacimiento) {
        setNroDni(nroDni);
        setNombre(nombre);
        setApellido(apellido);
        setAnioNacimiento(anioNacimiento);
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
        return this.anioNacimiento;
    }

    private void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
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

}
