package coopCereales;

import java.util.ArrayList;

public class Lote extends CoopCereales {
    private ArrayList<String> minerales = new ArrayList<String>();

    @Override
    public void addMineral(String min) {
        minerales.add(min);
    }

    public boolean aceptarCereal(Cereal c) {
        for (String min:
             minerales) {
            if (minerales.equals(c.haveMineral(min))) return true; //acá lo que tengo que hacer es preguntarle: tenes este mineral, no se si esta bien asípero vacon equals

        }
        return false;
    }
}
