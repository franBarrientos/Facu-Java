public class Hombre {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.casarceCon(p_esposa);
    }

    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
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

    public Mujer getEsposa() {
        return this.esposa;
    }

    private void setEsposa(Mujer esposa) {
        this.esposa = esposa;
    }

    public void casarceCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }

    public void divorcio() {
        if(this.getEsposa() != null){
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
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
        +" esta casado con "
        +this.getEsposa().datos());
    }

}