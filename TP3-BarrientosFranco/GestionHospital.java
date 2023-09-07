/**
 * Clase GestionHospital que representa a una clase que testea las clases Localidad, Paciente y
 * Hospital
 *
 * @author Barrientos Franco
 * @version 1.0
 */
public class GestionHospital implements MenuOption{

    /**
     * Instancia un hospital, un paciente, con sus correspondientes
     * localidades, y muestra por pantalla los datos filiatorios, utilizando sus métodos.
     */
    public  void run() {

        Localidad corrientes = new Localidad("Corrientes Capital", "Corrientes");

        Localidad tigres = new Localidad("Tigres", "Buenos Aires");

        Paciente fran = new Paciente(4234, "Franco Barrientos", "jamaica 4207", corrientes, tigres);

        Hospital hospital = new Hospital("Juan Pablo II", "Romani Lucas");

        hospital.consultaDatosFiliatorios(fran);
    }
}
