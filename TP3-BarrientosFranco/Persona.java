import java.util.Calendar;

/**
 * Clase que representa a una persona con su número de DNI, nombre, apellido y
 * año de nacimiento.
 * 
 * @author Barrientos Franco y Cabrera Romani Lucas
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
        return this.anioNacimiento;
    }

    private void setAnioNacimiento(int p_anioNacimiento) {
        this.anioNacimiento = p_anioNacimiento;
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
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getNroDni() + " Edad: " + this.edad() + " años");
    }

    /**
     * devuelvo el nombre y apellido
     * 
     * @return nombre y apellido
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * devuelvo el apellido y nombre
     * 
     * @return apellido y nombre
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

}
