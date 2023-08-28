public class RegistroCivil {
    public static void main(String[] args) {
        Hombre miHombre = new Hombre("FRANCO", "BARRIENTOS", 19);
        Mujer miMujer = new Mujer("CAMILA", "GOMEZ", 20);
        miHombre.casarceCon(miMujer);
        miMujer.casarceCon(miHombre);
        miHombre.mostrarEstadoCivil();
        miMujer.mostrarEstadoCivil();
    }
}
