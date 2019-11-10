package recuperatorio2018;

import java.util.Map;

public class Seguro {

    Map<String, Comparable> atributos;

    public Seguro(Integer numPoliza, String tipoPoliza) {
        atributos.put("Numero poliza", numPoliza);
        atributos.put("Tipo Poliza", tipoPoliza);
    }

    public Comparable get(String tp) {
        return atributos.get(tp);
    }
}
