import java.util.ArrayList;
import java.util.List;

public abstract class Alojamiento {
    private String nombre;
    private double precioBase;
    private int diasAlquiler;

    private List<Servicio> servicios;

    public Alojamiento(String p_nombre, double p_precioBase,
                       int p_diasAlquiler, List<Servicio> p_servicios) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }

    public Alojamiento(String p_nombre, double p_precioBase,
                       int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<>());
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    private void setPrecioBase(double p_precioBase) {
        this.precioBase = p_precioBase;
    }

    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }

    public List<Servicio> getServicios() {
        return this.servicios;
    }

    private void setServicios(List<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }

    public boolean agregarServicio(Servicio p_servicio) {
        return this.getServicios().add(p_servicio);
    }

    public boolean quitarServicio(Servicio p_servicio) {
        return this.getServicios().remove(p_servicio);
    }


    public void listarServicios() {
        this.getServicios()
                .forEach(s -> {
                    System.out.println(s.getDescripcion() + " : $" + s.getPrecio());
                });
    }

    public double costoServicios() {
        return this.getServicios()
                .stream()
                .mapToDouble(Servicio::getPrecio)
                .sum();
    }


    public double costo() {
        return this.getPrecioBase() * this.getDiasAlquiler();
    }

    public void liquidar() {
        System.out.println("Alojamiento: "+ this.getNombre());
        System.out.println("Costo por "+ this.getDiasAlquiler() + " " +
                "dias :"+ String.format("$%.2f", this.costo()) );
        this.listarServicios();
    }
    public int contar(String p_alojamiento) {
        return this.getClass().getName().equals(p_alojamiento) ? 1 : 0;
    }






}
