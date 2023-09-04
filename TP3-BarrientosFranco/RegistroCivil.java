/**
 * Clase ejecutable que testea a la clase Hombre junto a la clase Mujer
 * @author Barrientos Franco
 * @version 1.0
 */
public class RegistroCivil {

    /**
     *  Emite el certificado de matrimonio, de un objeto Mujer y Hombre
     * */
    public static void main(String[] args) {
        Hombre miHombre = new Hombre("FRANCO", "BARRIENTOS", 19);
        Mujer miMujer = new Mujer("CAMILA", "GOMEZ", 20);
        miHombre.casarseCon(miMujer);
        miMujer.casarseCon(miHombre);
        System.out.println(".".repeat(80));
        System.out.println("FRANCO SE CASA CON CAMILA");
        System.out.println(".".repeat(80));
        miHombre.mostrarEstadoCivil();
        miMujer.mostrarEstadoCivil();
        System.out.println(".".repeat(80));
        System.out.println("FRANCO SE DIVORCIA");
        System.out.println(".".repeat(80));
        miHombre.divorcio();
        miMujer.divorcio();
        miHombre.mostrarEstadoCivil();
        miMujer.mostrarEstadoCivil();
        System.out.println(".".repeat(80));
        System.out.println("FRANCO SE CASA DE VUELTA");
        System.out.println(".".repeat(80));
        miHombre.casarseCon(miMujer);
        miMujer.casarseCon(miHombre);
        miHombre.mostrarEstadoCivil();
        miMujer.mostrarEstadoCivil();
    }
}
