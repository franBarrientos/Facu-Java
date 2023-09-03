/**
 * Clase que representa a Producto
 * * Esta clase modela los datos de un Producto y sus características
 */
public class Producto {
    private int codigo;
    private String rubro = "";
    private String descripcion = "";
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    public Producto(int codigo, String rubro, String descripcion, double costo, double porcPtoRepo, int existMinima,
            Laboratorio Laboratorio) {
        this.setCodigo(codigo);
        this.setRubro(rubro);
        this.setDescripcion(descripcion);
        this.setCosto(costo);
        this.setPorcPtoRepo(porcPtoRepo);
        this.setExistMinima(existMinima);
        this.setLaboratorio(Laboratorio);
    }

    public Producto(int codigo, String rubro, String descripcion, double costo, Laboratorio Laboratorio) {
        this.setCodigo(codigo);
        this.setRubro(rubro);
        this.setDescripcion(descripcion);
        this.setCosto(costo);
        this.setLaboratorio(Laboratorio);
    }

    private int getCodigo() {
        return this.codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String getRubro() {
        return this.rubro;
    }

    private void setRubro(String rubro) {
        this.rubro = rubro;
    }

    private String getDescripcion() {
        return this.descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private double getCosto() {
        return this.costo;
    }

    private void setCosto(double costo) {
        this.costo = costo;
    }

    private int getStock() {
        return this.stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private double getPorcPtoRepo() {
        return this.porcPtoRepo;
    }

    private void setPorcPtoRepo(double porcPtoRepo) {
        this.porcPtoRepo = porcPtoRepo;
    }

    private int getExistMinima() {
        return this.existMinima;
    }

    private void setExistMinima(int existMinima) {
        this.existMinima = existMinima;
    }

    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     * Ajusta la cantidad de stock
     * 
     * @param cantidad cantidad a actualizar de stock
     */
    public void ajuste(int cantidad) {
        this.setStock(cantidad);
    }

    /**
     * calcula el precio de lista , valor que resulta de agregar un porcentaje al
     * precio de costo
     * 
     * @return precio de lista
     */
    public double precioLista() {
        return (this.getCosto() + ((this.getCosto() * 12) / 100));
    }

    /**
     * Calcula el porcentaje pasado como parametro, de un valor pasado como segundo
     * parametro
     * 
     * @param porcentaje porcentaje a calcular
     * @param valor      valor a sacar el porcentaje
     * @return valor del porcentaje
     */
    /*
     * private double calcularPorcentajeApartirDelUnValor(double porcentaje, double
     * valor) {
     * return ((valor * porcentaje) / 100);
     * }
     */

    /**
     * calcula el precio de contado , valor que resulta de restar un porcentaje al
     * precio de costo
     * 
     * @return precio de lista
     */
    public double precioContado() {
        return (this.precioLista() - ((this.precioLista() * 5) / 100));
    }

    /**
     * calcula el stock valorizado , valor que resulta de multiplicar stock por
     * valor del producto mas una x rentabilidad
     * 
     * @return precio de lista
     */
    public double stockValorizado() {
        var stockAPrecioCosto = (this.getCosto() * this.getStock());
        return (stockAPrecioCosto + ((stockAPrecioCosto * 12) / 100));
    }

    /**
     * Ajusta el porcentaje de punto de reposicion
     * 
     * @param porcentajePtoReposicion porcentaje de punto reposicion a actualizar
     */
    public void ajustarPtoRepo(double porcentajePtoReposicion) {
        this.setPorcPtoRepo(porcPtoRepo);
    }

    /**
     * Ajusta la existencia minima del producto
     * 
     * @param existMinima cantidad de existencia minima a actualizar
     */
    public void ajustarExistMin(int existMinima) {
        this.setExistMinima(existMinima);
    }

    /**
     * Muestra en consola los datos del pruducto con el siguiente formato
     * Laboratorio: Colgate S.A.
     * Domicilio: Scalabrini Ortiz 5524 - Teléfono: 54-11 -4239-8447
     * Rubro: Perfumería
     * Descripción: Jabón Deluxe
     * Precio Costo: 5.25
     * Stock: 500 - Stock Valorizado: $2940
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + laboratorio.getNombre());
        System.out.println("Domicilio: " + laboratorio.getDomicilio() + " - Telefono: " + laboratorio.getTelefono());
        System.out.println("");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion :" + this.getDescripcion());
        System.out.println("Precio Costo:  $" + String.format("%.2f", this.getCosto()));
        System.out
                .println("Stock: " + this.getStock() + " - Stock Valorizado: $" + String.format("%.2f", this.stockValorizado()));
    }

    /**
     * devuelve un String formado por la concatenación de la descripción del
     * producto, el precio de
     * lista y el precio de contado, según el siguiente formato:
     * 
     * @return "Jabón Deluxe 11.20 10.64"
     */
    public String mostrarLinea() {
        return this.getDescripcion() + " " + String.format("%.2f", this.precioLista()) + " "
                + String.format("%.2f", this.precioContado());
    }

}