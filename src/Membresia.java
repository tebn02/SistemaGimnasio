/**
 * Representa la membresia de un socio del gimnasio.
 */
public class Membresia {

    private int idMembresia;
    private String tipo;
    private double precio;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    public Membresia(int idMembresia, String tipo, double precio, String fechaInicio, String fechaFin) {
        this.idMembresia = idMembresia;
        this.tipo = tipo;
        this.precio = precio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = "Activa";
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void activarMembresia() {
        estado = "Activa";
    }

    public void cancelarMembresia() {
        estado = "Cancelada";
    }

    public void renovarMembresia(String nuevaFechaFin) {
        fechaFin = nuevaFechaFin;
        estado = "Activa";
    }

    public String consultarEstado() {
        return "Membresia " + tipo + " - Estado: " + estado + " - Vence: " + fechaFin;
    }
}