package parcial;

public class CondMayHab implements Condicion {
    int hab;

    public CondMayHab(int hab) {
        this.hab = hab;
    }

    @Override
    public boolean cumple(Territorio t) {
        return t.getCantHab()>hab;
    }
}
