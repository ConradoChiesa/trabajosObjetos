package zoo.criterios;

import zoo.Jaula;
import zoo.atributos.Atributo;

public class Igual extends CriterioSimple {

    public Igual(String caracteristica, Comparable valor){
        super(caracteristica, valor);
    }
    @Override
    public boolean cumple(Jaula j) {
        Atributo a = j.getAtributo(this.caracteristica);
        if (a!= null)
            return a.getValor().equals(valor);
        return false;
    }
}
