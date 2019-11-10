package zoo;

import zoo.atributos.Atributo;

import java.util.HashMap;
import java.util.Set;

public class ObjetoDinamico {

    private HashMap<String, Atributo> atributos;

    public ObjetoDinamico(){
        atributos = new HashMap<>();
    }

    public void addAtributo(String nombre, Atributo valor){
        atributos.put(nombre, valor);
    }

    public Atributo getAtributo(String nombre){
        return atributos.get(nombre);
    }

    public Set<String> getAtributosDisponibles(){
        return atributos.keySet();
    }

    @Override
    public String toString(){
        String ret = "";
        for (String atributo:this.getAtributosDisponibles())
            ret += "; " + atributo + ": " + getAtributo(atributo).getValor();
        return ret;
    }

}
