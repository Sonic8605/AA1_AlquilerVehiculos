package AA1_AlquilerVehiculo_Clases;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int precio;
    public String color;

    public Vehiculo(String marca, String modelo, int ano, int precio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
        this.color = color;
    }

    public Vehiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + ano + "\n" +
                "Precio: " + precio + "€" + "\n" +
                "Color: " + color;
    }
}
