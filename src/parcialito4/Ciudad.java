package parcialito4;

import java.util.ArrayList;
import java.util.List;


public class Ciudad extends RegionGeo {
    int cantHab, gastos, ingresos;

    public Ciudad(String n, int cantHab, int gastos, int ingresos) {
        super(n);
        this.cantHab = cantHab;
        this.gastos = gastos;
        this.ingresos = ingresos;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    int getCantHab() {
        return cantHab;
    }

    @Override
    int getGastos() {
        return gastos;
    }

    @Override
    int getIngresos() {
        return ingresos;
    }

    @Override
    List getCiudadesDeficit() {

        ArrayList<RegionGeo> ciudadDeficit = new ArrayList<RegionGeo>();
        if (this.isDeficit())
               ciudadDeficit.add(this);

        return ciudadDeficit;
    }


}
