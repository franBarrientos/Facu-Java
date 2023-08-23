/**
 * Esta clase representa una cuenta de caja de ahorro bancaria asociada a una
 * persona titular.
 */
public class CajaDeAhorro {
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles = 10;
    private Persona titular;

    /**
     * Crea una nueva instancia de CajaDeAhorro con el número de cuenta y el titular
     * especificados.
     *
     * @param nroCuenta Número de cuenta de la caja de ahorro.
     * @param titular   Persona titular de la caja de ahorro.
     */
    public CajaDeAhorro(int nroCuenta, Persona titular) {
        setNroCuenta(nroCuenta);
        setTitular(titular);
    }

    /**
     * Crea una nueva instancia de CajaDeAhorro con el número de cuenta, el saldo
     * inicial y el titular especificados.
     *
     * @param nroCuenta Número de cuenta de la caja de ahorro.
     * @param saldo     Saldo inicial de la caja de ahorro.
     * @param titular   Persona titular de la caja de ahorro.
     */
    public CajaDeAhorro(int nroCuenta, double saldo, Persona titular) {
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

    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    private void setExtraccionesPosibles(int extraccionesPosibles) {
        this.extraccionesPosibles = extraccionesPosibles;
    }

    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * Verifica si es posible realizar una extracción de dinero dada la cantidad
     * especificada y las extracciones disponibles.
     *
     * @param importe La cantidad de dinero a extraer.
     * @return true si es posible realizar la extracción, false en caso contrario.
     */
    private boolean puedoExtraer(double importe) {
        return (!(importe > getSaldo()) && getExtraccionesPosibles() > 0);
    }

    /**
     * Realiza una extracción de dinero de la caja de ahorro, actualizando el saldo
     * y el número de extracciones disponibles.
     *
     * @param importe La cantidad de dinero a extraer.
     */
    private void extraccion(double importe) {
        setSaldo(getSaldo() - importe);
        setExtraccionesPosibles(getExtraccionesPosibles() - 1);
    }

    /**
     * Permite extraer dinero de la caja de ahorro si es posible, y muestra el
     * estado actual de la cuenta.
     *
     * @param importe La cantidad de dinero a extraer.
     */
    public void extraer(double importe) {
        if (puedoExtraer(importe)) {
            extraccion(importe);
            mostrar();
        } else {
            System.out
                    .println("No tiene habilitadas mas extracciones! (si el numero de extracciones posibles es cero)");
            System.out.println("No puede extraer mas que el saldo! (si el importe es mayor al saldo)");
        }
    }

    /**
     * Realiza un depósito de dinero en la caja de ahorro y actualiza el saldo.
     *
     * @param importe La cantidad de dinero a depositar.
     */
    public void depositar(double importe) {
        setSaldo(getSaldo() + importe);
    }

    /**
     * Muestra la información actual de la caja de ahorro, incluyendo número de
     * cuenta, saldo, titular y extracciones posibles.
     */
    public void mostrar() {
        System.out.println("- Caja de Ahorro -");
        System.out.println("Nro. Cuenta: " + getNroCuenta() + " - Saldo: " + String.format("%.2f", getSaldo()));
        System.out.println("Titular: " + titular.getNombre() + " " + titular.getApellido());
        System.out.println("Extracciones posibles: " + getExtraccionesPosibles());
    }

}
