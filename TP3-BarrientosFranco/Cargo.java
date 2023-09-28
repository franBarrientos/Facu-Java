import java.util.Calendar;
import java.util.Objects;

public class Cargo {

    private  String nombreCargo;
    private  double sueldoBasico;
    private int anioIngreso;
    private   int horasDeDocencia;

    public Cargo(String p_nombreCargo, double p_sueldoBasico,
                 int p_anioIngreso) {
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(10);
    }

    public String getNombreCargo() {
        return this.nombreCargo;
    }

    private void setNombreCargo(String p_nombreCargo) {
        this.nombreCargo = p_nombreCargo;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    public int getAnioIngreso() {
        return this.anioIngreso;
    }

    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    public int getHorasDeDocencia() {
        return this.horasDeDocencia;
    }

    protected void setHorasDeDocencia(int p_horasDeDocencia) {
        this.horasDeDocencia = p_horasDeDocencia;
    }

    public int antiguedad(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.getAnioIngreso();
    }

    private double adicionalXAntiguedad(){
        return this.antiguedad() * 0.01 * this.getSueldoBasico();
    }

    public double sueldoDelCargo(){
        return this.adicionalXAntiguedad() + this.getSueldoBasico();
    }

    public void mostrarCargo(){
        System.out.println(this.getNombreCargo()+" - Sueldo Basico: " +this.getSueldoBasico()+
                "- Sueldo Cargo: "+this.sueldoDelCargo() +" – Antiguedad: "+this.antiguedad()+" años");
        System.out.println("Horas Docencia: "+this.getHorasDeDocencia());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return Double.compare(sueldoBasico, cargo.sueldoBasico) == 0 && anioIngreso == cargo.anioIngreso && horasDeDocencia == cargo.horasDeDocencia && Objects.equals(nombreCargo, cargo.nombreCargo);
    }
}

