public abstract class ArtefactoHogar {
    private String marca;
    private float precio;
    private int stock;

    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    public String getMarca() {
        return this.marca;
    }

    protected void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    public float getPrecio() {
        return this.precio;
    }

    protected void setPrecio(float p_precio) {
        this.precio = p_precio;
    }

    public int getStock() {
        return this.stock;
    }

    protected void setStock(int p_stock) {
        this.stock = p_stock;
    }

    public float cuotaCredito(int p_coutas, float p_interes) {
        return (this.getPrecio() + ((this.getPrecio() * p_interes) / 100)) / p_coutas;
    }

    public void imprimir() {
        System.out.println("Marca: " + this.getMarca() +
                " - Precio: " + String.format("$%.2f", this.getPrecio())
                + " - Stock: " + this.getStock());
    }

    public abstract float creditoConAdicional(int p_coutas, float p_interes);
}
