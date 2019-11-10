package parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Region extends Territorio {
    List<Territorio> lugares;

    public Region(String nombre) {
        super(nombre);
        this.lugares = new ArrayList<>();
    }

    @Override
    int getCantHab() {
        int conteo = 0;
        for (Territorio t :
                lugares) {
            conteo += t.getCantHab();
        }
        return conteo;
    }

    @Override
    int getSup() {
        int conteo = 0;
        for (Territorio t :
                lugares) {
            conteo += t.getSup();
        }
        return conteo;
    }

    @Override
    int getIng() {
        int conteo = 0;
        for (Territorio t :
                lugares) {
            conteo += t.getIng();
        }
        return conteo;
    }

    @Override
    public List<Comarca> getComarcasCondicion(Condicion c) {
        List<Comarca> comarcaCumple = new ArrayList<>();
        for (Territorio t :
                lugares) {
           comarcaCumple.addAll(t.getComarcasCondicion(c));
//            if (c.cumple(t))
//                comarcaCumple.add((Comarca)t);
        }
        Collections.sort(comarcaCumple, new OrdenarComarcaPorHab());
        Collections.reverse(comarcaCumple);
        return comarcaCumple;
    }


    public void addTerritorio(Territorio t) {
        lugares.add(t);
    }
}
