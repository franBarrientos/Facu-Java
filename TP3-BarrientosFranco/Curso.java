import java.util.HashMap;
import java.util.Map;

/**
 * Clase Curso que representa un curso y gestiona su lista de alumnos inscritos.
 * Cada alumno está identificado por un número de LU (Legajo Universitario).
 * El curso se identifica por su nombre.
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class Curso {
    private String nombre;
    private Map<Integer, Alumno> alumnos;

    /**
     * Constructor de la clase Curso que recibe el nombre del curso.
     *
     * @param p_nombre El nombre del curso.
     */
    public Curso(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<>());
    }

    /**
     * Constructor de la clase Curso que recibe el nombre del curso y un mapa de alumnos inscritos.
     *
     * @param p_nombre  El nombre del curso.
     * @param p_alumnos Un mapa de alumnos donde la clave es el número de LU y el valor es el objeto Alumno.
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos) {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param p_nombre El nombre del curso.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene el mapa de alumnos inscritos en el curso.
     *
     * @return El mapa de alumnos donde la clave es el número de LU y el valor es el objeto Alumno.
     */
    public Map<Integer, Alumno> getAlumnos() {
        return this.alumnos;
    }

    /**
     * Establece el mapa de alumnos inscritos en el curso.
     *
     * @param p_alumnos El mapa de alumnos donde la clave es el número de LU y el valor es el objeto Alumno.
     */
    private void setAlumnos(Map<Integer, Alumno> p_alumnos) {
        this.alumnos = p_alumnos;
    }

    /**
     * Inscribe un alumno en el curso.
     *
     * @param p_alumno El objeto Alumno que se desea inscribir.
     */
    public void inscribirAlumno(Alumno p_alumno) {
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }

    /**
     * Muestra en la consola la lista de alumnos inscritos en el curso.
     */
    public void mostrarInscriptos() {
        this.getAlumnos()
                .forEach((k, v) -> System.out.println(v.getLu() + " " + v.getApellido() + ", " + v.getNombre()));
    }

    /**
     * Imprime en la consola el promedio del alumno identificado por su número de LU.
     *
     * @param p_lu El número de LU del alumno cuyo promedio se desea imprimir.
     */
    public void imprimirPromedioDelAlumno(int p_lu) {
        Alumno alumno = this.getAlumnos().get(p_lu);
        System.out.println(String.format("Promedio del Alumno %s - %.2f",
                alumno.getApellido(),
                alumno.promedio()));
    }

    /**
     * Busca un alumno en el curso por su número de LU.
     *
     * @param p_lu El número de LU del alumno que se desea buscar.
     * @return El objeto Alumno encontrado o null si no se encontró.
     */
    public Alumno buscarAlumno(int p_lu) {
        return this.getAlumnos().get(p_lu);
    }

    /**
     * Verifica si un alumno con un número de LU dado está inscrito en el curso.
     *
     * @param p_lu El número de LU del alumno a verificar.
     * @return true si el alumno está inscrito en el curso, false si no.
     */
    public boolean estaInscripto(int p_lu) {
        return this.getAlumnos().containsKey(p_lu);
    }

    /**
     * Verifica si un objeto Alumno está inscrito en el curso.
     *
     * @param p_alumno El objeto Alumno que se desea verificar.
     * @return true si el objeto Alumno está inscrito en el curso, false si no.
     */
    public boolean estaInscripto(Alumno p_alumno) {
        return this.getAlumnos().containsValue(p_alumno);
    }

    /**
     * Obtiene la cantidad de alumnos inscritos en el curso.
     *
     * @return La cantidad de alumnos inscritos en el curso.
     */
    public int cantidadAlumnos() {
        return this.getAlumnos().size();
    }

    /**
     * Quita un alumno inscrito en el curso por su número de LU.
     *
     * @param p_lu El número de LU del alumno que se desea quitar.
     * @return El objeto Alumno que fue retirado, o null si no se encontró.
     */
    public Alumno quitarAlumno(int p_lu) {
        return this.getAlumnos().remove(p_lu);
    }
}
