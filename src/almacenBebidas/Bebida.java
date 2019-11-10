package almacenBebidas;

public class Bebida {
    private static int idActual=1;
    private int id;
    private double cantidad;
    private double precio;
    private String marca;

    public Bebida(double c, double p, String m) {
        this.id=idActual++;
        this.cantidad=c;
        this.precio=p;
        this.marca=m;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "cantidad=" + cantidad +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
