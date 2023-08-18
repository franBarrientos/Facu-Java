/**
 * Clase que representa a un circulo
  */
public class Circulo {
    private double radio; 
    private Punto centro = new Punto(); //inicalizo para que prevenir errores


    public Circulo(double radio, Punto centro) {
        setRadio(radio);
        setCentro(centro);
    }

    public Circulo(){
        setRadio(0);
    }


    public double getRadio() {
        return this.radio;
    }

    private void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return this.centro;
    }

    private void setCentro(Punto centro) {
        this.centro = centro;
    }

    /**
     * Desplaza la posicion del centro sin afectar a su dimension
     * @param x incremento x del centro
     * @param y incremento y del centro
      */
    public void desplazar(double x, double y){
        this.centro.desplazar(x, y);
    }


    public double superficie(){
        return Math.PI * radio;
    }

    public double perimetro(){
        return superficie()*2;
    }

    public double distanciaA(Circulo circulo){
        return Math.sqrt(
            Math.pow((circulo.getCentro().getX() - this.centro.getX()), 2)
            +
            Math.pow((circulo.getCentro().getY() - this.centro.getY()), 2));
    }

    public Circulo elMayor(Circulo circulo){
        return (circulo.superficie() > this.superficie())? circulo : this ;
    }

    public void mostrar(){
        System.out.println("***** Circulo ******");
        System.out.println("Centro: "+ getCentro().coordenadas() +" -Radio: "+this.getRadio());
        System.out.println("Superficie: "+this.superficie()+" - Perimetro: "+this.perimetro());
    }
    
}
