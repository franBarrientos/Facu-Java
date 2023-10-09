public class Lavarropas extends ArtefactoHogar{

    private int programas;
    private float kilos;
    private boolean automatico;

    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    public int getProgramas() {
        return this.programas;
    }

    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    public float getKilos() {
        return this.kilos;
    }

    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    public boolean getAutomatico() {
        return this.automatico;
    }

    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }
    @Override
    public void imprimir(){
        System.out.println("*** Lavarropas ***");
        super.imprimir();
        System.out.println("Programas: "+this.getProgramas());
        System.out.println("Kilos: "+this.getKilos());
        System.out.println("Automatico: "+(this.getAutomatico()? "SI":"NO"));
    }
    @Override
    public float creditoConAdicional(int p_coutas, float p_interes) {
        return !this.getAutomatico()?
                this.cuotaCredito(p_coutas, p_interes)-(this.cuotaCredito(p_coutas, p_interes) * 2 / 100)
                :
                this.cuotaCredito(p_coutas, p_interes);
    }
}
