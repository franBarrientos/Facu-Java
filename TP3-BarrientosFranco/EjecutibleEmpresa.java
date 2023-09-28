public class EjecutibleEmpresa implements MenuOption{

    public static void main(String[] args) {
        new EjecutibleEmpresa().run();
    }

    @Override
    public void run() {
        Persona cami = new Persona(45248173, "Cam", "Gomez", 2003);
        Empleado franEmpleado = new Empleado(4343, "Barrientos", "Franco",
                30303, 2010, 1980,45645852);
        cami.mostrar();
        franEmpleado.mostrar();
    }
}
