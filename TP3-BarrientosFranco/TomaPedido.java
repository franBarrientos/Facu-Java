import java.util.ArrayList;
import java.util.Calendar;

/**
 * Clase ejecutable TomaPedido que permite tomar un pedido de un cliente, agregar productos al pedido,
 * mostrar el detalle del pedido y eliminar productos del mismo.
 * Esta clase implementa la interfaz MenuOption.
 * Se utiliza para interactuar con el usuario a través de la consola.
 * La información del cliente, productos y pedidos se ingresa a través de la entrada estándar.
 * La fecha del pedido se establece automáticamente como la fecha actual.
 *
 * @author Barrientos Franco
 * @version V0.01
 */
public class TomaPedido implements MenuOption {

    /**
     * Método principal que crea una instancia de TomaPedido y llama al método run() para iniciar la interacción.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        new TomaPedido().run();
    }

    /**
     * Implementación del método run() de la interfaz MenuOption.
     * Permite tomar un pedido de un cliente, agregar productos al pedido, mostrar el detalle del pedido
     * y eliminar productos del mismo a través de la entrada estándar.
     */
    @Override
    public void run() {
        System.out.println("Ingrese Cliente");
        Cliente fran = new Cliente(
                InputHelper.scanIntByKeyboardAndPrint("Ingrese Dni: "),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Apellido: "),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Nombre: "),
                InputHelper.scanDoubleByKeyboardAndPrint("Ingrese saldo: "));

        System.out.println("Ingrese Laboratorio");
        Laboratorio miLab = new Laboratorio(
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Nombre: "),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Domicilio: "),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Telefono: "),
                InputHelper.scanIntByKeyboardAndPrint("Ingrese Compra Minima: "));

        System.out.println("Ingrese Producto");
        Producto producto1 = new Producto(InputHelper.scanIntByKeyboardAndPrint("Ingrese Codigo: "),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Rubro"),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Descripcion"),
                InputHelper.scanLongByKeyboardAndPrint("Ingrese Costo: "),
                miLab);

        Producto producto2 = new Producto(InputHelper.scanIntByKeyboardAndPrint("Ingrese Codigo: "),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Rubro"),
                InputHelper.scanStringByKeyboardAndPrint("Ingrese Descripcion"),
                InputHelper.scanLongByKeyboardAndPrint("Ingrese Costo: "),
                miLab);


        Calendar fechaPedido = Calendar.getInstance();
        Pedido pedidoDeFran = new Pedido(fechaPedido, fran, new ArrayList<>(){{
            add(producto1);
            add(producto2);
        }});

        pedidoDeFran.mostrarPedido();
        pedidoDeFran.quitarProducto(
                new Producto(InputHelper.scanIntByKeyboardAndPrint("Ingrese codigo de producto a " +
                        "eliminar: "),null,null,0, null));

        System.out.println(".".repeat(100));

        pedidoDeFran.mostrarPedido();
    }
}
