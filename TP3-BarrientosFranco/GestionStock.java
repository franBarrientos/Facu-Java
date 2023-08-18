/**
 * Clase ejecutable que testea a la clase Producto junto a la clase Laboratorio
 */
public class GestionStock {
    /**
     * Test de integracion de la clase Laboratorio y Producto, se instancia
     * laboratorio con valores constantes, y luego se ingrese un producto por
     * teclado
     * 
     * @param args
     */
    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio("Laboratio Franco S.A", "mexico 22", "37945564", 250000);
        Producto producto = new Producto(
                InputHelper.insertIntByKeyboard("Ingrese codigo de producto del nuevo producto"),
                InputHelper.insertStringByKeyboard("Ingrese rubro del producto: "),
                InputHelper.insertStringByKeyboard("Ingrese descripcion del producto: "),
                InputHelper.insertDoubleByKeyboard("Ingrese costo del producto"),
                laboratorio);
        producto.ajuste(500);
        producto.mostrar();
        producto.ajuste(300);
        producto.mostrar();
        System.out.println(producto.mostrarLinea());
    }
}
