public abstract class Etiqueta {
    private double costo;
    public abstract double precio(int q);

    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    public String toString(){
        String commonValues = "tipo "+this.tipo()+" - Costo: $"+this.getCosto();
        if(this.getClass().getName() == "Premium"){
            return commonValues+" - Colores: "+ ((Premium) this).getColores();
        } else if (this.getClass().getName() == "Comun") {
            return commonValues+" - Diseño: $"+((Comun) this).getPlus();
        }
    return "";
    }

    protected abstract String tipo();

    public double getCosto() {
        return this.costo;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }
}
