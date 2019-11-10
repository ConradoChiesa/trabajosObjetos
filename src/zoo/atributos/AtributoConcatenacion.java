package zoo.atributos;

public class AtributoConcatenacion implements Atributo{
    private Atributo atributo1;
    private Atributo atributo2;

    public AtributoConcatenacion(Atributo a1, Atributo a2){
        atributo1 = a1;
        atributo2 = a2;
    }

    public Comparable getValor(){
        return atributo1.getValor() + " " + atributo2.getValor();
    }
}
