import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Clase Pedido que representa un pedido realizado por un cliente en una fecha determinada.
 * El pedido contiene una lista de productos.
 * Se pueden calcular el total al contado y el total financiado del pedido.
 * También, se pueden agregar y quitar productos del pedido.
 * Se puede mostrar un detalle del pedido en la consola.
 * La fecha se representa con un objeto Calendar y el cliente con un objeto Cliente.
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class Pedido {
    private Calendar fecha;
    private Cliente cliente;
    private List<Producto> productos;

    /**
     * Obtiene la fecha del pedido.
     *
     * @return El objeto Calendar que representa la fecha del pedido.
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Constructor de la clase Pedido que recibe la fecha, el cliente y una lista de productos.
     *
     * @param p_fecha     El objeto Calendar que representa la fecha del pedido.
     * @param p_cliente   El objeto Cliente que realiza el pedido.
     * @param p_productos La lista de productos en el pedido.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }

    /**
     * Constructor de la clase Pedido que recibe la fecha, el cliente y un producto.
     * Inicializa la lista de productos con el producto recibido.
     *
     * @param p_fecha   El objeto Calendar que representa la fecha del pedido.
     * @param p_cliente El objeto Cliente que realiza el pedido.
     * @param p_producto El producto a agregar al pedido.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<>());
        this.agregarProducto(p_producto);
    }

    /**
     * Establece la fecha del pedido.
     *
     * @param p_fecha El objeto Calendar que representa la fecha del pedido.
     */
    public void setFecha(Calendar p_fecha) {
        fecha = p_fecha;
    }

    /**
     * Obtiene el cliente que realizó el pedido.
     *
     * @return El objeto Cliente que realizó el pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente que realizó el pedido.
     *
     * @param p_cliente El objeto Cliente que realizó el pedido.
     */
    public void setCliente(Cliente p_cliente) {
        cliente = p_cliente;
    }

    /**
     * Obtiene la lista de productos en el pedido.
     *
     * @return La lista de productos en el pedido.
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Establece la lista de productos en el pedido.
     *
     * @param p_productos La lista de productos en el pedido.
     */
    public void setProductos(List<Producto> p_productos) {
        productos = p_productos;
    }

    /**
     * Calcula el total al contado del pedido sumando los precios de contado de todos los productos.
     *
     * @return El total al contado del pedido.
     */
    public double totalAlContado() {
        return this.getProductos().stream().mapToDouble(p -> p.precioContado()).sum();
    }

    /**
     * Calcula el total financiado del pedido sumando los precios de lista de todos los productos.
     *
     * @return El total financiado del pedido.
     */
    public double totalFinanciado() {
        return this.getProductos().stream().mapToDouble(p -> p.precioLista()).sum();
    }

    /**
     * Agrega un producto al pedido.
     *
     * @param p_producto El producto que se desea agregar al pedido.
     * @return true si se agregó con éxito, false si no.
     */
    public boolean agregarProducto(Producto p_producto) {
        return this.getProductos().add(p_producto);
    }

    /**
     * Quita un producto del pedido por su código.
     *
     * @param p_producto El producto que se desea quitar del pedido.
     * @return true si se quitó con éxito, false si no se encontró.
     */
    public boolean quitarProducto(Producto p_producto) {
        Optional<Producto> optionalProduct =
                this.getProductos().stream().filter(p -> p.getCodigo() == p_producto.getCodigo()).findAny();

        if (optionalProduct.isPresent()) {
            return this.getProductos().remove(optionalProduct.get());
        } else {
            return false;
        }
    }

    /**
     * Muestra un detalle del pedido en la consola, incluyendo la fecha, los productos y los totales.
     */
    public void mostrarPedido() {
        SimpleDateFormat formatoFechaString = new SimpleDateFormat("'el día' d 'de' MMMM 'de' yyyy",
                new Locale("es", "ES"));
        System.out.println("****** Detalle del pedido ******* Fecha: "
                + formatoFechaString.format(this.getFecha().getTime()));

        System.out.println(" Producto    Precio Lista    Precio Contado");
        System.out.println("-".repeat(100));
        for (Producto i_product : this.getProductos()) {
            System.out.println(i_product.mostrarLinea());
        }
        System.out.println("-".repeat(100));
        System.out.println(String.format("*** Total ------%.2f    %.2f", this.totalFinanciado(), this.totalAlContado()));
    }
}
