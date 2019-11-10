package zoo.criterios;

import zoo.Animal;
import zoo.Jaula;

/**
 *
 * @author Marcelo
 */
public abstract class CriterioSimple implements Criterio {
    protected String caracteristica;
    protected Comparable valor;

    public CriterioSimple(String caracteristica, Comparable valor){

        this.caracteristica = caracteristica;
        this.valor = valor;
    }
    
    public abstract boolean cumple(Jaula j);
}
