/**
 * Clase que representa un laboratorio con su nombre, domicilio, teléfono,
 * compra mínima y día de entrega.
 * 
 * Esta clase modela los datos de un laboratorio y sus características.
 * 
 * @author Barrientos Franco y Cabrera Romani Lucas
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
     * @param p_nombre       nombre del laboratorio.
     * @param p_domicilio    domicilio del laboratorio.
     * @param p_telefono     teléfono del laboratorio.
     * @param p_compraMinima compra mínima del laboratorio.
     * @param p_diaEntrega   día de entrega del laboratorio.
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
     * @param p_nombre       nombre del laboratorio.
     * @param p_domicilio    domicilio del laboratorio.
     * @param p_telefono     teléfono del laboratorio.
     * @param p_compraMinima compra mínima del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
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

    public String getTelefono() {
        return this.telefono;
    }

    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    public int getCompraMinima() {
        return this.compraMinima;
    }

    private void setCompraMinima(int p_compraMinima) {
        this.compraMinima = p_compraMinima;
    }

    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }

    /**
     * metodo que actualiza la compra minima con el parametro real p_compraminma.
     * @param p_compraMin nueva compra minima
     */
    public void nuevaCompraMinima(int p_compraMin) {
        this.setCompraMinima(p_compraMin);
    }

    /**
     * metodo que actualiza la dia de entrega con el parametro real p_diaEnt
     * @param p_diaEnt nuevo dia de entrega
     */
    public void nuevoDiaEntrega(int p_diaEnt) {
        this.setDiaEntrega(p_diaEnt);
    }

    /**
     * Muestra en consola los datos básicos del laboratorio.
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getNombre());
        System.out.println(" Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono());
    }
}
