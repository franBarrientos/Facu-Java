import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Profesor extends Persona{

    private String titulo;
    private List<Cargo> cargos;

    public Profesor(int p_nroDni, String p_nombre, String p_apellido,
                    int p_anioNacimiento, String p_titulo, List<Cargo> p_cargos) {
        super(p_nroDni, p_nombre, p_apellido, p_anioNacimiento);
        this.setTitulo(p_titulo);
        if (p_cargos.size() < 1 || p_cargos.size() > 3) {
            throw new IllegalArgumentException("La cantidad de cargos debe estar entre 1 y 3.");
        }
        this.setCargos(p_cargos);
    }
    public Profesor(int p_nroDni, String p_nombre, String p_apellido,
                    Calendar p_fechaNacimiento, String p_titulo, List<Cargo> p_cargos) {
        super(p_nroDni, p_nombre, p_apellido, p_fechaNacimiento);
        this.setTitulo(p_titulo);
        if (p_cargos.size() < 1 || p_cargos.size() > 3) {
            throw new IllegalArgumentException("La cantidad de cargos debe estar entre 1 y 3.");
        }
        this.setCargos(p_cargos);
    }

    public Profesor(int p_nroDni, String p_nombre, String p_apellido,
                    Calendar p_fechaNacimiento, String p_titulo,Cargo p_cargo) {
        super(p_nroDni, p_nombre, p_apellido, p_fechaNacimiento);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<>(){{add(p_cargo);}});
    }
   public Profesor(int p_nroDni, String p_nombre, String p_apellido,
                    int p_anioNacimiento, String p_titulo,Cargo p_cargo) {
        super(p_nroDni, p_nombre, p_apellido, p_anioNacimiento);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<>(){{add(p_cargo);}});
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    private void setCargos(List<Cargo> p_cargos) {
        this.cargos = p_cargos;
    }

    public boolean agregarCargo(Cargo p_cargo){
        if(this.getCargos().size() < 3){
            return this.getCargos().add(p_cargo);
        }else {
            System.out.println("La cantidad de cargos debe estar entre 1 y 3.");
            return false;
        }

    }

    public boolean quitarCargo(Cargo p_cargo){
        if(this.getCargos().size() > 1){
            return this.getCargos().remove(p_cargo);
        }else {
            System.out.println("La cantidad de cargos debe estar entre 1 y 3.");
            return false;
        }
    }

    public double sueldoTotal(){
        return this.getCargos()
                .stream()
                .mapToDouble(Cargo::sueldoDelCargo)
                .sum();
    }

    public void listarCargos(){
        System.out.println("-***** Cargos Asignados *****- \n"+"-".repeat(100));
        this.getCargos().forEach(Cargo::mostrarCargo);
    }

    public void mostrar(){
        System.out.println(" ------------------ **** -------------------");
        super.mostrar();
        System.out.println("Titulo :"+this.getTitulo());
        System.out.println(" ------------------ **** -------------------");
        this.listarCargos();
        System.out.println(String.format("** Sueldo Total: %.2f **", this.sueldoTotal()));
    }

    public String mostrarLinea(){
        return "DNI: "+this.getNroDni()+" - Nombre: " +this.getApellido() + " " + this.getNombre()+
                String.format(" - Sueldo Total: %.2f", this.sueldoTotal());
    }

}
