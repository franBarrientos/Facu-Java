/**
 * Clase que representa a un rectángulo y su comportamiento
 * @author Barrientos Franco
 * @version 1.0
 */
public class Rectangulo {
    private Punto origen;
    private double ancho;
    private double alto;

    public Rectangulo(double p_ancho, double p_alto) {
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        this.setOrigen(new Punto());
    }

    public Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    public Punto getOrigen() {
        return this.origen;
    }

    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    public double getAncho() {
        return this.ancho;
    }

    private void setAncho(double p_ancho) {
        this.ancho = p_ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    private void setAlto(double p_alto) {
        this.alto = p_alto;
    }

    /**
     * Traslada su origen a otra posición, sin cambiar sus dimensiones
     *
     * @param p_x incremento x
     * @param p_y incremento y
     */
    public void desplazar(double p_x, double p_y) {
        this.getOrigen().desplazar(p_x, p_y);
    }

    /**
     * Calcula el perímetro del rectángulo
     *
     * @return perímetro
     */
    public double perimetro() {
        return (this.getAncho() + this.getAlto()) * 2;
    }

    /**
     * Calcula el área del rectángulo
     *
     * @return el área
     */
    public double superficie() {
        return this.getAlto() * this.getAncho();
    }

    /**
     * Muestra en consola el estado del rectángulo con el siguiente formato,
     * ****** Rectángulo ******
     * Origen: (0.0, 0.0) - Alto: 200.0 - Ancho: 100.0
     * Superficie: 20000.0 - Perímetro: 600.0
     *
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());;
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }

    /**
     * Calcula la distancia entre dos rectángulos
     * @param p_otroRectangulo otro rectángulo
     * @return distancia
     */
    public double distanciaA(Rectangulo p_otroRectangulo){
        return this.getOrigen().distanciaA(p_otroRectangulo.getOrigen());
    }

    /**
     * Devuelve el rectángulo que tiene la mayor superficie
     * @param p_otroRectangulo otro rectángulo
     * @return  rectángulo mayor
     */
    public Rectangulo elMayor(Rectangulo p_otroRectangulo){
        return (this.superficie() > p_otroRectangulo.superficie()) ?
                this
                :
                p_otroRectangulo;
    }

    public String nombreFigura(){
        return "***** Rectangulo *****";
    }

}
