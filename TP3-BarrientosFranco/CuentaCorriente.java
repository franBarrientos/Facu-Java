/**
 * Esta clase representa una cuenta corriente bancaria asociada a una persona
 * titular.
 * @author Barrientos Franco
 * @version 1.0
 */
public class CuentaCorriente extends CuentaBancaria{

    private double limiteDescubierto;

    /**
     * Crea una nueva instancia de CuentaCorriente con el número de cuenta y el
     * titular especificados.
     *
     * @param p_nroCuenta Número de cuenta de la cuenta corriente.
     * @param p_titular   Persona titular de la cuenta corriente.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, 0, p_titular);
        this.setLimiteDescubierto(500l);
    }

    /**
     * Crea una nueva instancia de CuentaCorriente con el número de cuenta, el
     * titular y el saldo inicial especificados.
     *
     * @param p_nroCuenta Número de cuenta de la cuenta corriente.
     * @param p_titular   Persona titular de la cuenta corriente.
     * @param p_saldo     Saldo inicial de la cuenta corriente.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_saldo, p_titular);
        this.setLimiteDescubierto(500l);
    }


    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    private void setLimiteDescubierto(double p_limiteDescubierto) {
        this.limiteDescubierto = p_limiteDescubierto;
    }

    /**
     * Verifica si es posible realizar una extracción de dinero dada la cantidad
     * especificada.
     *
     * @param p_importe La cantidad de dinero a extraer.
     * @return true si es posible realizar la extracción, false en caso contrario.
     */
    private boolean puedoExtraer(double p_importe) {
        return !(p_importe > (this.getSaldo() + this.getLimiteDescubierto()));
    }



    /**
     * Permite extraer dinero de la cuenta corriente si es posible, y muestra el
     * estado actual de la cuenta.
     *
     * @param p_importe La cantidad de dinero a extraer.
     */
    public void extraer(double p_importe) {
        if (this.puedoExtraer(p_importe)) {
            this.extraccion(p_importe);
            this.mostrar();
        } else {
            System.out.println("El importe de extracción sobrepasa el límite de descubierto!");
        }
    }


    /**
     * Muestra la información actual de la cuenta corriente, incluyendo número de
     * cuenta, saldo, titular y límite de descubierto.
     */
    public void mostrar() {
        System.out.println("- Cuenta Corriente -");
        super.mostrar();
        System.out.println("Descubierto: " + String.format("%.2f", this.getLimiteDescubierto()));
    }

}
