public class EjecutableElipse implements MenuOption {

    public static void main(String[] args) {
        new EjecutableElipse().run();
    }

    @Override
    public void run() {
        Elipse miElipse = new Elipse(23, 33, new Punto());
        Circulo miCirculo = new Circulo(20, new Punto());
        miElipse.caracteristicas();
        miCirculo.caracteristicas();
        System.out.println("Distancia :"+
        miElipse.distanciaA(miCirculo));

/*
        Integer i = new String("da");
*/
    }
}
