/**
 * Clase que representa a un hombre con su información personal y estado civil.
 */
public class Hombre {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * Crea una nueva instancia de Hombre con los detalles proporcionados, casándose con una mujer.
     *
     * @param p_nombre Nombre del hombre.
     * @param p_apellido Apellido del hombre.
     * @param p_edad Edad del hombre.
     * @param p_esposa Mujer con la cual se casa.
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.casarseCon(p_esposa);
    }

    /**
     * Crea una nueva instancia de Hombre con los detalles proporcionados.
     *
     * @param p_nombre Nombre del hombre.
     * @param p_apellido Apellido del hombre.
     * @param p_edad Edad del hombre.
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
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

    public Mujer getEsposa() {
        return this.esposa;
    }

    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }

    /**
     * Casa al hombre con una mujer y actualiza su estado civil.
     *
     * @param p_mujer Mujer con la cual se casa.
     */
    public void casarseCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }

    /**
     * Realiza el divorcio, si está casado, y actualiza su estado civil.
     */
    public void divorcio() {
        if(this.getEsposa() != null) {
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
        }
    }

    /**
     * Retorna los datos personales del hombre.
     *
     * @return Datos personales del hombre.
     */
    public String datos() {
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }

    /**
     * Muestra en consola el estado civil del hombre.
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }

    /**
     * Muestra en consola que el hombre está casado con su esposa.
     */
    public void casadoCon() {
        System.out.println(this.datos() + " está casado con " + this.getEsposa().datos());
    }
}
