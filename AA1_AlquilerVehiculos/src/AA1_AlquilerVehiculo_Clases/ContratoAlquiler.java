package AA1_AlquilerVehiculo_Clases;

public class ContratoAlquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fechaInicio;
    private String fechaFin;

    public ContratoAlquiler(Cliente cliente, Vehiculo vehiculo, String fechaInicio, String fechaFin) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }
}

