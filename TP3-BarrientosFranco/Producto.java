/**
 * Clase que representa a Producto
 * Esta clase modela los datos de un Producto y sus características
 * @author Barrientos Franco
 * @version 1.0
 */
public class Producto {
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * Constructor completo de Producto
     *
     * @param p_codigo     código del producto
     * @param p_rubro      rubro del producto
     * @param p_descripcion descripción del producto
     * @param p_costo      costo del producto
     * @param p_porcPtoRepo porcentaje de punto de reposición del producto
     * @param p_existMinima existencia mínima del producto
     * @param p_laboratorio laboratorio del producto
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, double p_porcPtoRepo, int p_existMinima,
            Laboratorio p_laboratorio) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_laboratorio);
    }

    /**
     * Constructor simplificado de Producto
     *
     * @param p_codigo     código del producto
     * @param p_rubro      rubro del producto
     * @param p_descripcion descripción del producto
     * @param p_costo      costo del producto
     * @param p_laboratorio laboratorio del producto
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_laboratorio) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setLaboratorio(p_laboratorio);
    }

    public int getCodigo() {
        return this.codigo;
    }

    private void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }

    public String getRubro() {
        return this.rubro;
    }

    private void setRubro(String p_rubro) {
        this.rubro = p_rubro;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }

    public double getCosto() {
        return this.costo;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    public int getStock() {
        return this.stock;
    }

    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    public double getPorcPtoRepo() {
        return this.porcPtoRepo;
    }

    private void setPorcPtoRepo(double p_porcPtoRepo) {
        this.porcPtoRepo = p_porcPtoRepo;
    }

    public int getExistMinima() {
        return this.existMinima;
    }

    private void setExistMinima(int p_existMinima) {
        this.existMinima = p_existMinima;
    }

    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    private void setLaboratorio(Laboratorio p_laboratorio) {
        this.laboratorio = p_laboratorio;
    }

    /**
     * Ajusta la cantidad de stock
     *
     * @param p_cantidad cantidad a ajustar de stock
     */
    public void ajuste(int p_cantidad) {
        this.setStock( this.getStock() + p_cantidad);
    }

    /**
     * Calcula el precio de lista, valor que resulta de agregar un porcentaje al
     * precio de costo
     *
     * @return precio de lista
     */
    public double precioLista() {
        return (this.getCosto() + ((this.getCosto() * 12) / 100));
    }

    /**
     * Calcula el porcentaje pasado como parámetro, de un valor pasado como segundo
     * parámetro
     *
     * @param p_porcPorcentaje porcentaje a calcular
     * @param p_valor          valor a sacar el porcentaje
     * @return valor del porcentaje
     */


    /**
     * Calcula el precio de contado, valor que resulta de restar un porcentaje al
     * precio de costo
     *
     * @return precio de lista
     */
    public double precioContado() {
        return (this.precioLista() - ((this.precioLista() * 5) / 100));
    }

    /**
     * Calcula el stock valorizado, valor que resulta de multiplicar stock por valor
     * del producto más una x rentabilidad
     *
     * @return precio de lista
     */
    public double stockValorizado() {
        double stockAPrecioCosto = (this.getCosto() * this.getStock());
        return (stockAPrecioCosto + ((stockAPrecioCosto * 12) / 100));
    }

    /**
     * Ajusta el porcentaje de punto de reposición
     *
     * @param p_porcPtoReposicion porcentaje de punto reposición a actualizar
     */
    public void ajustarPtoRepo(double p_porcPtoReposicion) {
        this.setPorcPtoRepo(p_porcPtoReposicion);
    }

    /**
     * Ajusta la existencia mínima del producto
     *
     * @param p_existMinima cantidad de existencia mínima a actualizar
     */
    public void ajustarExistMin(int p_existMinima) {
        this.setExistMinima(p_existMinima);
    }

    /**
     * Muestra en consola los datos del producto con el siguiente formato
     * Laboratorio: Colgate S.A.
     * Domicilio: Scalabrini Ortiz 5524 - Teléfono: 54-11 -4239-8447
     * Rubro: Perfumería
     * Descripción: Jabón Deluxe
     * Precio Costo:  $5.25
     * Stock: 500 - Stock Valorizado: $2940.00
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getLaboratorio().getNombre());
        System.out.println("Domicilio: " + this.getLaboratorio().getDomicilio() + " - Teléfono: " + this.getLaboratorio().getTelefono());
        System.out.println("");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripción :" + this.getDescripcion());
        System.out.println("Precio Costo:  $" + String.format("%.2f", this.getCosto()));
        System.out.println("Stock: " + this.getStock() + " - Stock Valorizado: $" + String.format("%.2f", this.stockValorizado()));
    }

    /**
     * Devuelve un String formado por la concatenación de la descripción del
     * producto, el precio de lista y el precio de contado, según el siguiente formato:
     * 
     * @return "Jabón Deluxe 11.20 10.64"
     */
    public String mostrarLinea() {
        return this.getDescripcion() + " " + String.format("%.2f", this.precioLista()) + " " + String.format("%.2f", this.precioContado());
    }
}
