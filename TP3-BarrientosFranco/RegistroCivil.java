public class RegistroCivil {
    public static void main(String[] args) {
        Hombre miHombre = new Hombre("FRANCO", "BARRIENTOS", 19);
        Mujer miMujer = new Mujer("CAMILA", "GOMEZ", 20);
        miHombre.casarseCon(miMujer);
        miMujer.casarseCon(miHombre);
        miHombre.mostrarEstadoCivil();
        miMujer.mostrarEstadoCivil();
    }
}
