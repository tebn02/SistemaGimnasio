import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MembresiaTest {

    @Test
    public void testCancelarMembresia() {

        Membresia membresia = new Membresia(
                1,
                "Mensual",
                120000,
                "2026-10-01",
                "2026-11-01"
        );

        membresia.cancelarMembresia();

        assertEquals("Cancelada", membresia.getEstado());
    }

    @Test
    public void testRenovarMembresia() {

        Membresia membresia = new Membresia(
                1,
                "Mensual",
                120000,
                "2026-10-01",
                "2026-11-01"
        );

        membresia.renovarMembresia("2026-12-01");

        assertEquals("2026-12-01", membresia.getFechaFin());
        assertEquals("Activa", membresia.getEstado());
    }
}