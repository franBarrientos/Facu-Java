import java.text.SimpleDateFormat;
import java.util.*;

public class Pedido {
    private Calendar fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Calendar getFecha() {
        return fecha;
    }

    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }

    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<>());
        this.agregarProducto(p_producto);
    }


    public void setFecha(Calendar p_fecha) {
        fecha = p_fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente p_cliente) {
        cliente = p_cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> p_productos) {
        productos = p_productos;
    }


    public double totalAlContado(){
        return this.getProductos().stream().mapToDouble(p-> p.precioContado()).sum();
    }
    public double totalFinanciado(){
        return this.getProductos().stream().mapToDouble(p-> p.precioLista()).sum();
    }

    public boolean agregarProducto(Producto p_producto) {
        return this.getProductos().add(p_producto);
    }
    public boolean quitarProducto(Producto p_producto) {
        Optional<Producto> optionalProduct =
                this.getProductos().stream().filter(p -> p.getCodigo() == p_producto.getCodigo()).findAny();

        if(optionalProduct.isPresent()){
            return  this.getProductos().remove(optionalProduct.get());
        }else {
            return false;
        }
    }

    public void mostrarPedido(){
        SimpleDateFormat formatoFechaString = new SimpleDateFormat("'el día' d 'de' MMMM 'de' yyyy",
                new Locale("es", "ES"));
        System.out.println("****** Detalle del pedido ******* Fecha: "
                + formatoFechaString.format(this.getFecha().getTime()));

        System.out.println(" Producto    Precio Lista    Precio Contado");
        System.out.println("-".repeat(100));
        for (Producto i_product: this.getProductos()) {
            System.out.println(i_product.mostrarLinea());
        }
        System.out.println("-".repeat(100));
        System.out.println(String.format("*** Total ------%.2f    %.2f", this.totalFinanciado(), this.totalAlContado()));
    }


}
