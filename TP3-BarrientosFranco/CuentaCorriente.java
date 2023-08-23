/**
 * Esta clase representa una cuenta corriente bancaria asociada a una persona
 * titular.
 */
public class CuentaCorriente {
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto = 500;
    private Persona titular;

    /**
     * Crea una nueva instancia de CuentaCorriente con el número de cuenta y el
     * titular especificados.
     *
     * @param nroCuenta Número de cuenta de la cuenta corriente.
     * @param titular   Persona titular de la cuenta corriente.
     */
    public CuentaCorriente(int nroCuenta, Persona titular) {
        setNroCuenta(nroCuenta);
        setTitular(titular);
    }

    /**
     * Crea una nueva instancia de CuentaCorriente con el número de cuenta, el
     * titular y el saldo inicial especificados.
     *
     * @param nroCuenta Número de cuenta de la cuenta corriente.
     * @param titular   Persona titular de la cuenta corriente.
     * @param saldo     Saldo inicial de la cuenta corriente.
     */
    public CuentaCorriente(int nroCuenta, Persona titular, double saldo) {
        setNroCuenta(nroCuenta);
        setTitular(titular);
        setSaldo(saldo);
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    private void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    private void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    /**
     * Verifica si es posible realizar una extracción de dinero dada la cantidad
     * especificada.
     *
     * @param importe La cantidad de dinero a extraer.
     * @return true si es posible realizar la extracción, false en caso contrario.
     */
    private boolean puedoExtraer(double importe) {
        return !(importe > (getSaldo() + getLimiteDescubierto()));
    }

    /**
     * Realiza una extracción de dinero de la cuenta corriente.
     *
     * @param importe La cantidad de dinero a extraer.
     */
    private void extraccion(double importe) {
        setSaldo(getSaldo() - importe);
    }

    /**
     * Permite extraer dinero de la cuenta corriente si es posible, y muestra el
     * estado actual de la cuenta.
     *
     * @param importe La cantidad de dinero a extraer.
     */
    public void extraer(double importe) {
        if (puedoExtraer(importe)) {
            extraccion(importe);
            mostrar();
        } else {
            System.out.println("El importe de extraccion sobrepasa el limite de descubierto!");
        }
    }

    /**
     * Realiza un depósito de dinero en la cuenta corriente y actualiza el saldo.
     *
     * @param importe La cantidad de dinero a depositar.
     */
    public void depositar(double importe) {
        setSaldo(getSaldo() + importe);
    }

    /**
     * Muestra la información actual de la cuenta corriente, incluyendo número de
     * cuenta, saldo, titular y límite de descubierto.
     */
    public void mostrar() {
        System.out.println("- Cuenta Corriente -");
        System.out.println("Nro. Cuenta: " + getNroCuenta() + " - Saldo: " + String.format("%.2f", getSaldo()));
        System.out.println("Titular: " + titular.getNombre() + " " + titular.getApellido());
        System.out.println("Descubierto: " + String.format("%.2f", getLimiteDescubierto()));
    }

}
