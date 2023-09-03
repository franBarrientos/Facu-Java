/**
 * Clase que representa a un círculo.
 */
public class Circulo {
    private double radio;
    private Punto centro; // Inicializo para prevenir errores

    /**
     * Constructor que crea un círculo con el radio y centro especificados.
     *
     * @param p_radio Radio del círculo.
     * @param p_centro Centro del círculo.
     */
    public Circulo(double p_radio, Punto p_centro) {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }

    /**
     * Constructor por defecto que crea un círculo con radio cero.
     */
    public Circulo() {
        this.setRadio(0);
    }

    /**
     * Obtiene el radio del círculo.
     *
     * @return El radio del círculo.
     */
    public double getRadio() {
        return this.radio;
    }

    private void setRadio(double p_radio) {
        this.radio = p_radio;
    }

    /**
     * Obtiene el centro del círculo.
     *
     * @return El centro del círculo.
     */
    public Punto getCentro() {
        return this.centro;
    }

    private void setCentro(Punto p_centro) {
        this.centro = p_centro;
    }

    /**
     * Desplaza la posición del centro del círculo sin afectar su radio.
     *
     * @param p_x Incremento en la coordenada x del centro.
     * @param p_y Incremento en la coordenada y del centro.
     */
    public void desplazar(double p_x, double p_y) {
        this.centro.desplazar(p_x, p_y);
    }

    /**
     * Calcula la superficie del círculo.
     *
     * @return La superficie del círculo.
     */
    public double superficie() {
        return Math.PI * this.getRadio();
    }

    /**
     * Calcula el perímetro del círculo.
     *
     * @return El perímetro del círculo.
     */
    public double perimetro() {
        return this.superficie() * 2;
    }

    /**
     * Calcula la distancia entre el centro de este círculo y el centro de otro círculo.
     *
     * @param p_circulo Otro círculo.
     * @return La distancia entre los centros de los círculos.
     */
    public double distanciaA(Circulo p_circulo) {
        return Math.sqrt(
            Math.pow((p_circulo.getCentro().getX() - this.centro.getX()), 2)
            +
            Math.pow((p_circulo.getCentro().getY() - this.centro.getY()), 2));
    }

    /**
     * Determina cuál de dos círculos tiene mayor superficie.
     *
     * @param p_circulo Otro círculo a comparar.
     * @return El círculo con mayor superficie, o este círculo si tienen igual superficie.
     */
    public Circulo elMayor(Circulo p_circulo) {
        return (p_circulo.superficie() > this.superficie()) ? p_circulo : this;
    }

    /**
     * Imprime las características del círculo, incluyendo centro, radio, superficie y perímetro.
     */
    public void caracteristicas() {
        System.out.println("***** Círculo ******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }
}
