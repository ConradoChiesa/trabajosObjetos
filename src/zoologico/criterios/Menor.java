package zoologico.criterios;

import zoologico.atributos.Atributo;
import zoologico.Jaula;

public class Menor extends CriterioSimple {

    public Menor(String caracteristica, Comparable valor) {
        super(caracteristica, valor);
    }

    @Override
    public boolean cumple(Jaula j) {
        Atributo a = j.getAtributo(caracteristica);
        if (a!=null)
            return a.getValor().compareTo(valor) > 0;
        return false;
    }
}
