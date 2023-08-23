import java.util.Random;

public class CreaFigura {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(
                new Random().nextDouble() * 100.0,
                new Punto());
        circulo.desplazar(240, 230);
        circulo.caracteristicas();

        Circulo circulo2 = new Circulo(
                new Random().nextDouble(),
                new Punto(5.2, 0.5));

        /*
         * circulo.elMayor(circulo2).mostrar();
         * System.out.println("La distancia de ");
         * circulo.mostrar();
         * System.out.println(" y ");
         * circulo2.mostrar();
         * System.out.println(" es " + circulo.distanciaA(circulo2));
         */

        Rectangulo rectangulo = new Rectangulo(
                new Random().nextDouble() * 100.0,
                new Random().nextDouble() * 100.0);
        rectangulo.desplazar(40, 20);
        rectangulo.caracteristicas();

        Rectangulo rectangulo2 = new Rectangulo(
                new Punto(7.4, 4.5),
                new Random().nextDouble() * 100.0,
                new Random().nextDouble() * 100.0);

        rectangulo.elMayor(rectangulo2).caracteristicas();
        System.out.println(rectangulo.distanciaA(rectangulo2));
    }
}
