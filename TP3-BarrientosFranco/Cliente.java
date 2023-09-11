/**
 * Clase que representa a un cliente con su número de DNI, apellido, nombre y
 * saldo.
 * 
 * Esta clase modela los datos de un cliente.
 * 
 * @author Barrientos Franco y Cabrera Romani Lucas
 * @version V0.01
 */
public class Cliente {
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor de la clase Cliente, instancia un objeto Cliente.
     * 
     * @param p_nroDNI   número de DNI del cliente.
     * @param p_apellido apellido del cliente.
     * @param p_nombre   nombre del cliente.
     * @param p_saldo    saldo del cliente.
     */
    public Cliente(int p_nroDNI, String p_apellido, String p_nombre, double p_saldo) {
        this.setNroDNI(p_nroDNI);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_saldo);
    }

    public int getNroDNI() {
        return this.nroDNI;
    }

    private void setNroDNI(int p_nroDNI) {
        this.nroDNI = p_nroDNI;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    /**
     * Actualiza el saldo del cliente y retorna el nuevo saldo.
     * 
     * @param p_saldo El nuevo saldo a asignar.
     * @return El nuevo saldo actualizado.
     */
    public double nuevoSaldo(double p_saldo) {
        this.setSaldo(p_saldo);
        return this.getSaldo();
    }

    /**
     * el metodo agrega un importe al saldo actual y devuelve el nuevo saldo.
     * 
     * @param p_importe El nuevo importe a asignar.
     * @return El nuevo saldo actualizado.
     */
    public double agregaSaldo(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }

    /**
     * metodo que devuelve el nombre y apellido
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * metodo que devuelve apellido y nombre
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Muestra en consola los datos del cliente y su saldo.
     */
    public void mostrar() {
        System.out.println("- Cliente -");
        System.out.println(
                "Nombre y Apellido: " + this.nomYApe() + " (" + this.getNroDNI() + ")");
        System.out.println("Saldo: $" + String.format("%.2f", this.getSaldo()));
    }
}
