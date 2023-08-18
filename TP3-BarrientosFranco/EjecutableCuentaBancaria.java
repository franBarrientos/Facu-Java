public class EjecutableCuentaBancaria {
    public static void main(String[] args) {
        Persona francoB = new Persona(4564585, "fran", "barrientos", 2004);
        CuentaBancaria cuentaFranco = new CuentaBancaria(4565, 456616, francoB);
        System.out.println(
                cuentaFranco.toString());
                cuentaFranco.mostrar();

        
    }
}
