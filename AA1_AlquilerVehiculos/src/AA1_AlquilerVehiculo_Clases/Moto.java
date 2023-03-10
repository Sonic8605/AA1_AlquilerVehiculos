package AA1_AlquilerVehiculo_Clases;

public class Moto extends Vehiculo {

    public int cilindrada;

    public Moto(String marca, String modelo, int año, int precio, String color, int cilindrada) {
        super(marca, modelo, año, precio, color);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", año=" + super.getAño() +
                ", precio=" + super.getPrecio() +
                ", color='" + super.getColor() + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
