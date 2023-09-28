import java.util.Calendar;

public class Escuela implements MenuOption{

    public static void main(String[] args) {
        new Escuela().run();
    }


    @Override
    public void run() {
        Persona cami = new Persona(45248173, "Cam", "Gomez", 2003);
        Calendar fechaNacimientoFran = Calendar.getInstance();
        fechaNacimientoFran.set(Calendar.YEAR, 2004);
        Alumno fran = new Alumno(21314, "Franco", "Barrientos", 45645852,fechaNacimientoFran );

        cami.mostrar();
        System.out.println("*".repeat(100));
        fran.mostrar();

    }
}
