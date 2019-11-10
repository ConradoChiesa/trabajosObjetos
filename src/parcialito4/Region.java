package parcialito4;

import java.util.ArrayList;
import java.util.List;

public class Region extends RegionGeo {
    private List<RegionGeo> lugares;

    public Region(String n) {
        super(n);
        this.lugares = new ArrayList<>();
    }

    @Override
    int getCantHab() {
        int cantTotal = 0;
        for (RegionGeo r :
                lugares) {
            cantTotal += r.getCantHab();
        }
        return cantTotal;
    }

    @Override
    int getGastos() {
        int gastosTotal = 0;
        for (RegionGeo r :
                lugares) {
            gastosTotal += r.getGastos();
        }
        return gastosTotal;
    }

    @Override
    int getIngresos() {
        int ingresosTotal = 0;
        for (RegionGeo r :
                lugares) {
            ingresosTotal += r.getGastos();
        }
        return ingresosTotal;
    }

    @Override
    List<RegionGeo> getCiudadesDeficit() {
        List<RegionGeo>ciudadDeficit = new ArrayList<>();
        for (RegionGeo r :
                lugares) {
            ciudadDeficit.addAll(r.getCiudadesDeficit());
        }
        return ciudadDeficit;
    }

    public void addCiudad(RegionGeo r) {
        lugares.add(r);
    }
}
