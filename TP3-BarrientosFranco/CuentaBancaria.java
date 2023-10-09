public class CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    public CuentaBancaria(int p_nroCuenta, double p_saldo, Persona p_titular) {
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(p_saldo);
       this.setTitular(p_titular);
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    public void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    /**
     * Realiza un depósito de dinero en la cuenta corriente y actualiza el saldo.
     *
     * @param p_importe La cantidad de dinero a depositar.
     */
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    protected void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
    }

    public void mostrar(){
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + String.format("%.2f", this.getSaldo()));
        System.out.println("Titular: " + this.getTitular().getNombre() + " " + this.getTitular().getApellido());
    }

}
