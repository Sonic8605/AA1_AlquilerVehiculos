package AA1_AlquilerVehiculo_Clases;

public class Coche extends Vehiculo {
    public double cilindrada;

    public Coche(String marca, String modelo, int año, int precio, String color, double cilindrada) {
        super(marca, modelo, año, precio, color);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "cilindrada=" + cilindrada +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + ano +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
