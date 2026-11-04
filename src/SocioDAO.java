import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Maneja la persistencia de los socios en la base de datos.
 */
public class SocioDAO {

    public static void guardarSocio(Socio socio) {

        String sql = """
                MERGE INTO socio
                (id, nombre, identificacion, telefono, correo, fechaNacimiento)
                KEY(id)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement statement = conexion.prepareStatement(sql)) {

            statement.setInt(1, socio.getIdSocio());
            statement.setString(2, socio.getNombre());
            statement.setString(3, socio.getIdentificacion());
            statement.setString(4, socio.getTelefono());
            statement.setString(5, socio.getCorreo());
            statement.setString(6, socio.getFechaNacimiento());

            statement.executeUpdate();

            System.out.println("Socio guardado correctamente en la base de datos.");

        } catch (SQLException e) {
            System.out.println("Error al guardar socio: " + e.getMessage());
        }
    }

    public static void consultarSocio(int idSocio) {

        String sql = "SELECT * FROM socio WHERE id = ?";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement statement = conexion.prepareStatement(sql)) {

            statement.setInt(1, idSocio);

            var resultado = statement.executeQuery();

            if (resultado.next()) {
                System.out.println("Socio encontrado en la base de datos:");
                System.out.println("ID: " + resultado.getInt("id"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Identificacion: " + resultado.getString("identificacion"));
                System.out.println("Telefono: " + resultado.getString("telefono"));
                System.out.println("Correo: " + resultado.getString("correo"));
                System.out.println("Fecha de nacimiento: " + resultado.getString("fechaNacimiento"));
            } else {
                System.out.println("No se encontro el socio.");
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar socio: " + e.getMessage());
        }
    }
}