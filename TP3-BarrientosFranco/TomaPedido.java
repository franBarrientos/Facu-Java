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
        Cliente fran = new Cliente(45645852, "Barriendo", "Franco", 200000);

        Laboratorio miLab = new Laboratorio("Laborarotio SA", "JAMAICA 2158", "3794029441", 200000);

        Producto productoIbuprofeno1 = new Producto(21356, "Analgesicos", "Ibuprofeno", 200, miLab);

        Producto productoBayaspirina2 = new Producto(51456, "Analgesicos", "Bayaspirina", 250, miLab);

        Calendar fechaPedido = Calendar.getInstance();
        fechaPedido.set(2023, 8, 11);
        Pedido pedidoDeFran = new Pedido(fechaPedido, fran, new ArrayList<>(){{
            add(productoIbuprofeno1);
            add(productoBayaspirina2);
        }});

        pedidoDeFran.mostrarPedido();
        pedidoDeFran.quitarProducto(new Producto(21356,null,null,0, null));

        System.out.println(".".repeat(100));

        pedidoDeFran.mostrarPedido();
    }


}
