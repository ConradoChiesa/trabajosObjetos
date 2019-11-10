package parcial;

import java.util.ArrayList;
import java.util.List;

public class Comarca extends Territorio  implements Comparable <Comarca> {
    int hab, sup, ing;

    public Comarca(String nombre, int hab, int sup, int ing) {
        super(nombre);
        this.hab = hab;
        this.sup = sup;
        this.ing = ing;
    }

    public Comarca(String nombre) {
        super(nombre);
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    @Override
    public int getSup() {
        return sup;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }

    @Override
    public int getIng() {
        return ing;
    }

    public void setIng(int ing) {
        this.ing = ing;
    }

    @Override
    int getCantHab() {
        return hab;
    }

    @Override
    public int compareTo(Comarca c) {
        return this.getNombre().compareTo(c.getNombre());
    }

    @Override
    List getComarcasCondicion(Condicion c) {
        List<Comarca> aux = new ArrayList<>();
        if (c.cumple(this))
            aux.add(this);
        return aux;
    }

    @Override
    public String toString() {
        return "Comarca{" +
                "nombre=" + nombre +
                ", hab=" + hab +
                ", sup=" + sup +
                ", ing=" + ing + '\'' +
                '}';
    }
}
