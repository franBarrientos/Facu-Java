import java.util.ArrayList;
import java.util.List;

public class Gerencia {
    private String nombre;
    private List<Alojamiento> alojamientosAlquilados;

    public Gerencia(String p_nombre, List<Alojamiento> p_alojamientosAlquilados) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientosAlquilados);
    }

    public Gerencia(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<>());
    }

    public List<Alojamiento> getAlojamientosAlquilados() {
        return this.alojamientosAlquilados;
    }

    private void setAlojamientosAlquilados(List<Alojamiento> p_alojamientosAlquilados) {
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }

    public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }

    public int contarAlojamiento(String tipoAlojamiento) {
        return this.getAlojamientosAlquilados().stream()
                .mapToInt(alojamiento -> alojamiento.contar(tipoAlojamiento))
                .sum();
    }

    public void liquidar(){
        this.getAlojamientosAlquilados().forEach(Alojamiento::liquidar);
    }

    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre() +
                " Liquidación-------------------");
        this.liquidar();
        System.out.println("Alojamiento tipo Cabaña ---->"+this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ---->"+this.contarAlojamiento("Hotel"));

    }

}
