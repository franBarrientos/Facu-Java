import java.util.List;

public class Hotel extends Alojamiento {

    private String tipoHabitacion;

    public Hotel(String p_nombre, double p_precioBase,
                 int p_diasAlquiler, List<Servicio> p_servicios,
                 String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler,
                 String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    private void setTipoHabitacion(String p_tipoHabitacion) {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    @Override
    public double costo() {
        if (this.getTipoHabitacion().equals("Single")) {
            return super.costo() + this.getDiasAlquiler() * 20;
        } else if (this.getTipoHabitacion().equals("Doble")) {
            return super.costo() + this.getDiasAlquiler() * 35;
        }
        return super.costo();
    }

    @Override
    public void liquidar() {
        System.out.println("Habitacion " + this.getTipoHabitacion());
        super.liquidar();
        System.out.println(String.format("Total: ------> $%.2f", this.costo()));
    }
}
