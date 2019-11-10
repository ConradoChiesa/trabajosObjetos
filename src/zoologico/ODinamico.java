package zoologico;

import zoologico.atributos.Atributo;

import java.util.HashMap;
import java.util.Set;

public class ODinamico{
    private HashMap<String, Atributo> atributos;

    public ODinamico() {
        this.atributos = new HashMap<>();
    }

    public void addAtr(String clave, Atributo valor) {
        atributos.put(clave, valor);
    }

    public Atributo getAtributo(String clave) { return atributos.get(clave);}

    public Set<String> getAtributosDisponibles(){
        return atributos.keySet();
    }

    @Override
    public String toString() {
        String ret = "";
        for (String atributo:this.getAtributosDisponibles())
            ret += "; " + atributo + ": " + getAtributo(atributo).getValor();
        return ret;
    }
}
