public class Docente {
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;


    public Docente(String nombre, String grado, double sueldoBasico, double asignacionFamiliar) {
       setNombre(nombre);
       setGrado(grado);
       setSueldoBasico(sueldoBasico);
       setAsignacionFamiliar(asignacionFamiliar);
    }




    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return this.grado;
    }

    private void setGrado(String grado) {
        this.grado = grado;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }

    private void setAsignacionFamiliar(double asignacionFamiliar) {
        this.asignacionFamiliar = asignacionFamiliar;
    }

    public double calcularSueldo(){
        return getSueldoBasico() + getAsignacionFamiliar();
    }

}
