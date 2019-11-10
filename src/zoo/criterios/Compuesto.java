/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.criterios;

import java.util.ArrayList;
import java.util.List;
import zoo.Animal;
import zoo.Jaula;

/**
 *
 * @author Marcelo
 */
public class Compuesto implements Criterio{
    
    private final List<Criterio> criterios = new ArrayList<Criterio>();
    
    public void addCriterio(Criterio c){
        criterios.add(c);
    }

    @Override
    public boolean cumple(Jaula j) {
        for (Criterio c:criterios){
            if (!c.cumple(j))
                return false;
        }
        return true;
    }
    
    
}
