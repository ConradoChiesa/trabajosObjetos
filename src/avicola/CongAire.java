package avicola;

import java.util.Date;

public class CongAire extends Congelado {
    private float nitro, oxigen, co2, vda;

    public CongAire(String nom, Date vto, int lote, String t, int cod, int tempRec, Date envasado, String ori, float nitro, float oxigen, float co2, float vda) {

        super(nom, vto, lote, t, cod, tempRec, envasado, ori);
        this.nitro = nitro;
        this.oxigen = oxigen;
        this.co2 = co2;
        this.vda = vda;
    }

    public String getEtiqueta() {
        return  super.getEtiqueta() + "\n(Nitrógeno: %" + this.nitro
                + "\n(Nitrógeno: %" + this.nitro + "\n(oxígeno: %" + this.oxigen + "\n(Dioxiodo de Carbono: %" + this.co2
                + "\n(Vapor de Agua: %" + this.vda;
    }
}
