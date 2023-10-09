public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(double p_base, double p_altura, Punto p_origen ) {
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    public double getBase() {
        return this.base;
    }

    private void setBase(double p_base) {
        this.base = p_base;
    }

    public double getAltura() {
        return this.altura;
    }

    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }

    @Override
    public double superficie() {
        return base * altura;
    }

    @Override
    public String nombreFigura() {
        return "****** Triángulo ******";
    }

}
