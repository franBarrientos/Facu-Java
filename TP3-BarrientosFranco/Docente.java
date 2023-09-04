/**
 * Clase que representa a un docente con su información y cálculo de sueldo.
 * @author Barrientos Franco
 * @version 1.0
 */
public class Docente {
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
     * Crea una nueva instancia de Docente con los detalles proporcionados.
     *
     * @param p_nombre Nombre del docente.
     * @param p_grado Grado del docente.
     * @param p_sueldoBasico Sueldo básico del docente.
     * @param p_asignacionFamiliar Asignación familiar del docente.
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar) {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getGrado() {
        return this.grado;
    }

    private void setGrado(String p_grado) {
        this.grado = p_grado;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }

    private void setAsignacionFamiliar(double p_asignacionFamiliar) {
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    /**
     * Calcula el sueldo total del docente sumando su sueldo básico y asignación
     * familiar.
     *
     * @return Sueldo total del docente.
     */
    public double calcularSueldo() {
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}
