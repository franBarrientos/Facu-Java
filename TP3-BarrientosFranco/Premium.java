
public class Premium extends Etiqueta{

    private int colores;

    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }


    @Override
    public double precio(int q) {
        return q * this.getCosto() * (1 + this.adicional());
    }

    private double adicional(){
        switch (this.getColores()){
            case 1: return 0;
            case 2: return 0.05;
            case 3: return  0.07;
            default: return  0.03 *this.getColores();
        }
    }

    @Override
    protected String tipo() {
        return "Premium";
    }

    public int getColores() {
        return this.colores;
    }

    private void setColores(int p_colores) {
        this.colores = p_colores;
    }
}
