import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SocioTest {

    @Test
    public void testAsignarRutina() {

        Socio socio = new Socio(
                1,
                "Juan Perez",
                "987654",
                "3019876543",
                "juan@gmail.com",
                "2002-05-10"
        );

        Rutina rutina = new Rutina(
                1,
                "Rutina de fuerza",
                "Aumentar masa muscular",
                60
        );

        socio.asignarRutina(rutina);

        assertEquals(rutina, socio.getRutina());
    }

    @Test
    public void testAsignarMembresia() {

        Socio socio = new Socio(
                1,
                "Juan Perez",
                "987654",
                "3019876543",
                "juan@gmail.com",
                "2002-05-10"
        );

        Membresia membresia = new Membresia(
                1,
                "Mensual",
                120000,
                "2026-10-01",
                "2026-11-01"
        );

        socio.asignarMembresia(membresia);

        assertEquals(membresia, socio.getMembresia());
    }
}