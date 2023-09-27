/**
 *Punto de entrada del tp 4
 * @author Barrientos Franco
 * @version 1.0
 */
public class EntryPoint {

    /**
     * Se instancia un menu, y se añaden las Opciones del menu
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     * */
    public static void main(String[] args)   {
        Menu miMenu = new Menu();
        miMenu.addOption(ArrayDePuntos.class);
        miMenu.addOption(TomaPedido.class);
        miMenu.addOption(AplicacionBanco.class);
        miMenu.addOption(Carrera.class);
        miMenu.addOption(GestionComercio.class);
        miMenu.start();

    }


























}
