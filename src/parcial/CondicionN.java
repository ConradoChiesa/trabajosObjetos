package parcial;

public class CondicionN implements Condicion {
    Condicion c1;

    public CondicionN(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Territorio t) {
        return !c1.cumple(t);
    }
}
