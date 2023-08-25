public class Localidad {
    private String nombre;
    private String provincia;

    public Localidad(String p_nombre, String p_provincia) {
        setNombre(p_nombre);
        setProvincia(p_provincia);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return this.provincia;
    }

    private void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void mostrar(){
        System.out.println("Localidad: "+this.getNombre()+"      Provincia: "+this.getProvincia());
    }

}
