public class EjecutableFormasGeometricas implements MenuOption{

    public static void main(String[] args) {
        new EjecutableFormasGeometricas().run();
    }
    @Override
    public void run() {
        Rectangulo miRectangulo = new Rectangulo(20, 11);
        Cuadrado miCuadrado = new Cuadrado(new Punto(), 20);

        miRectangulo.caracteristicas();
        miCuadrado.caracteristicas();
    }
}
