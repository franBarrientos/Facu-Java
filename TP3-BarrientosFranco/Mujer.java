public class Mujer {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.casarceCon(p_esposo);
    }

    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Hombre getEsposo() {
        return this.esposo;
    }

    private void setEsposo(Hombre esposo) {
        this.esposo = esposo;
    }

    public void casarceCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
        p_hombre.casarceCon(this);
    }

    public void divorcio() {
        if(this.getEsposo() != null){
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }
    }

    public String datos(){
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }

    public void mostrarEstadoCivil(){
        System.out.println(this.datos()+" - "+this.getEstadoCivil());
    }

    public void casadoCon(){
        System.out.println(this.datos()
        +" esta casada con "
        +this.getEsposo().datos());
    }

}
