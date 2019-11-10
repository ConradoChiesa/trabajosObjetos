package zoologico.criterios;

import zoologico.Jaula;

public abstract class CriterioSimple implements Criterio {
    String caracteristica;
    Comparable valor;

    public CriterioSimple(String caracteristica, Comparable valor) {
        this.caracteristica = caracteristica;
        this.valor = valor;
    }

    @Override
    public abstract boolean cumple(Jaula j); // prodria no estar?????

}
