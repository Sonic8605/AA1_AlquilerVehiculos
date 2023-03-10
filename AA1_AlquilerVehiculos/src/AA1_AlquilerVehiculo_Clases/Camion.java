package AA1_AlquilerVehiculo_Clases;

public class Camion extends Vehiculo {

    public double pesoMaximo;
    public double volumenCarga;

    public Camion(String marca, String modelo, int año, int precio, String color, double pesoMaximo, double volumenCarga) {
        super();
        this.pesoMaximo = pesoMaximo;
        this.volumenCarga = volumenCarga;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(double volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", año=" + super.getAño() +
                ", precio=" + super.getPrecio() +
                ", color='" + super.getColor() + '\'' +
                ", pesoMaximo=" + pesoMaximo +
                ", volumenCarga=" + volumenCarga +
                '}';
    }
}
