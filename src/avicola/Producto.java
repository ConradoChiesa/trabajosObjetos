package avicola;
import java.util.Date;

public class Producto {

    String nombre;
    Date vto;
    int lote;

    public Producto(String n, Date vto, int lote) {
        this.nombre = n;
        this.vto = vto;
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getVto() {
        return vto;
    }

    public int getLote() {
        return lote;
    }
}
