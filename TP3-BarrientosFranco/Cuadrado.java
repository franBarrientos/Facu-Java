public class Cuadrado extends Rectangulo{

    public Cuadrado(Punto p_origen, double p_lado) {
        super(p_origen, p_lado, p_lado);
    }

    public String nombreFigura(){
        return "***** Cuadrado *****";

    }

    public void caracteristicas(){
        this.nombreFigura();
        super.caracteristicas();
    }
}
