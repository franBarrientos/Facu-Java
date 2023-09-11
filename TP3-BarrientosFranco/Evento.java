import java.util.Calendar;

public class Evento {
    private String nombre;
    private String lugar;
    private Calendar fecha;
    private int diasInscripcion;
    private double costo;

    public Evento(String p_nombre, String p_lugar, Calendar p_fecha, int p_diasInscripcion, double p_costo) {
        this.setNombre(p_nombre);
        this.setLugar(p_lugar);
        this.setFecha(p_fecha);
        this.setDiasInscripcion(p_diasInscripcion);
        this.setCosto(p_costo);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String p_nombre) {
        nombre = p_nombre;
    }

    public String getLugar() {
        return lugar;
    }

    private void setLugar(String p_lugar) {
        lugar = p_lugar;
    }

    public Calendar getFecha() {
        return fecha;
    }

    private void setFecha(Calendar p_fecha) {
        fecha = p_fecha;
    }

    public int getDiasInscripcion() {
        return diasInscripcion;
    }

    private void setDiasInscripcion(int p_diasInscripcion) {
        diasInscripcion = p_diasInscripcion;
    }

    public double getCosto() {
        return costo;
    }

    private void setCosto(double p_costo) {
        costo = p_costo;
    }

    public String costoFinal(int p_edadInvitado) {
        if (p_edadInvitado > 60) {
            return String.format("$%.2f (incluye descuento)", (this.getCosto() - (this.getCosto() * 10) / 100));
        } else {
            return String.format("$%.2f", this.getCosto());
        }
    }

    public Calendar fechaInscripcion(){
        Calendar fechaInscripcion = Calendar.getInstance();
        fechaInscripcion.set(this.getFecha().get(Calendar.YEAR) ,
                this.getFecha().get(Calendar.MONTH),
                this.getFecha().get(Calendar.DAY_OF_MONTH) - this.getDiasInscripcion());
        return fechaInscripcion;
    }


}
