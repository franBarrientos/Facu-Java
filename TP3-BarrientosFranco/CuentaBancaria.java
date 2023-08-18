/**
 * Clase que modela a una cuenta bancaria y a sus operaciones depositar y
 * extraer
 */
public class CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    public CuentaBancaria(int nroCuenta, double saldo, Persona titular) {
        setNroCuenta(nroCuenta);
        setSaldo(saldo);
        setTitular(titular);
    }

    public CuentaBancaria(int nroCuenta, Persona titular) {
        setNroCuenta(nroCuenta);
        setTitular(titular);
    }

    private int getNroCuenta() {
        return this.nroCuenta;
    }

    private void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * Incrementa el balance actual de la cuenta con el importe pasado como
     * parametro
     * 
     * @param importe importe a incrementar
     * @return importe actualizado
     */
    public double depositar(double importe) {
        setSaldo(getSaldo() + importe);
        return getSaldo();
    }

    /**
     * Decrementa el balance actual de la cuenta con el importe pasado como
     * parametro
     * 
     * @param importe importe a decrementar
     * @return importe actualizado
     */
    public double extraer(double importe) {
        setSaldo(getSaldo() - importe);
        return getSaldo();
    }

    /**
     * Muestra en consola los datos de la cuenta con el siguiente formato:
     * - Cuenta Bancaria -
     * Titular: Juan Perez (34 años)
     * Saldo: 155.25
     */
    public void mostrar() {
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: "+titular.getNombre()+ " "+ titular.getApellido()+" ("+titular.edad() + " años)");
        System.out.println("Saldo: "+ String.format("%.2f",getSaldo()));
    }


    /**
     * Retorna un string de la concatenacion de numero de cuenta, titular y saldo, de la siguiente manera :
     * 1249 Juan Perez 1500.0
      */
    @Override
    public String toString() {
        return getNroCuenta()+" "+titular.getNombre()+" "+titular.getApellido()+"       "+String.format("%.2f",getSaldo());
    }


}
