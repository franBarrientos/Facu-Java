/**
 * Clase que representa un laboratorio con su nombre, domicilio, teléfono,
 * compra mínima y día de entrega.
 * 
 * Esta clase modela los datos de un laboratorio y sus características.
 * 
 * @author Barrientos Franco
 * @version V0.01
 */
public class Laboratorio {
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor de la clase Laboratorio, instancia un objeto Laboratorio con día
     * de entrega.
     * 
     * @param p_nombre       Nombre del laboratorio.
     * @param p_domicilio    Domicilio del laboratorio.
     * @param p_telefono     Teléfono del laboratorio.
     * @param p_compraMinima Compra mínima del laboratorio.
     * @param p_diaEntrega   Día de entrega del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }

    /**
     * Constructor de la clase Laboratorio, instancia un objeto Laboratorio sin día
     * de entrega.
     * 
     * @param p_nombre       Nombre del laboratorio.
     * @param p_domicilio    Domicilio del laboratorio.
     * @param p_telefono     Teléfono del laboratorio.
     * @param p_compraMinima Compra mínima del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    public int getCompraMinima() {
        return this.compraMinima;
    }

    public void setCompraMinima(int p_compraMinima) {
        this.compraMinima = p_compraMinima;
    }

    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    public void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }

    /**
     * Muestra en consola los datos básicos del laboratorio.
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getNombre());
        System.out.println(" Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono());
    }
}
