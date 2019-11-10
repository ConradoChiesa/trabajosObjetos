package zoologico.atributos;

public class AtributoCompuesto implements Atributo {
    Atributo a1;
    Atributo a2;


    public AtributoCompuesto(Atributo a1, Atributo a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public Comparable getValor() {
        return a1.getValor() + " " + a2.getValor();
    }
}
