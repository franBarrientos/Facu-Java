public class Exclusivo extends Cargo {
    private int horasDeInvestigacion;
    private int horasDeExtension;

    public Exclusivo(String p_nombreCargo, double p_sueldoBasico,
                     int p_anioIngreso, int p_horasDocencia,
                     int p_horasInvestigacion, int p_horasExtension) {
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso);
        this.setHorasDeDocencia(p_horasDocencia);
        this.setHorasDeInvestigacion(p_horasInvestigacion);
        this.setHorasDeExtension(p_horasExtension);
    }

    public int getHorasDeInvestigacion() {
        return this.horasDeInvestigacion;
    }

    public void setHorasDeInvestigacion(int p_horasDeInvestigacion) {
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }

    public int getHorasDeExtension() {
        return this.horasDeExtension;
    }

    public void setHorasDeExtension(int p_horasDeExtension) {
        this.horasDeExtension = p_horasDeExtension;
    }

    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----\n" +
                "Horas investigación: "+ this.getHorasDeInvestigacion()+
                "Horas de extension: "+ this.getHorasDeExtension());
    }
}
