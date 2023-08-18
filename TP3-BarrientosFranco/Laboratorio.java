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
    private String nombre = "";
    private String domicilio = "";
    private String telefono = "";
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor de la clase Laboratorio, instancia un objeto Laboratorio con día
     * de entrega.
     * 
     * @param nombre       nombre del laboratorio.
     * @param domicilio    domicilio del laboratorio.
     * @param telefono     teléfono del laboratorio.
     * @param compraMinima compra mínima del laboratorio.
     * @param diaEntrega   día de entrega del laboratorio.
     */
    public Laboratorio(String nombre, String domicilio, String telefono, int compraMinima, int diaEntrega) {
        setNombre(nombre);
        setDomicilio(domicilio);
        setTelefono(telefono);
        setCompraMinima(compraMinima);
        setDiaEntrega(diaEntrega);
    }

    /**
     * Constructor de la clase Laboratorio, instancia un objeto Laboratorio sin día
     * de entrega.
     * 
     * @param nombre       nombre del laboratorio.
     * @param domicilio    domicilio del laboratorio.
     * @param telefono     teléfono del laboratorio.
     * @param compraMinima compra mínima del laboratorio.
     */
    public Laboratorio(String nombre, String domicilio, String telefono, int compraMinima) {
        setNombre(nombre);
        setDomicilio(domicilio);
        setTelefono(telefono);
        setCompraMinima(compraMinima);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCompraMinima() {
        return this.compraMinima;
    }

    public void setCompraMinima(int compraMinima) {
        this.compraMinima = compraMinima;
    }

    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    public void setDiaEntrega(int diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    /**
     * Muestra en consola los datos básicos del laboratorio.
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getNombre());
        System.out.println(" Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono());
    }
}
