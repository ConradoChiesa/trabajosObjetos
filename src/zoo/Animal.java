package zoo;
import zoo.atributos.Atributo;
import zoo.atributos.AtributoSimple;
import zoo.criterios.Criterio;
import java.util.HashMap;
import zoo.Jaula;

/**
 *
 * @author Marcelo
 */
public class Animal extends ObjetoDinamico{

    private Criterio criterio;
    
    public Animal(String nombre){
        addAtributo(Atributo.NOMBRE, new AtributoSimple(nombre));
        this.criterio = null;
    }

    
    public boolean puedeHabitar(Jaula j){
        if (criterio!=null)
            return criterio.cumple(j);
        return true; //Si no tiene un criterio, entonces puede habitar cualquier jaula
    }

    public String getNombre(){
        return getAtributo(Atributo.NOMBRE).getValor().toString();
    }

    public void setCriterio(Criterio c){
        this.criterio = c;
    }
    
    @Override
    public String toString(){
        return getAtributo(Atributo.NOMBRE).getValor().toString() + super.toString();
    }

    @Override
    public boolean equals(Object otro){
        Animal otroAnimal = (Animal) otro;
        return this.getNombre().equals(otroAnimal.getNombre());
    }
}
