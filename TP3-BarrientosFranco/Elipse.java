public class Elipse {
    private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;

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
        return centro;
    }

    private void setCentro(Punto p_centro) {
        centro = p_centro;
    }

    public String nombreFigura(){
        return "****** Elipse ******";
    }

    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro "+ this.getCentro().coordenadas() + " - " +
                " Semieje Mayor: " + this.getsEjeMayor() +
                " Semieje Menor: " + this.getsEjeMenor());
        System.out.println("Superficie "+this.superficie());

    }

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
