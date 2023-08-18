
/**
 * 
 * Clase que representa a un punto observado desde la geometria, tiene dos
 * propiedades relevantes: la abscisa X y la ordenada Y en el plano.
 * 
 * @author Barrientos Franco
 * @version V0.01
 */
public class Punto {
    private double y;
    private double x;

    /**
     * Constructor de la clase Punto, instancia un objeto Punto
     * 
     * @param y cordenada y
     * @param x cordenada x
     */
    public Punto(double y, double x) {
        setY(y);
        setX(x);

    }

    /**
     * Constructor de la clase Punto, instancia un objeto Punto, asignado a sus
     * atributos , valores iniciales de 0
     * 
     */
    public Punto() {
        setY(0);
        setX(0);
    }

    public double getY() {
        return this.y;
    }

    private void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    private void setX(double x) {
        this.x = x;
    }

    /**
     * Cambia la posición del punto desde (x, y) a
     * (x+dx, y+dy).
     * 
     * @param dx Incremento x
     * @param dy Incremento y
     */
    public void desplazar(double dx, double dy) {
        setX(x + dx);
        setY(y + dy);
    }

    /**
     * Cordenadas del punto
     * 
     * @return una cadena con el formato: (7.5, 0.5)
     */
    public String coordenadas() {
        return "(" + getX() + "," + getY() + ")";
    }

    /**
     * Muestra en consola las cordenadas del punto.
     * Ejemplo: <blockquote>
     * 
     * <pre>
     * Punto. X: 7.5, Y: 0.5
     * </pre>
     * 
     * </blockquote>
     * 
     */
    public void mostrar() {
        System.out.println("Punto. X: " + getX() + ", Y: " + getY());
    }

    /**
     * C la distancia desde él mismo (el
     * objeto que recibe el mensaje) hasta otro objeto Punto que es recibido como
     * parámetro
     * 
     * @param ptoDistante punto desde el cual calcular la distancia
     * @return distancia
     */
    public double distanciaA(Punto ptoDistante) {
        return Math.sqrt(
                Math.pow((ptoDistante.getX() - this.getX()), 2)
                +
                Math.pow((ptoDistante.getY() - this.getY()), 2));
    }
}
