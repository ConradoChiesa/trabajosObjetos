package parcial;

public class DensidadMay implements Condicion {
    int dens;

    public DensidadMay(int dens) {
        this.dens = dens;
    }

    @Override
    public boolean cumple(Territorio t) {
        return t.getDensidad()>dens;
    }
}
