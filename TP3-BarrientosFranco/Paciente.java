public class Paciente {
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;


    public Paciente(int p_historiaClinica, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive) {
        setHistoriaClinica(p_historiaClinica);
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setLocalidadNacido(p_localidadNacido);
        setLocalidadVive(p_localidadVive);
    }



    public int getHistoriaClinica() {
        return this.historiaClinica;
    }

    private void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Localidad getLocalidadNacido() {
        return this.localidadNacido;
    }

    private void setLocalidadNacido(Localidad localidadNacido) {
        this.localidadNacido = localidadNacido;
    }

    public Localidad getLocalidadVive() {
        return this.localidadVive;
    }

    private void setLocalidadVive(Localidad localidadVive) {
        this.localidadVive = localidadVive;
    }

    public String cadenaDeDatos(){
        return this.getNombre()
        +".".repeat(10)
        +this.getHistoriaClinica()
        +".".repeat(10)
        +this.getDomicilio()
        +"-"
        +this.getLocalidadVive().getNombre()
        +"-"
        +this.getLocalidadVive().getProvincia();
    }

    public void mostrarDatosPantalla(){
        System.out.println("Paciente: "+this.getNombre()+"      Historia Clinica: "+this.getHistoriaClinica()
        +"       Domicilio: "+this.getDomicilio());
        this.getLocalidadVive().mostrar();

    }




}
