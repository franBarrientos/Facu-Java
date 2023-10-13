import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Renglon> renglones;

    public Pedido(List<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }
    public Pedido(Renglon p_renglon) {
        this.setRenglones(new ArrayList<>());
        this.addRenglon(p_renglon);
    }

    public List<Renglon> getRenglones() {
        return this.renglones;
    }

    private void setRenglones(List<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    private boolean addRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
    }
    private boolean removeRenglon(Renglon p_renglon){
        return this.getRenglones().remove(p_renglon);
    }

    public void mostrar(){
        double total = 0;
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: "+this.getRenglones().size());

        for (int i = 0; i < this.getRenglones().size(); i++) {
            Renglon renglon = this.getRenglones().get(i);
            total += renglon.getItem().precio(renglon.getCantidad());
            System.out.println("Item "+(i+1)+": ");
            renglon.mostrar();
        }

        System.out.println(String.format("--- Total Pedido: $%.2f",
                total));
    }
}
