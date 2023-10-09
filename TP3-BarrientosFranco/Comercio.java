public class Comercio implements MenuOption{
    public static void main(String[] args) {
        new Comercio().run();
    }
    @Override
    public void run() {
        Cocina miCocina = new Cocina("Volcan", 600, 15,
                4, 2000, "80*60*60cm");
        Heladera miHeladera = new Heladera("Gafa", 1200, 8,
                11, 2, true);
        miCocina.imprimir();
        int coutas = 6;
        float interes = 2.53F;
        System.out.println("Cuotas: "+coutas+" - Interes: "+interes +"%");
        System.out.println("Valor Couta: "+String.format("$%.2f", miCocina.cuotaCredito(coutas, interes)));
        System.out.println("Valor Couta: "+String.format("$%.2f", miCocina.creditoConAdicional(coutas, interes)));
        System.out.println(".".repeat(100));
        miHeladera.imprimir();
        System.out.println("Cuotas: "+coutas+" - Interes: "+interes +"%");
        System.out.println("Valor Couta: "+String.format("$%.2f", miHeladera.cuotaCredito(coutas, interes)));
        System.out.println("Valor Couta: "+String.format("$%.2f", miHeladera.creditoConAdicional(coutas, interes)));

    }
}
