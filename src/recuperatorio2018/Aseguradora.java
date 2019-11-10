package recuperatorio2018;

import java.util.ArrayList;
import java.util.List;

public class Aseguradora {
    List<Seguro>seguros;

    public Aseguradora() {
        this.seguros = new ArrayList<>();
    }

    public List<Seguro> getPoliza(String tipo, Comparable valor) {
        List<Seguro> aux = new ArrayList<>();
        for (Seguro s :
                seguros) {
            if (s.get(tipo).equals(valor))
                aux.add(s);
        }
        return aux;
    }



}
