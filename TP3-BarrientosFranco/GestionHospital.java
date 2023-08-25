public class GestionHospital {
    public static void main(String[] args) {
        
        Localidad corrientes = new Localidad("Corrientes Capital", "Corrientes");
        
        Localidad tigres = new Localidad("Tigres", "Buenos Aires");
        
        Paciente fran = new Paciente(4234, "Franco Barrientos", "jamaica 4207", corrientes, tigres);

        Hospital hospital = new Hospital("Juan Pablo II", "Romani Lucas");

        hospital.consultaDatosFiliatorios(fran);
    }
}
