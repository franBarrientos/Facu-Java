public class SemiExclusivo extends Cargo{
    private int horasDeInvestigacion;

    public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico,
                         int p_anioIngreso,int p_horasDeInvestigacion) {
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso);
        if ( p_horasDeInvestigacion > 10) {
            throw new IllegalArgumentException("La cantidad de horas de docencia debe ser " +
                    "como minimo 10.");
        }
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
        this.setHorasDeDocencia(20 - p_horasDeInvestigacion);
    }

    public int getHorasDeInvestigacion() {
        return this.horasDeInvestigacion;
    }

    private void setHorasDeInvestigacion(int p_horasDeInvestigacion) {
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }

    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----\n" +
                "Horas investigación: "+ this.getHorasDeInvestigacion());
    }
}
