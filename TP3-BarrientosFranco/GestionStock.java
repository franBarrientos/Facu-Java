/**
 * Clase ejecutable que testea a la clase Producto junto a la clase Laboratorio
 * @author Barrientos Franco
 * @version 1.0
 */
public class GestionStock implements MenuOption{
    /**
     * Test de integracion de la clase Laboratorio y Producto, se instancia
     * laboratorio con valores constantes, y luego se ingrese un producto por
     * teclado
     * 
     * @param args
     */
    public void run() {
        Laboratorio laboratorio = new Laboratorio("Laboratio Franco S.A", "mexico 22", "37945564", 250000);
        Producto producto = new Producto(
                InputHelper.insertIntByKeyboard("Ingrese codigo de producto del nuevo producto"),
                InputHelper.insertStringByKeyboard("Ingrese rubro del producto: "),
                InputHelper.insertStringByKeyboard("Ingrese descripcion del producto: "),
                InputHelper.insertDoubleByKeyboard("Ingrese costo del producto"),
                laboratorio);

        System.out.println(".".repeat(80));
        System.out.println("Producto con stock de 500");
        System.out.println(".".repeat(80));
        producto.ajuste(500);
        producto.mostrar();

        System.out.println(".".repeat(80));
        System.out.println("Producto con una baja de 200");
        System.out.println(".".repeat(80));

        producto.ajuste(-200);
        producto.mostrar();

        System.out.println(".".repeat(80));
        System.out.println("Metodo to String");
        System.out.println(".".repeat(80));
        System.out.println(producto.mostrarLinea());
    }
}
