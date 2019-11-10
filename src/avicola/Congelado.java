package avicola;
import java.util.Date;

public class Congelado extends Producto {

    private String tipo;
    private int codigo, tempRec;
    private Date envasado;
    private String origen;

    public Congelado(String nom, Date vto, int lote, String t, int cod, int tempRec, Date envasado, String ori) {
        super(nom, vto, lote);
        this.tipo = t;
        this.codigo = cod;
        this.tempRec = tempRec;
        this.envasado = envasado;
        this.origen = ori;
    }

    public String getEtiqueta() {
        return  "Nombre: " + this.nombre + "\nFecha de vto: " + this.vto + "\nLote N°: " + this.lote +
                "\nTipo: " + this.tipo + "\nCodigo: " + this.codigo + "\nTemperatura de mantenimiento: " + this.tempRec +
                "\nFecha de envase: " + this.envasado + "\nGranja de origen: " + this.origen;
    }
}
