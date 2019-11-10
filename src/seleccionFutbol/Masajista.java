package seleccionFutbol;

import java.util.Date;

public class Masajista extends Integrante {
    String titulo;
    int exp;

    public Masajista(String n, String a, int pas, Date fn, String pos, boolean pie, int g, String t, int e) {
        super(n,a,pas,fn);
        setTitulo(t);
        setExp(e);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
