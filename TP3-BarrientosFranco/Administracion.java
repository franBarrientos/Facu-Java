import java.util.ArrayList;
import java.util.Arrays;

public class Administracion implements MenuOption {
    public static void main(String[] args) {
        new Administracion().run();
    }
    @Override
    public void run() {
        Cuadrado miCuadrado = new Cuadrado(new Punto(), 5);
        Triangulo miTriangulo = new Triangulo(2, 2, new Punto());
        Circulo miCirculo = new Circulo( 32,new Punto());

        Jardin miJardin = new Jardin(" Bichito de Luz",
                new ArrayList<>(){{
                    addAll(Arrays.asList(miCirculo, miCuadrado, miTriangulo));
        }});

        miJardin.detalleFiguras();
    }
}
