package zoologico.criterios;

import zoologico.atributos.Atributo;
import zoologico.Jaula;

public class Igual extends CriterioSimple {

    public Igual(String caracteristica, Comparable valor) {
        super(caracteristica, valor);
    }

    @Override
    public boolean cumple(Jaula j) {
        Atributo a = j.getAtributo(caracteristica);
        if (a!=null)
            return a.getValor().equals(valor);
        return false;
    }
}
