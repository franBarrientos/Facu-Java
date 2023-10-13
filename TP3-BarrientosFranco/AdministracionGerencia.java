public class AdministracionGerencia implements MenuOption {

    public static void main(String[] args) {
        new AdministracionGerencia().run();
    }
    @Override
    public void run() {
        Gerencia miGerencia = new Gerencia("Barrientos");
        Hotel miHotel = new Hotel("Hotel Franco", 200, 7, "Single");
        Servicio miInternet = new Servicio("Internet", 20);
        Servicio miLavanderia = new Servicio("Lavanderia", 20);
        Servicio miAlquilerAuto = new Servicio("Alquiler de Auto", 20);
        miHotel.agregarServicio(miInternet);
        miHotel.agregarServicio(miLavanderia);
        Cabaña miCabaña = new Cabaña("Cabaña Franco", 300, 5, 2);
        miCabaña.agregarServicio(miLavanderia);
        miCabaña.agregarServicio(miAlquilerAuto);

        miGerencia.agregarAlojamiento(miHotel);
        miGerencia.agregarAlojamiento(miCabaña);
        miGerencia.mostrarLiquidacion();
    }
}
