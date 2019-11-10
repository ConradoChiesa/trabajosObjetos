package parcial;

import java.util.Comparator;

public class OrdenarComarcaPorHab implements Comparator <Comarca> {
    @Override
    public int compare(Comarca c1, Comarca c2) {

        return c1.getCantHab() - c2.getCantHab();
    }
}
