import java.io.IOException;
import java.util.Calendar;

public class Administracion implements MenuOption {


    @Override
    public void run(){
        Evento eventoCongreso = new Evento("Congreso de Cardiopatías Congénitas", "Facultad Medicina UBA",
                Calendar.getInstance(), 10, 297);

        Persona personaJose = new Persona(4564852, "Jose","Martinez", 1900);
        Persona personaJoseYung = new Persona(4564852, "Jose","Martinez", 2000);

        Fundacion fundacion = new Fundacion("Educar para Crecer ");

        fundacion.imprimrInvitacion(eventoCongreso,personaJose);
        fundacion.imprimrInvitacion(eventoCongreso,personaJoseYung);

    }

    public static void main(String[] args) {
        new Administracion().run();
    }
}
