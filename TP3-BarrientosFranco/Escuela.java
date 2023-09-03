/**
 * Clase que representa una escuela con su información y métodos relacionados.
 */
public class Escuela {
    private String nombre;
    private String domicilio;
    private String director;

    /**
     * Crea una nueva instancia de Escuela con los detalles proporcionados.
     *
     * @param p_nombre Nombre de la escuela.
     * @param p_domicilio Domicilio de la escuela.
     * @param p_director Director de la escuela.
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }

    private String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private String getDomicilio() {
        return this.domicilio;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    private String getDirector() {
        return this.director;
    }

    private void setDirector(String p_director) {
        this.director = p_director;
    }

    /**
     * Imprime un recibo del docente con los detalles de la escuela y el sueldo del docente.
     *
     * @param docente Docente para el cual se imprimirá el recibo.
     */
    public void imprimirRecibo(Docente docente) {
        System.out.println(
            String.format(
                "Escuela: %s    Domicilio: %s   Director: %s%n",
                this.getNombre(), this.getDomicilio(), this.getDirector())
                + ".".repeat(100)
                + String.format(
                    "%nDocente:    %s.%n" +
                    "Sueldo: %s $%.2f.%n" +
                    "Sueldo Basico: %s  $%.2f.%n" +
                    "Asignacion Familiar: %s  $%.2f.%n",
                    docente.getNombre(),
                    ".".repeat(10), docente.calcularSueldo(),
                    ".".repeat(10), docente.getSueldoBasico(),
                    ".".repeat(10), docente.getAsignacionFamiliar()
                ));
    }
}
