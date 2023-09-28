import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Profesor> profesores;

    public Facultad(String p_nombre, List<Profesor> p_profesores) {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
   public Facultad(String p_nombre, Profesor p_profesor) {
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<>(){{
            add(p_profesor);
        }});
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public List<Profesor> getProfesores() {
        return this.profesores;
    }

    public void setProfesores(List<Profesor> p_profesores) {
        this.profesores = p_profesores;
    }

    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    public boolean quitarProfesor(Profesor p_profesor){
        return this.getProfesores().remove(p_profesor);
    }

    public double totalAPagar(){
        return this.getProfesores()
                .stream()
                .mapToDouble(Profesor::sueldoTotal)
                .sum();
    }

    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: "+this.getNombre());
        System.out.println("-".repeat(100));
        this.getProfesores().forEach(p-> System.out.println(p.mostrarLinea()));
        System.out.println("-".repeat(100));
        System.out.println(String.format(" Total a pagar: $%.2f", this.totalAPagar()));
        System.out.println("-".repeat(100));
        System.out.println("Hay "+this.getProfesores().size()+" profesore");
    }

    public void listarProfesorCargos(){
        System.out.println("***** Detalle de Profesores y cargos de Facultad: "+this.getNombre() + " *****");
        this.getProfesores().forEach(Profesor::mostrar);
    }
}
