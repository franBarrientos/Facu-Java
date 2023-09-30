public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(double p_base, double p_altura, Punto p_origen ) {
        this.setBase(p_base);
        this.setAltura(p_altura);
        this.setOrigen(p_origen);
    }
    public Punto getOrigen() {
        return this.origen;
    }

    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
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

    @Override
    public void mostrarSuperficie() {
        System.out.println(this.nombreFigura());
        System.out.println("Superficie: "+this.superficie());
    }
}
