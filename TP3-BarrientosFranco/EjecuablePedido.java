import java.util.ArrayList;
import java.util.Arrays;

public class EjecuablePedido {
    public static void main(String[] args) {
        Renglon miRenglon = new Renglon(7, new Premium(200, 10) );
        Renglon miRenglon2 = new Renglon(57, new Comun(100) );
        Renglon miRenglon3 = new Renglon(94, new Premium(200, 7) );
        Pedido miPedido = new Pedido(new ArrayList<>()
        {{addAll(Arrays.asList(miRenglon, miRenglon2, miRenglon3));}});
        miPedido.mostrar();
    }
}
