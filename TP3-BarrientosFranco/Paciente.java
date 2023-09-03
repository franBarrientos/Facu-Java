/**
 * Clase que representa a un paciente con su historia clínica, nombre, domicilio,
 * localidad de nacimiento y localidad donde vive.
 * 
 * Esta clase modela los datos de un paciente y sus características.
 * 
 * @author Barrientos Franco
 * @version 1.0
 */
public class Paciente {
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * Constructor de la clase Paciente, instancia un objeto Paciente.
     * 
     * @param p_historiaClinica Historia clínica del paciente.
     * @param p_nombre          Nombre del paciente.
     * @param p_domicilio       Domicilio del paciente.
     * @param p_localidadNacido Localidad de nacimiento del paciente.
     * @param p_localidadVive   Localidad donde vive el paciente.
     */
    public Paciente(int p_historiaClinica, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive) {
        this.setHistoriaClinica(p_historiaClinica);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }

    public int getHistoriaClinica() {
        return this.historiaClinica;
    }

    private void setHistoriaClinica(int p_historiaClinica) {
        this.historiaClinica = p_historiaClinica;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    public Localidad getLocalidadNacido() {
        return this.localidadNacido;
    }

    private void setLocalidadNacido(Localidad p_localidadNacido) {
        this.localidadNacido = p_localidadNacido;
    }

    public Localidad getLocalidadVive() {
        return this.localidadVive;
    }

    private void setLocalidadVive(Localidad p_localidadVive) {
        this.localidadVive = p_localidadVive;
    }

    /**
     * Retorna una cadena de datos formateada del paciente.
     * 
     * @return Cadena de datos del paciente.
     */
    public String cadenaDeDatos() {
        return this.getNombre()
                + ".".repeat(10)
                + this.getHistoriaClinica()
                + ".".repeat(10)
                + this.getDomicilio()
                + "-"
                + this.getLocalidadVive().getNombre()
                + "-"
                + this.getLocalidadVive().getProvincia();
    }

    /**
     * Muestra en consola los datos del paciente y su localidad de vivienda.
     */
    public void mostrarDatosPantalla() {
        System.out.println("Paciente: " + this.getNombre() + "      Historia Clinica: " + this.getHistoriaClinica()
                + "       Domicilio: " + this.getDomicilio());
        this.getLocalidadVive().mostrar();
    }
}
