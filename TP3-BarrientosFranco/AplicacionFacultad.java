public class AplicacionFacultad implements MenuOption {

    public static void main(String[] args) {
        new AplicacionFacultad().run();
    }

    @Override
    public void run() {
        Cargo cargoSimple = new Cargo("Profesor Java",
                200000, 2019);
        SemiExclusivo cargoSemiExclusivo = new SemiExclusivo("Profesor Java 2",
                200000, 2019,
                3);
        Exclusivo cargoExclusivo = new Exclusivo("Profesor Java 3",
                200000, 2019,
                4, 13, 4);
        Profesor profeDeJava = new Profesor(4353553, "Fran", "Barrientos",
                2003,"Lic. Sistemas" ,cargoSimple );
        Profesor profeDeJava2 = new Profesor(234242, "Fernando", "Gomez",
                2004, "Ing. Sistemas", cargoSemiExclusivo);
        Profesor profeDeJava3 = new Profesor(774636, "nando", "Goaaz",
                2004, "Ing. Sistemas", cargoExclusivo);
        Facultad unne = new Facultad("UNNE", profeDeJava);
        unne.agregarProfesor(profeDeJava2);
        unne.agregarProfesor(profeDeJava3);
        unne.nominaProfesores();
        System.out.println("^*^".repeat(100));
        unne.listarProfesorCargos();
    }
}
