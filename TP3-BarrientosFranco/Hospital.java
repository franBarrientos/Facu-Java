public class Hospital {
    private String nombreHospital;
    private String nombreDirector;


    public Hospital(String p_nombreHospital, String p_nombreDirector) {
        setNombreDirector(p_nombreDirector);
        setNombreHospital(p_nombreHospital);
    }


    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: "+this.getNombreHospital()+"   Director "+this.getNombreDirector());
        System.out.println(".".repeat(10));
        p_paciente.mostrarDatosPantalla();
    }



    public String getNombreHospital() {
        return this.nombreHospital;
    }

    private void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getNombreDirector() {
        return this.nombreDirector;
    }

    private void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }


}
