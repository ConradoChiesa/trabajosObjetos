package zoologico.atributos;

public class AtributoSimple implements Atributo {

    Comparable valor;

    public AtributoSimple(Comparable valor) {
        this.valor = valor;
    }

    @Override
    public Comparable getValor() {
        return this.valor;
    }
}
