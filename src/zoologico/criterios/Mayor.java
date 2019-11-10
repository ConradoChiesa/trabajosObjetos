package zoologico.criterios;

import zoologico.Jaula;
import zoologico.atributos.Atributo;

public class Mayor extends CriterioSimple {

    public Mayor(String caracteristica, Comparable valor) {
        super(caracteristica, valor);
    }

    @Override
    public boolean cumple(Jaula j) {
        Atributo a = j.getAtributo(this.caracteristica);
        if (a!=null)
            return a.getValor().compareTo(valor) > 0;
        return false;
    }
}
