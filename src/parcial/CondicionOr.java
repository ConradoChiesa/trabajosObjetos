package parcial;

public class CondicionOr implements Condicion {
    Condicion c1, c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Territorio t) {
        return c1.cumple(t)||c2.cumple(t);
    }
}
