/**
 * Representa un empleado del gimnasio.
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String identificacion;
    private String cargo;
    private String telefono;
    private String correo;

    public Empleado(int idEmpleado, String nombre, String identificacion,
                    String cargo, String telefono, String correo) {

        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCargo() {
        return cargo;
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

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void registrarSocio(Socio socio) {
        System.out.println("Socio registrado: " + socio.getNombre());
    }

    public void consultarSocio(Socio socio) {
        System.out.println("Socio: " + socio.getNombre());
        System.out.println("Identificacion: " + socio.getIdentificacion());
    }

    public void actualizarSocio(Socio socio, String telefono, String correo) {
        socio.actualizarDatos(telefono, correo);
    }

    public void gestionarMembresia(Socio socio, Membresia membresia) {
        socio.asignarMembresia(membresia);
    }
}