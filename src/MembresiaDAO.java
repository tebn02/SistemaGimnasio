import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Maneja la persistencia de las membresias en la base de datos.
 */
public class MembresiaDAO {

    public static void guardarMembresia(Membresia membresia, Socio socio) {

        String sql = """
                MERGE INTO membresia
                (id, tipo, precio, fechaInicio, fechaFin, estado, socioId)
                KEY(id)
                VALUES (?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement statement = conexion.prepareStatement(sql)) {

            statement.setInt(1, membresia.getIdMembresia());
            statement.setString(2, membresia.getTipo());
            statement.setDouble(3, membresia.getPrecio());
            statement.setString(4, membresia.getFechaInicio());
            statement.setString(5, membresia.getFechaFin());
            statement.setString(6, membresia.getEstado());
            statement.setInt(7, socio.getIdSocio());

            statement.executeUpdate();

            System.out.println("Membresia guardada correctamente en la base de datos.");

        } catch (SQLException e) {
            System.out.println("Error al guardar membresia: " + e.getMessage());
        }
    }
}
