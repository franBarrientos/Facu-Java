public abstract class FiguraGeometrica {
    protected Punto origen;

    public FiguraGeometrica(Punto p_origen) {
        this.setOrigen(p_origen);
    }

    public Punto getOrigen() {
        return this.origen;
    }

    protected void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    public abstract double superficie();

    public abstract String nombreFigura();

    public void mostrarSuperficie() {
        System.out.println(this.nombreFigura());
        System.out.println("Superficie: "+this.superficie());
    }


}
