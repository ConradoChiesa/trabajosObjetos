package coopCereales;

import java.util.ArrayList;

public class Pastura extends Cereal {
    int supMin;
    private ArrayList<String> minerales = new ArrayList<String>();

    public Pastura(String min) {
        super(min);

    }
    public boolean aceptaLote(Lote l) {
        if (supMin > 50) return true;
        else return false;
    }
}
