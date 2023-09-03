/**
 * Clase que representa a un rectangulo y su comportamiento
 */
public class Rectangulo {
    private Punto origen = new Punto();
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    public Rectangulo(Punto origen, double ancho, double alto) {
        this.setOrigen(origen);
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    public Punto getOrigen() {
        return this.origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Traslada su origen a otra posición, sin cambiar sus dimensiones
     * 
     * @param x incremento x
     * @param y incremento y
     */
    public void desplazar(double x, double y) {
        this.getOrigen().desplazar(x, y);
    }

    /**
     * Calcula el perimetro del rectangulo
     * 
     * @return perimetro
     */
    public double perimetro() {
        return (this.getAncho() + this.getAlto()) * 2;
    }

    /**
     * Calcula el area del rectangulo
     * 
     * @return el area
     */
    public double superficie() {
        return this.getAlto() * this.getAncho();
    }

    /**
     * muestra en consola el estado del rectangulo con el siguiente formato,
     * ****** Rectangulo ******
     * Origen: (0.0, 0.0) - Alto: 200.0 - Ancho: 100.0
     * Superficie: 20000.0 - Perímetro: 600.0
     * 
     */
    public void caracteristicas() {
        System.out.println("***** Rectangulo *****");
        System.out.println("Origen: "+this.getOrigen().coordenadas()+" - Alto: "+this.getAlto()+" - Ancho: "+this.getAncho());
        System.out.println("Superficie: "+ this.superficie()+" - Perimetro: "+this.perimetro());
    }

    /**
     * Calcula la distancia entre dos rectángulos
     * @param otroRectangulo otro rectangulo
     * @return distancia
      */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }

    /**
     * Devuelve el rectangulo que tiene la mayor superficie
     * @param otroRectangulo otro rectangulo
     * @return  rectangulo mayor
      */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        return (this.superficie() > otroRectangulo.superficie()) ?
            this 
            :
            otroRectangulo;
    }

}
