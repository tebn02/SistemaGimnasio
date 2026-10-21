/**
 * Representa un entrenador del gimnasio.
 */
public class Entrenador {

    private int idEntrenador;
    private String nombre;
    private String identificacion;
    private String especialidad;
    private String telefono;
    private String correo;

    public Entrenador(int idEntrenador, String nombre, String identificacion,
                      String especialidad, String telefono, String correo) {

        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Rutina crearRutina(int idRutina, String nombre, String objetivo, int duracion) {
        return new Rutina(idRutina, nombre, objetivo, duracion);
    }

    public void asignarRutina(Socio socio, Rutina rutina) {
        socio.asignarRutina(rutina);
    }

    public void modificarRutina(Rutina rutina, String nombre, String objetivo, int duracion) {
        rutina.modificarRutina(nombre, objetivo, duracion);
    }

    public void consultarSocio(Socio socio) {
        System.out.println("Socio: " + socio.getNombre());
        socio.consultarRutina();
    }
}