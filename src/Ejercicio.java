/**
 * Representa un ejercicio que puede formar parte de una rutina del gimnasio.
 */
public class Ejercicio {

    private int idEjercicio;
    private String nombre;
    private String descripcion;
    private int series;
    private int repeticiones;

    public Ejercicio(int idEjercicio, String nombre, String descripcion, int series, int repeticiones) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void modificarEjercicio(String nombre, String descripcion, int series, int repeticiones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public String consultarEjercicio() {
        return nombre + " - " + series + " series de " + repeticiones + " repeticiones";
    }
}