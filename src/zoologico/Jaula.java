package zoologico;

import zoologico.atributos.Atributo;
import zoologico.criterios.Criterio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Jaula extends ODinamico {

    List<Jaula> vecinas;
    private int id;

    public Jaula(int id) {
        this.vecinas = new ArrayList<>();
        this.id = id;
    }

    public int getID() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Jaula other = (Jaula) obj;
        return this.id == other.getID();
    }

    @Override
    public String toString() {
        return this.getID()+super.toString();
    }

    public void setVecina(Jaula other) {
        this.vecinas.add(other);
        other.vecinas.add(this);
    }
}
