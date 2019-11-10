package navidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Buzon extends UrnaLugar {
    Set<Carta> cartas;
    List<Ninio> ninios;
    String reemplazoRegalo = "Un trozo de carbón";

    public Buzon() {
        this.cartas = new HashSet<>();
        this.ninios = new ArrayList<>();
    }

    public void addCarta(Carta c) {

        if (ninios.contains(c.getRemitente())) {
            cartas.add(c);
        } else {
            c.cambiarRegalos(reemplazoRegalo);
            cartas.add(c);
        }
    }

    public void addNinio(Ninio n) {
        ninios.add(n);
    }

    @Override
    int getCartasConRegalo(String r) {
        int aux = 0;
        for (Carta c :
                cartas) {
            if (c.getPedidos().contains(r))
                aux++;
        }
        return aux;
    }

    @Override
    int getNiniosMalos() {
        int aux = 0;
        for (Carta c :
                cartas) {
            if (!ninios.contains(c.getRemitente()))
                aux++;
        }
        return aux;
    }

    @Override
    int getTotalCartas() {
        return cartas.size();
    }
}
