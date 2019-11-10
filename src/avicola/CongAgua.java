package avicola;

import java.util.Date;

public class CongAgua extends Congelado {
    private int sodio;

    public CongAgua(String nom, Date vto, int lote, String t, int cod, int tempRec, Date envasado, String ori,
                    int sodio) {

        super(nom, vto, lote, t, cod, tempRec, envasado, ori);
        this.sodio = sodio;

    }

    public String getEtiqueta() {
        return super.getEtiqueta() + "\nValor de sodio: %" + sodio + "/L";
    }
}