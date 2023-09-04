/**
 * Clase que modela a una cuenta bancaria y a sus operaciones depositar y
 * extraer.
 * @author Barrientos Franco
 * @version 1.0
 */
public class CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    public CuentaBancaria(int p_nroCuenta, double p_saldo, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }

    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    /**
     * Incrementa el balance actual de la cuenta con el importe pasado como
     * parametro.
     * 
     * @param p_importe Importe a incrementar.
     * @return Importe actualizado.
     */
    public double depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }

    /**
     * Decrementa el balance actual de la cuenta con el importe pasado como
     * parametro.
     * 
     * @param p_importe Importe a decrementar.
     * @return Importe actualizado.
     */
    public double extraer(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }

    /**
     * Muestra en consola los datos de la cuenta con el siguiente formato:
     * - Cuenta Bancaria -
     * Titular: Juan Perez (34 años)
     * Saldo: 155.25
     */
    public void mostrar() {
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.titular.getNombre() + " " + this.titular.getApellido() + " (" + this.titular.edad() + " años)");
        System.out.println("Saldo: " + String.format("%.2f", this.getSaldo()));
    }

    /**
     * Retorna un string de la concatenación de número de cuenta, titular y saldo,
     * de la siguiente manera:
     * 1249 Juan Perez 1500.0
     */
    @Override
    public String toString() {
        return this.getNroCuenta() + " " + this.titular.getNombre() + " " + this.titular.getApellido() + "       " + String.format("%.2f", this.getSaldo());
    }
}
