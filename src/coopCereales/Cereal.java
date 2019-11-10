package coopCereales;

import java.util.ArrayList;

public class Cereal extends CoopCereales {

    private ArrayList<String> minerales = new ArrayList<String>();

    public Cereal(String min) {
        addMineral(min);
    }

    public boolean haveMineral(String minBusc) {

        for (String min:
             minerales) {
            if (minBusc.equals(min)) return true;
        }
        return false;
    }

    public boolean aceptaLote(Lote l) {
        for (String min : minerales
             ) {
            if (l.aceptarCereal(this)) return true;

        }
       return false;
    }

    @Override
    public void addMineral(String min) {
        minerales.add(min);

    }
}
