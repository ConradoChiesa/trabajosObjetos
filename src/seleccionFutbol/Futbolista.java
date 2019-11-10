package seleccionFutbol;

import java.util.Date;

public class Futbolista extends Integrante {
    String posicion;
    boolean pieDch;
    int goles;

    public Futbolista(String n, String a, int pas, Date fn, String pos, boolean pie, int g) {
        super(n,a,pas,fn);
        setPosicion(pos);
        setPie(pie);
        setGoles(g);
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPie(boolean pie) {
        this.pieDch = pie;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
