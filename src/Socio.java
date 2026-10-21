/**
 * Representa un socio registrado en el gimnasio.
 */
public class Socio {

    private int idSocio;
    private String nombre;
    private String identificacion;
    private String telefono;
    private String correo;
    private String fechaNacimiento;

    private Rutina rutina;
    private Membresia membresia;

    public Socio(int idSocio, String nombre, String identificacion,
                 String telefono, String correo, String fechaNacimiento) {

        this.idSocio = idSocio;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void asignarRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public void asignarMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public void actualizarDatos(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public void consultarRutina() {
        if (rutina != null) {
            rutina.consultarRutina();
        } else {
            System.out.println("El socio no tiene una rutina asignada.");
        }
    }

    public void consultarMembresia() {
        if (membresia != null) {
            System.out.println(membresia.consultarEstado());
        } else {
            System.out.println("El socio no tiene una membresia asignada.");
        }
    }
}