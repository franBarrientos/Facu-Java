/**
 * Clase que representa a una mujer con su información personal y estado civil.
 * @author Barrientos Franco
 * @version 1.0
 */
public class Mujer {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    /**
     * Crea una nueva instancia de Mujer con los detalles proporcionados, casándose con un hombre.
     *
     * @param p_nombre Nombre de la mujer.
     * @param p_apellido Apellido de la mujer.
     * @param p_edad Edad de la mujer.
     * @param p_esposo Hombre con el cual se casa.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.casarseCon(p_esposo);
    }

    /**
     * Crea una nueva instancia de Mujer con los detalles proporcionados.
     *
     * @param p_nombre Nombre de la mujer.
     * @param p_apellido Apellido de la mujer.
     * @param p_edad Edad de la mujer.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
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

    public int getEdad() {
        return this.edad;
    }

    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    public Hombre getEsposo() {
        return this.esposo;
    }

    private void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    /**
     * Casa a la mujer con un hombre y actualiza su estado civil.
     *
     * @param p_hombre Hombre con el cual se casa.
     */
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
    }

    /**
     * Realiza el divorcio, si está casada, y actualiza su estado civil.
     */
    public void divorcio() {
        if(this.getEsposo() != null) {
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }
    }

    /**
     * Retorna los datos personales de la mujer.
     *
     * @return Datos personales de la mujer.
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * Muestra en consola el estado civil de la mujer.
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     * Muestra en consola que la mujer está casada con su esposo.
     */
    public void casadaCon() {
        System.out.println(this.datos() + " está casada con " + this.getEsposo().datos());
    }
}
