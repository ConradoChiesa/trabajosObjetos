package zoo.atributos;

public interface Atributo {

    /**
     * Notar que por defecto los atributos definidos en una interface son public y static
     */
    String NOMBRE = "nombre";
    String NOMBRE_COMPLETO = "nombre completo";
    String TIPO = "tipo";
    String PESO = "peso";
    String ALTO = "alto";
    String ANCHO = "ancho";
    String DIMENSIONES = "dimensiones";
    String TIENE_ARBOL = "tiene arbol";

    public Comparable getValor();
}
