public class Main {

    public static void main(String[] args) {

        Ejercicio ejercicio1 = new Ejercicio(
                1,
                "Press de banca",
                "Ejercicio para pecho",
                4,
                10
        );

        Ejercicio ejercicio2 = new Ejercicio(
                2,
                "Sentadilla",
                "Ejercicio para piernas",
                4,
                12
        );

        Entrenador entrenador = new Entrenador(
                1,
                "Carlos Gomez",
                "123456",
                "Musculacion",
                "3001234567",
                "carlos@gym.com"
        );

        Rutina rutina = entrenador.crearRutina(
                1,
                "Rutina de fuerza",
                "Aumentar masa muscular",
                60
        );

        rutina.agregarEjercicio(ejercicio1);
        rutina.agregarEjercicio(ejercicio2);

        Socio socio = new Socio(
                1,
                "Juan Perez",
                "987654",
                "3019876543",
                "juan@gmail.com",
                "2002-05-10"
        );

        entrenador.asignarRutina(socio, rutina);

        Membresia membresia = new Membresia(
                1,
                "Mensual",
                120000,
                "2026-10-01",
                "2026-11-01"
        );

        socio.asignarMembresia(membresia);

        System.out.println("===== SISTEMA DE GIMNASIO =====");

        System.out.println("\nSocio:");
        System.out.println(socio.getNombre());

        System.out.println("\nRutina asignada:");
        socio.consultarRutina();

        System.out.println("\nMembresia:");
        socio.consultarMembresia();

        System.out.println("\nEntrenador:");
        entrenador.consultarSocio(socio);
    }
}