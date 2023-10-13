import java.util.List;

public class Cabaña extends Alojamiento{
    private  int nroHabitaciones;
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler,
                  List<Servicio> p_servicios, int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler,
                  int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    public int getNroHabitaciones() {
        return this.nroHabitaciones;
    }

    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }

    @Override
    public double costo(){
        return super.costo() + this.getDiasAlquiler() * 30;
    }

    @Override
    public void liquidar(){
        System.out.println("Cabaña con "+this.getNroHabitaciones()+" habitaciones ");
        super.liquidar();
        System.out.println(String.format("Total: ------> $%.2f", this.costo()));
    }
}
