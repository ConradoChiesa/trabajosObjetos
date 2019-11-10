package avicola;
import java.util.Date;

public class Fresco extends Producto {

    Date envasado;
    String origen;

    public Fresco(String n, Date vto, int lote, Date envasado, String origen) {
        super(n,vto,lote);
        this.envasado = envasado;
        this.origen = origen;
    }

    public void setEnvasado(Date envasado) {
        this.envasado = envasado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Date getEnvasadoDate() {
        return envasado;
    }

    public String getEtiqueta() {
        return "Nombre: " + this.nombre + "\nFecha de vto: " + this.vto + "\nLote N°: " + this.lote +
                "\nFecha de envase: " + this.envasado + "\nGranja de origen: " + this.origen;
    }
}
