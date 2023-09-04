/**
 * Esta clase representa una cuenta de caja de ahorro bancaria asociada a una
 * persona titular.
 * @author Barrientos Franco
 * @version 1.0
 */
public class CajaDeAhorro {
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    /**
     * Crea una nueva instancia de CajaDeAhorro con el número de cuenta y el titular
     * especificados.
     *
     * @param p_nroCuenta Número de cuenta de la caja de ahorro.
     * @param p_titular   Persona titular de la caja de ahorro.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setExtraccionesPosibles(10);
    }

    /**
     * Crea una nueva instancia de CajaDeAhorro con el número de cuenta, el saldo
     * inicial y el titular especificados.
     *
     * @param p_nroCuenta Número de cuenta de la caja de ahorro.
     * @param p_saldo     Saldo inicial de la caja de ahorro.
     * @param p_titular   Persona titular de la caja de ahorro.
     */
    public CajaDeAhorro(int p_nroCuenta, double p_saldo, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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

    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    private void setExtraccionesPosibles(int p_extraccionesPosibles) {
        this.extraccionesPosibles = p_extraccionesPosibles;
    }

    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    /**
     * Verifica si es posible realizar una extracción de dinero dada la cantidad
     * especificada y las extracciones disponibles.
     *
     * @param p_importe La cantidad de dinero a extraer.
     * @return true si es posible realizar la extracción, false en caso contrario.
     */
    private boolean puedoExtraer(double p_importe) {
        return (!(p_importe > this.getSaldo()) && this.getExtraccionesPosibles() > 0);
    }

    /**
     * Realiza una extracción de dinero de la caja de ahorro, actualizando el saldo
     * y el número de extracciones disponibles.
     *
     * @param p_importe La cantidad de dinero a extraer.
     */
    private void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }

    /**
     * Permite extraer dinero de la caja de ahorro si es posible, y muestra el
     * estado actual de la cuenta.
     *
     * @param p_importe La cantidad de dinero a extraer.
     */
    public void extraer(double p_importe) {
        if (this.puedoExtraer(p_importe)) {
            this.extraccion(p_importe);
            this.mostrar();
        } else {
            System.out
                    .println("No tiene habilitadas mas extracciones! (si el numero de extracciones posibles es cero)");
            System.out.println("No puede extraer mas que el saldo! (si el importe es mayor al saldo)");
        }
    }

    /**
     * Realiza un depósito de dinero en la caja de ahorro y actualiza el saldo.
     *
     * @param p_importe La cantidad de dinero a depositar.
     */
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    /**
     * Muestra la información actual de la caja de ahorro, incluyendo número de
     * cuenta, saldo, titular y extracciones posibles.
     */
    public void mostrar() {
        System.out.println("- Caja de Ahorro -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + String.format("%.2f", this.getSaldo()));
        System.out.println("Titular: " + this.getTitular().getNombre()+ " " + this.getTitular().getApellido());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }

}
