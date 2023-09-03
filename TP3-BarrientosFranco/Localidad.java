/**
 * Clase que representa una localidad con su nombre y provincia.
 * 
 * Esta clase modela los datos de una localidad y su provincia asociada.
 * 
 * @author Barrientos Franco
 * @version 1.0
 */
public class Localidad {
    private String nombre;
    private String provincia;

    /**
     * Constructor de la clase Localidad, instancia un objeto Localidad.
     * 
     * @param p_nombre    Nombre de la localidad.
     * @param p_provincia Provincia de la localidad.
     */
    public Localidad(String p_nombre, String p_provincia) {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getProvincia() {
        return this.provincia;
    }

    private void setProvincia(String p_provincia) {
        this.provincia = p_provincia;
    }

    /**
     * Muestra en consola los datos de la localidad y su provincia asociada.
     */
    public void mostrar() {
        System.out.println("Localidad: " + this.getNombre() + "      Provincia: " + this.getProvincia());
    }
}
