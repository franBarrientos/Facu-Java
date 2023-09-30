import java.util.ArrayList;
import java.util.List;

public class Jardin {
    private String nombre;
    private List<FiguraGeometrica> figuras;

    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<>());
    }
    public Jardin(String p_nombre, List<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public List<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    private void setFiguras(List<FiguraGeometrica> p_figuras) {
        this.figuras = p_figuras;
    }

    public boolean agregarFigura(FiguraGeometrica figuraGeometrica){
        return this.getFiguras().add(figuraGeometrica);
    }
    public boolean quitarFigura(FiguraGeometrica figuraGeometrica){
        return this.getFiguras().remove(figuraGeometrica);
    }

    public double cuantosMetros(){
        return this.getFiguras()
                .stream()
                .mapToDouble(FiguraGeometrica::superficie)
                .sum();
    }

    public double cuantosLitros(){
        return this.cuantosMetros() / 5;
    }

    public int cuantosLatas(){
        return (int) (this.cuantosLitros() / 4);
    }


    public void detalleFiguras(){
        System.out.println("Presupuesto: "+this.getNombre());
        this.getFiguras().forEach(FiguraGeometrica::mostrarSuperficie);
        System.out.println("-".repeat(100));
        System.out.println("Total a cubrir :"+this.cuantosMetros());
        System.out.println("Comprar "+this.cuantosLatas() + " latas");
    }

}
