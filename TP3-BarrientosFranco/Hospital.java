/**
 * Clase que representa un hospital con su información y director.
 */
public class Hospital {
    private String nombreHospital;
    private String nombreDirector;

    /**
     * Crea una nueva instancia de Hospital con los detalles proporcionados.
     *
     * @param p_nombreHospital Nombre del hospital.
     * @param p_nombreDirector Nombre del director del hospital.
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector) {
        this.setNombreDirector(p_nombreDirector);
        this.setNombreHospital(p_nombreHospital);
    }

    /**
     * Realiza la consulta de los datos filiatorios de un paciente y muestra la información en pantalla.
     *
     * @param p_paciente Paciente del cual se consulta la información.
     */
    public void consultaDatosFiliatorios(Paciente p_paciente) {
        System.out.println("Hospital: " + this.getNombreHospital() + "   Director " + this.getNombreDirector());
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
