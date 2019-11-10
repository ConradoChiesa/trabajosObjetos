package zoologico.criterios;

import zoologico.Jaula;

import java.util.ArrayList;
import java.util.List;

public class Compuesto implements Criterio {

    List<Criterio> criterios = new ArrayList<>();

    public void addCriterio(Criterio c) {
        criterios.add(c);
    }


    @Override
    public boolean cumple(Jaula j) {
        for (Criterio c :
                criterios) {
            if (!c.cumple(j))
                return false;
        }
        return true;
    }
}
