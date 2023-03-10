package AA1_AlquilerVehiculo_Clases;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String ciudad;
    private String pais;

    public Cliente(String nombre, String apellidos, String dni, String direccion, String ciudad, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
