import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Fundacion {
    private String nombre;

    public Fundacion(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String p_nombre) {
        nombre = p_nombre;
    }

    public void imprimrInvitacion(Evento p_evento, Persona p_persona) {
        SimpleDateFormat formatoFechaInscripcion = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoFechaEvento = new SimpleDateFormat("'el día' d 'de' MMMM 'de' yyyy", new Locale("es",
                "ES"));

        System.out.println("-".repeat(100));
        System.out.println("Estimado/a: " + p_persona.nomYApe());
        System.out.println("Invito a Ud. al proximo evento: " + p_evento.getNombre());
        System.out.println("Las inscripciones se realizan con " + p_evento.getDiasInscripcion() + " días de anticipación ");
        System.out.println("Las mismas se llevarán a cabo el día: " + formatoFechaInscripcion.format(p_evento.fechaInscripcion().getTime()));
        System.out.println("El evento tendrá lugar en: " + p_evento.getLugar() + " " + formatoFechaEvento.format(p_evento.getFecha().getTime()));
        System.out.println("Costo: " + p_evento.costoFinal(p_persona.edad()) + " Lo esperamos ");
        System.out.println("-".repeat(100));
    }

    public void grabarInvitacion(Evento p_evento, Persona p_persona, DataOutputStream unArchivo) throws IOException {
        unArchivo.writeInt(p_persona.getNroDni());
        unArchivo.writeUTF(p_persona.apeYNom());
        unArchivo.writeUTF(p_evento.getNombre());
        unArchivo.writeUTF(p_evento.getLugar());
        unArchivo.writeDouble(p_persona.edad() > 60 ?
                (p_evento.getCosto() * 10) / 100 + p_evento.getCosto() :
                p_evento.getCosto());
        unArchivo.write(p_evento.getFecha().get(Calendar.MONTH));
        unArchivo.write(p_evento.getFecha().get(Calendar.DAY_OF_MONTH));
    }


}
