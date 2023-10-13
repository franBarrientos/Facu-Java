public class Renglon {
    private int cantidad;
    private double importe;
    private Etiqueta item;

    public Renglon(int p_cantidad, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
        this.setImporte(p_item.precio(this.getCantidad()));
    }

    public void mostrar(){
        System.out.println(this.getCantidad()+" "+ this.getItem().toString());
        System.out.println("Precio: $"+this.getItem().precio(this.getCantidad()));
    }

    public int getCantidad() {
        return this.cantidad;
    }

    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    public double getImporte() {
        return this.importe;
    }

    private void setImporte(double p_importe) {
        this.importe = p_importe;
    }

    public Etiqueta getItem() {
        return this.item;
    }

    private void setItem(Etiqueta p_item) {
        this.item = p_item;
    }
}
