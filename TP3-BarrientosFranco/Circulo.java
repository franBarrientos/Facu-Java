/**
 * Clase que representa a un círculo.
 * @author Barrientos Franco
 * @version 1.0
 */
public class Circulo extends Elipse{
    private double radio;

    /**
     * Constructor que crea un círculo con el radio y centro especificados.
     *
     * @param p_radio Radio del círculo.
     * @param p_centro Centro del círculo.
     */
    public Circulo(double p_radio, Punto p_centro) {
        super(p_radio, p_radio, p_centro);
        this.setRadio(p_radio);
    }

    /**
     * Constructor por defecto que crea un círculo con radio cero.
     */
    public Circulo() {
        super(0,0,new Punto());
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
     * Calcula el perímetro del círculo.
     *
     * @return El perímetro del círculo.
     */
    public double perimetro() {
        return this.superficie() * 2;
    }


    public String nombreFigura(){
        return " ****** Circulo ******";
    }
}
