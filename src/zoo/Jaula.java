package zoo;

import zoo.criterios.Criterio;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Marcelo
 */
public class Jaula extends ObjetoDinamico{

    private ArrayList<Jaula> vecinas;
    private int id;
    
    public Jaula(int id){
        vecinas = new ArrayList<>();
        this.id = id;
    }
    
    public ArrayList<Jaula> getVecinas(){
        return new ArrayList<>(this.vecinas);
    }

    public boolean esVecina(Jaula otraJaula){
        return vecinas.contains(otraJaula);
    }

    public int getID(){
        return id;
    }

    public void setVecina(Jaula otraJaula){
        this.vecinas.add(otraJaula);
        otraJaula.vecinas.add(this);
    }

    @Override
    public String toString(){
        return this.getID()+super.toString();
    }


    @Override
    public boolean equals(Object otra) {
        Jaula otraJaula = (Jaula) otra;
        return this.id == otraJaula.getID() ;
    }

}
