package zoologico;

import zoologico.atributos.Atributo;
import zoologico.atributos.AtributoSimple;
import zoologico.criterios.Criterio;

public class Animal extends ODinamico{

    private Criterio criterio;

    public Animal(String nombre) {
        addAtr(Atributo.NOMBRE, new AtributoSimple(nombre));
        this.criterio = null;
    }

    public boolean puedeHabitar(Jaula j) {
        if (criterio!=null) {
            return criterio.cumple(j);
        } else {
            return true;
        }
    }

    public String getNombre() { return getAtributo(Atributo.NOMBRE).getValor().toString(); }

    public void setCriterio(Criterio c) { this.criterio = c; }

    @Override
    public String toString() {
        return getAtributo(Atributo.NOMBRE).getValor().toString() + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Animal animalComparar = (Animal) obj;
        return this.getNombre().equals(animalComparar.getNombre());
    }
}
