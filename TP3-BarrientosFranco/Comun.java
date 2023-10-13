public class Comun extends Etiqueta{

    private double plus;

    public Comun( double p_plus) {
        super(100);
        this.setPlus(p_plus);
    }

    @Override
    public double precio(int q) {
        return this.getCosto() * q +  this.getPlus() - this.descuento(q) ;
    }

    @Override
    protected String tipo() {
        return "Comun";
    }

    public double getPlus() {
        return this.plus;
    }

    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    private double descuento(int q){

        double priceWithoutDiscount =  this.getCosto() * q +this.getPlus();

        if (q <= 10) {
            return 0;
        }
        if ( q <= 50) {
            return priceWithoutDiscount *0.02;
        }
        if ( q <= 100) {
            return priceWithoutDiscount *0.05;
        }


        return priceWithoutDiscount * (q/10);
    }
}
