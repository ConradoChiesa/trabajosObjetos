package navidad;

import java.util.ArrayList;
import java.util.List;

public class Region extends UrnaLugar {
    private List<UrnaLugar> lugares;

    public Region() {
        this.lugares = new ArrayList<>();
    }

    public void addLugares(UrnaLugar ul) {
        lugares.add(ul);
    }

    @Override
    int getCartasConRegalo(String r) {
        int aux = 0;
        for (UrnaLugar ul :
                lugares) {
            aux += ul.getCartasConRegalo(r);
        }
        return aux;
    }

    @Override
    int getNiniosMalos() {
        int aux = 0;
        for (UrnaLugar ul :
                lugares) {
            aux = ul.getNiniosMalos();

        }
        return aux;
    }

    @Override
    int getTotalCartas() {
        int aux = 0;
        for (UrnaLugar ul :
                lugares) {
            aux += ul.getTotalCartas();

        }
        return aux;
    }
}
