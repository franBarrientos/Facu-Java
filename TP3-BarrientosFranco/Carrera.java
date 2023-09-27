import java.util.HashMap;

/**
 * Clase ejecutable Carrera que permite realizar operaciones relacionadas con un curso y sus alumnos.
 * Esta clase implementa la interfaz MenuOption y se utiliza para interactuar con el usuario a través de la consola.
 * Puede crear un curso con valores predeterminados o permitir al usuario ingresar valores por teclado.
 * Luego, permite inscribir y dar de baja alumnos, ingresar sus notas y mostrar información relacionada con el curso y los alumnos.
 * La información se ingresa a través de la entrada estándar.
 * @author Barrientos Franco
 * @version 1.0
 */
public class Carrera implements MenuOption {

    /**
     * Método principal que crea una instancia de Carrera y llama al método run() para iniciar la interacción.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        new Carrera().run();
    }

    /**
     * Implementación del método run() de la interfaz MenuOption.
     * Permite interactuar con el usuario a través de la consola para crear un curso, inscribir y dar de baja alumnos,
     * ingresar sus notas y mostrar información relacionada con el curso y los alumnos.
     */
    @Override
    public void run() {
        boolean wantDefaultCurso = InputHelper
                .askForYesOrNot("Desea crear un curso son los siguientes valores.... \n" +
                        "Nombre: Javascript || \n" +
                        "Primer Alumno : { \n" +
                        "Lu: 4353\n" +
                        "Nombre: Franco \n" +
                        "Apellido: Barrientos \n" +
                        "} \n" +
                        "Segundo Alumno : {\n" +
                        "Lu: 5325 \n" +
                        "Nombre: Alexis \n" +
                        "Apellido: Sosa \n" +
                        "} \n" +
                        "Ingrese S para confirmar o N para ingresar los valores por teclado.. ");


        Curso miCurso = wantDefaultCurso ?
                new Curso("Javascript ||", new HashMap<>() {{
                    put(4353, new Alumno(4353, "Franco", "Barrientos"));
                    put(5325, new Alumno(5325, "Alexis", "Sosa"));
                }})
        :
                new Curso(InputHelper.scanStringByKeyboardAndPrint("Ingrese nombre del curso: "),
                new HashMap<>() {
                    {
                        put(InputHelper.scanIntByKeyboardAndPrint("Ingrese Lu del primer alumno: "),
                                new Alumno(InputHelper.scanIntByKeyboardAndPrint(" Ingrese Lu para confirmar"),
                                        InputHelper.scanStringByKeyboardAndPrint("Ingrese nombre: "),
                                        InputHelper.scanStringByKeyboardAndPrint("Ingrese Apellido")));
                        put(InputHelper.scanIntByKeyboardAndPrint("Ingrese Lu del segundo alumno: "),
                                new Alumno(InputHelper.scanIntByKeyboardAndPrint(" Ingrese Lu para confirmar"),
                                        InputHelper.scanStringByKeyboardAndPrint("Ingrese nombre: "),
                                        InputHelper.scanStringByKeyboardAndPrint("Ingrese Apellido")));
                    }});


        boolean wandAddOneMore = InputHelper.askForYesOrNot("Ingrese S si desea inscribir otro alumno o N si no");

        if (wandAddOneMore){
            miCurso.inscribirAlumno(
                    InputHelper.askForYesOrNot("Desea un alumno por defecto con los siguientes valores?.... \n" +
                    "Lu: 1213\n" +
                    "Nombre: Fabian \n" +
                    "Apellido: Sanchez \n" +
                    "Ingrese S para confirmar o N para ingrese los valores del alumno por teclado")?
                            new Alumno(1213, "Fabian", "Sanchez")
                            :
                            new Alumno(InputHelper.scanIntByKeyboardAndPrint(" Ingrese Lu para confirmar"),
                                    InputHelper.scanStringByKeyboardAndPrint("Ingrese nombre: "),
                                    InputHelper.scanStringByKeyboardAndPrint("Ingrese Apellido")));
        }

        miCurso.getAlumnos()
                .forEach((k,v)->{
                    System.out.println("Ingrese la notas del alumno "+v.apeYNom());
                    v.setNota1(InputHelper.scanDoubleByKeyboardAndPrint("Ingrese 1ra nota.. "));
                    v.setNota2(InputHelper.scanDoubleByKeyboardAndPrint("Ingrese 2da nota.. "));
                });
        System.out.println("**** Cantidad de inscriptos: "+miCurso.cantidadAlumnos());
        miCurso.mostrarInscriptos();
        Alumno alumnoRemoved = miCurso.quitarAlumno(
                InputHelper.scanIntByKeyboardAndPrint("Ingrese Lu de un alumno, para dar de baja.."));
        System.out.println("**** Se da de baja a "+ alumnoRemoved.apeYNom()+" porque abandona el curso --**** ");
        System.out.println("Esta "+alumnoRemoved.apeYNom()+" inscripto??-->"+ miCurso.estaInscripto(alumnoRemoved.getLu()));
        miCurso.mostrarInscriptos();
        System.out.println("**** Busca y muestra el alumno con numero de libreta ingresado por teclado ****");
        miCurso.buscarAlumno(InputHelper.scanIntByKeyboardAndPrint("Ingrese Lu.. ")).mostrar();
        System.out.println("**** Muestra el promedio del alumno con numero de libreta ingresado por teclado ****");
        miCurso.imprimirPromedioDelAlumno(InputHelper.scanIntByKeyboardAndPrint("Ingrese Lu.. "));

    }


}
