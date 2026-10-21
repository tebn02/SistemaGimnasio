import java.util.ArrayList;

/**
 * Representa una rutina de entrenamiento del gimnasio.
 */
public class Rutina {

    private int idRutina;
    private String nombre;
    private String objetivo;
    private int duracion;
    private ArrayList<Ejercicio> ejercicios;

    public Rutina(int idRutina, String nombre, String objetivo, int duracion) {
        this.idRutina = idRutina;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.duracion = duracion;
        this.ejercicios = new ArrayList<>();
    }

    public int getIdRutina() {
        return idRutina;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getDuracion() {
        return duracion;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(Ejercicio ejercicio) {
        ejercicios.remove(ejercicio);
    }

    public void modificarRutina(String nombre, String objetivo, int duracion) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.duracion = duracion;
    }

    public void consultarRutina() {
        System.out.println("Rutina: " + nombre);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Duracion: " + duracion + " minutos");

        for (Ejercicio ejercicio : ejercicios) {
            System.out.println(ejercicio.consultarEjercicio());
        }
    }
}