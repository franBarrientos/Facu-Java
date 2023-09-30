public class Elipse extends FiguraGeometrica{
    private double sEjeMayor;
    private double sEjeMenor;
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        this.setsEjeMayor(p_sEjeMayor);
        this.setsEjeMenor(p_sEjeMenor);
        this.setCentro(p_centro);
    }

    public double getsEjeMayor() {
        return sEjeMayor;
    }

    private void setsEjeMayor(double p_sEjeMayor) {
        sEjeMayor = p_sEjeMayor;
    }

    public double getsEjeMenor() {
        return sEjeMenor;
    }

    private void setsEjeMenor(double p_sEjeMenor) {
        sEjeMenor = p_sEjeMenor;
    }

    public Punto getCentro() {
        return this.origen;
    }

    private void setCentro(Punto p_centro) {
        this.origen = p_centro;
    }

    @Override
    public String nombreFigura(){
        return "****** Elipse ******";
    }

    @Override
    public void mostrarSuperficie() {
        System.out.println(this.nombreFigura());
        System.out.println("Superficie: "+this.superficie());
    }

    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro "+ this.getCentro().coordenadas() + " - " +
                " Semieje Mayor: " + this.getsEjeMayor() +
                " Semieje Menor: " + this.getsEjeMenor());
        System.out.println("Superficie "+this.superficie());

    }
    @Override
    public double superficie(){
        return Math.PI * this.getsEjeMayor() * this.getsEjeMenor();
    }

    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }

    public double distanciaA(Elipse otraElipse){
        return this.getCentro().distanciaA(otraElipse.getCentro());
    }

    public Elipse elMayor(Elipse otraElipse){
        return this.superficie() > otraElipse.superficie()? this : otraElipse;
    }

}
