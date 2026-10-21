import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RutinaTest {

    @Test
    public void testAgregarEjercicio() {

        Rutina rutina = new Rutina(
                1,
                "Rutina de fuerza",
                "Aumentar masa muscular",
                60
        );

        Ejercicio ejercicio = new Ejercicio(
                1,
                "Press de banca",
                "Ejercicio para pecho",
                4,
                10
        );

        rutina.agregarEjercicio(ejercicio);

        assertEquals(1, rutina.getEjercicios().size());
    }

    @Test
    public void testEliminarEjercicio() {

        Rutina rutina = new Rutina(
                1,
                "Rutina de fuerza",
                "Aumentar masa muscular",
                60
        );

        Ejercicio ejercicio = new Ejercicio(
                1,
                "Press de banca",
                "Ejercicio para pecho",
                4,
                10
        );

        rutina.agregarEjercicio(ejercicio);
        rutina.eliminarEjercicio(ejercicio);

        assertEquals(0, rutina.getEjercicios().size());
    }
}