import java.util.Random;

/**
 * Clase que testea las clases, Circulo, Rectangulo
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class CreaFigura implements MenuOption{
    /**
     * Se instancia objetos de la clase Circulo y Rectangulo, y luego se prueban sus metodos*/
    public void run() {
        Circulo circulo = new Circulo(
                new Random().nextDouble() * 100.0,
                new Punto());

        System.out.println(".".repeat(80));
        System.out.println("Primer Circulo con radio de valor random, antes de dezplazar");
        System.out.println(".".repeat(80));
        circulo.caracteristicas();



        circulo.desplazar(240, 230);


        System.out.println(".".repeat(80));
        System.out.println("Primer Circulo con radio de valor random, luego de dezplazar");
        System.out.println(".".repeat(80));

        circulo.caracteristicas();



        Circulo circulo2 = new Circulo(
                new Random().nextDouble(),
                new Punto(5.2, 0.5));

        System.out.println(".".repeat(80));
        System.out.println("Segundo Circulo con radio de valor random");
        System.out.println(".".repeat(80));
        circulo2.caracteristicas();

        System.out.println(".".repeat(80));
        System.out.println("Caracteristicas de Circulo mayor");
        System.out.println(".".repeat(80));

        circulo.elMayor(circulo2).caracteristicas();

        System.out.println(".".repeat(80));
        System.out.println("La distancia es "+ circulo.distanciaA(circulo2));
        System.out.println(".".repeat(80));


        System.out.println("EMPIEZA EJERCIOCIO DE RECTANGULO....");

        Rectangulo rectangulo = new Rectangulo(
                new Random().nextDouble() * 100.0,
                new Random().nextDouble() * 100.0);
        System.out.println(".".repeat(80));
        System.out.println("Primer Rectangulo antes de desplazar ");
        System.out.println(".".repeat(80));
        rectangulo.caracteristicas();
        rectangulo.desplazar(40, 20);
        System.out.println(".".repeat(80));
        System.out.println("Primer Rectangulo despues de desplazar, x a 40, e y a 20 ");
        System.out.println(".".repeat(80));
        rectangulo.caracteristicas();

        Rectangulo rectangulo2 = new Rectangulo(
                new Punto(7.4, 4.5),
                new Random().nextDouble() * 100.0,
                new Random().nextDouble() * 100.0);

        System.out.println(".".repeat(80));
        System.out.println("Segundo Rectangulo ");
        System.out.println(".".repeat(80));

        rectangulo2.caracteristicas();

        System.out.println(".".repeat(80));
        System.out.println("Caracteristicas del mayor");
        System.out.println(".".repeat(80));
        rectangulo.elMayor(rectangulo2).caracteristicas();
        System.out.println(".".repeat(80));
        System.out.println("La distancia de los dos rectagulos es.. : " + rectangulo.distanciaA(rectangulo2));
    }
}
