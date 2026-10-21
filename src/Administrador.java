/**
 * Representa un administrador del gimnasio.
 * Hereda los datos y funciones generales de Empleado.
 */
public class Administrador extends Empleado {

    public Administrador(int idEmpleado, String nombre, String identificacion,
                         String telefono, String correo) {

        super(idEmpleado, nombre, identificacion,
              "Administrador", telefono, correo);
    }

    public void mostrarTipoUsuario() {
        System.out.println("Usuario: Administrador");
    }
}