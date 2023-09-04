/**
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
     * @param p_y cordenada y
     * @param p_x cordenada x
     */
    public Punto(double p_y, double p_x) {
        this.setY(p_y);
        this.setX(p_x);
    }

    /**
     * Constructor de la clase Punto, instancia un objeto Punto, asignado a sus
     * atributos , valores iniciales de 0
     *
     */
    public Punto() {
        this.setY(0);
        this.setX(0);
    }

    public double getY() {
        return this.y;
    }

    private void setY(double p_y) {
        this.y = p_y;
    }

    public double getX() {
        return this.x;
    }

    private void setX(double p_x) {
        this.x = p_x;
    }

    /**
     * Cambia la posición del punto desde (x, y) a
     * (x+dx, y+dy).
     *
     * @param p_dx Incremento x
     * @param p_dy Incremento y
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }

    /**
     * Cordenadas del punto
     *
     * @return una cadena con el formato: (7.5, 0.5)
     */
    public String coordenadas() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }

    /**
     * Muestra en consola las coordenadas del punto.
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
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }

    /**
     * Calcula la distancia desde él mismo (el
     * objeto que recibe el mensaje) hasta otro objeto Punto que es recibido como
     * parámetro
     *
     * @param ptoDistante punto desde el cual calcular la distancia
     * @return distancia
     */
    public double distanciaA(Punto ptoDistante) {
        return Math.sqrt(Math.pow((ptoDistante.getX() - this.getX()), 2)
                + Math.pow((ptoDistante.getY() - this.getY()), 2));
    }
}
