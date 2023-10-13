public class Cocina extends ArtefactoHogar{
    private int hornallas;
    private int calorias;
    private String dimensiones;

    public Cocina(String p_marca, float p_precio, int p_stock,
                  int p_hornallas, int p_calorias, String p_dimensiones) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    public int getHornallas() {
        return this.hornallas;
    }

    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    public int getCalorias() {
        return this.calorias;
    }

    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    public String getDimensiones() {
        return this.dimensiones;
    }

    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }

    @Override
    public void imprimir(){
        System.out.println("*** Cocina ***");
        super.imprimir();
        System.out.println("Hornallas: "+this.getHornallas());
        System.out.println("Calorias: "+this.getCalorias());
        System.out.println("Dimensiones: "+this.getDimensiones());
    }
    @Override
    public float creditoConAdicional(int p_coutas, float p_interes) {
        return this.cuotaCredito(p_coutas, p_interes);
    }
}
