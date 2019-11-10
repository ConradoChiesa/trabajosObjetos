/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.criterios;

import zoo.Animal;
import zoo.Jaula;
import zoo.atributos.Atributo;

/**
 *
 * @author Marcelo
 */
public class Menor extends CriterioSimple{
    
    public Menor(String caracteristica, Comparable valor){
        super(caracteristica, valor);
    }
    @Override
    public boolean cumple(Jaula j) {
        Atributo a = j.getAtributo(this.caracteristica);
        if (a!= null)
            return a.getValor().compareTo(valor) < 0;
        return false;
    }
    
}
