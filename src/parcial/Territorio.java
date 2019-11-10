package parcial;

import java.util.List;

public abstract class Territorio{
    String nombre;

    public Territorio(String nombre) {
        this.nombre = nombre;
    }

    abstract int getCantHab();
    abstract int getSup();
    abstract int getIng();
    abstract List getComarcasCondicion(Condicion c);

    public String getNombre() {
        return this.nombre;
    }

    public int getIngPerCapita() {
        return getIng()/getCantHab();
    }

    public int getDensidad() {
        return getCantHab()/getSup();
    }

}
