import java.util.Calendar;

/**
 * Clase que representa a un alumno observado desde lo academico, con sus datos
 * personales y calificaciones.
 *
 * @author Barrientos Franco y Cabrera Romani Lucas
 * @version v0.01
 */
public class Alumno extends Persona{
    private int lu;
    private double nota1;
    private double nota2;

    /**
     * Constructor de la clase Alumno, instancia un objeto Alumno
     *
     * @param p_lu       libreta universitaria del alumno
     * @param p_nombre   nombre del alumno
     * @param p_apellido apellido del alumno
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido,
                  int p_nroDni, Calendar p_fechaNacimiento) {
        super(p_nroDni, p_nombre, p_apellido, p_fechaNacimiento);
        this.setLu(p_lu);
    }

    public int getLu() {
        return this.lu;
    }

    private void setLu(int p_lu) {
        this.lu = p_lu;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double p_nota1) {
        this.nota1 = p_nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double p_nota2) {
        this.nota2 = p_nota2;
    }

    /**
     * calcula el promedio del estado de nota1 y nota2 del alumno;
     *
     * @return el promedio
     */
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    /**
     * verifica si el alumno esta en condiciones de aprobar
     *
     * @return true si el alumno aprueba, false si no.
     */
    private boolean aprueba() {
        return (this.getNota1() >= 6 && this.getNota2() >= 6 && (this.promedio() > 7));
    }

    /**
     * notifica si el alumno aprobo o desaprobo
     *
     * @return "APROBADO" o "DESAPROBADO"
     */
    private String leyendaAprueba() {
        return this.aprueba() ? "APROBADO" : "DESAPROBADO";
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

    /**
     * Muestra en consola los datos del alumno, su promedio y su condicion.
     * Ejemplo: <blockquote>
     *
     * <pre>
     *  Nombre y Apellido: "Juan Perez"
     *  LU: 2020 Notas: 5.99 – 10.0
     *  Promedio: 7.995 - "DESAPROBADO"
     * </pre>
     *
     * </blockquote>
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("LU: "+this.getLu()+" Notas: " + this.getNota1() + "-" + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }

    
}
