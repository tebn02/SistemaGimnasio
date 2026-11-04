import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Maneja la conexión y creación de tablas de la base de datos H2.
 */
public class ConexionBD {

    private static final String URL = "jdbc:h2:./data/gimnasio";
    private static final String USUARIO = "sa";
    private static final String CLAVE = "";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException e) {
            System.out.println("Error al conectar con H2: " + e.getMessage());
            return null;
        }
    }

    public static void crearTablas() {

        String tablaSocio = """
                CREATE TABLE IF NOT EXISTS socio (
                    id INT PRIMARY KEY,
                    nombre VARCHAR(100),
                    identificacion VARCHAR(50),
                    telefono VARCHAR(50),
                    correo VARCHAR(100),
                    fechaNacimiento VARCHAR(20)
                )
                """;

        String tablaMembresia = """
                CREATE TABLE IF NOT EXISTS membresia (
                    id INT PRIMARY KEY,
                    tipo VARCHAR(50),
                    precio DOUBLE,
                    fechaInicio VARCHAR(20),
                    fechaFin VARCHAR(20),
                    estado VARCHAR(30),
                    socioId INT,
                    FOREIGN KEY (socioId) REFERENCES socio(id)
                )
                """;

        try (Connection conexion = conectar();
             Statement statement = conexion.createStatement()) {

            statement.execute(tablaSocio);
            statement.execute(tablaMembresia);

            System.out.println("Tablas creadas correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al crear tablas: " + e.getMessage());
        }
    }
}