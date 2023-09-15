import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TomaPedido implements MenuOption {

    public static void main(String[] args) {
        new TomaPedido().run();
    }

    @Override
    public void run() {
        System.out.println("Ingrese Cliente");
        Cliente fran = new Cliente(
                InputHelper.insertIntByKeyboard("Ingrese Dni: "),
                InputHelper.insertStringByKeyboard("Ingrese Apellido: "),
                InputHelper.insertStringByKeyboard("Ingrese Nombre: "),
                InputHelper.insertDoubleByKeyboard("Ingrese saldo: "));

        System.out.println("Ingrese Laboratorio");
        Laboratorio miLab = new Laboratorio(
                InputHelper.insertStringByKeyboard("Ingrese Nombre: "),
                InputHelper.insertStringByKeyboard("Ingrese Domicilio: "),
                InputHelper.insertStringByKeyboard("Ingrese Telefono: "),
                InputHelper.insertIntByKeyboard("Ingrese Compra Minima: "));

        System.out.println("Ingrese Producto");
        Producto producto1 = new Producto(InputHelper.insertIntByKeyboard("Ingrese Codigo: "),
                InputHelper.insertStringByKeyboard("Ingrese Rubro"),
                InputHelper.insertStringByKeyboard("Ingrese Descripcion"),
                InputHelper.insertLongByKeyboard("Ingrese Costo: "),
                miLab);

        Producto producto2 = new Producto(InputHelper.insertIntByKeyboard("Ingrese Codigo: "),
                InputHelper.insertStringByKeyboard("Ingrese Rubro"),
                InputHelper.insertStringByKeyboard("Ingrese Descripcion"),
                InputHelper.insertLongByKeyboard("Ingrese Costo: "),
                miLab);


        Calendar fechaPedido = Calendar.getInstance();
        Pedido pedidoDeFran = new Pedido(fechaPedido, fran, new ArrayList<>(){{
            add(producto1);
            add(producto2);
        }});



        pedidoDeFran.mostrarPedido();
        pedidoDeFran.quitarProducto(
                new Producto(InputHelper.insertIntByKeyboard("Ingrese codigo de producto a " +
                "eliminar: "),null,null,0, null));

        System.out.println(".".repeat(100));

        pedidoDeFran.mostrarPedido();
    }


}
