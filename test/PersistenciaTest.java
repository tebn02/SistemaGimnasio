import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersistenciaTest {

    @Test
    public void testGuardarSocioEnBaseDeDatos() throws Exception {

        ConexionBD.crearTablas();

        Socio socio = new Socio(
                99,
                "Socio Prueba",
                "999999",
                "3000000000",
                "prueba@gmail.com",
                "2000-01-01"
        );

        SocioDAO.guardarSocio(socio);

        String sql = "SELECT nombre FROM socio WHERE id = ?";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement statement = conexion.prepareStatement(sql)) {

            statement.setInt(1, 99);

            ResultSet resultado = statement.executeQuery();

            assertTrue(resultado.next());
            assertEquals("Socio Prueba", resultado.getString("nombre"));
        }
    }
}