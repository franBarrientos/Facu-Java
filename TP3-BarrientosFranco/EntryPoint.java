import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EntryPoint {

    public static void main(String[] args)   {
        Menu miMenu = new Menu();
        miMenu.addOption(EjecutableEmpleado.class);
        miMenu.addOption(DatosVip.class);
        miMenu.addOption(EjecutableLaboratorio.class);
        miMenu.addOption(Administracion.class);
        miMenu.start();


    }


























}
