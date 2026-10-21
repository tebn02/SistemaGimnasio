/**
 * Representa un recepcionista del gimnasio.
 * Hereda los datos y funciones generales de Empleado.
 */
public class Recepcionista extends Empleado {

    public Recepcionista(int idEmpleado, String nombre, String identificacion,
                         String telefono, String correo) {

        super(idEmpleado, nombre, identificacion,
              "Recepcionista", telefono, correo);
    }

    public void mostrarTipoUsuario() {
        System.out.println("Usuario: Recepcionista");
    }
}