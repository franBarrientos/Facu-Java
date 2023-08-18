public class Escuela {
    private String nombre;
    private String domicilio;
    private String director;

    public Escuela(String nombre, String domicilio, String director) {
        setNombre(nombre);
        setDomicilio(domicilio);
        setDirector(director);
    }

    private String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDomicilio() {
        return this.domicilio;
    }

    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    private String getDirector() {
        return this.director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public void imprimirRecibo(Docente docente){
        System.out.println(
            String.format(
        "Escuela: %s    Domicilio: %s   Director: %s%n"
            ,getNombre(), getDomicilio(), getDirector())
            +".".repeat(100)+
            String.format(
                "%nDocente:    %s.%n" +
                "Sueldo: %s $%.2f.%n" +
                "Sueldo Basico: %s  $%.2f.%n" +
                "Asignacion Familiar: %s  $%.2f.%n"
            , docente.getNombre(),
            ".".repeat(10), docente.calcularSueldo(),
            ".".repeat(10),docente.getSueldoBasico(),
            ".".repeat(10),docente.getAsignacionFamiliar()
            ) );
    }

}
