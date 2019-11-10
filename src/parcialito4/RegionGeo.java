package parcialito4;

import java.util.List;

public abstract class RegionGeo {
    String nombre;

    public RegionGeo(String n) {
        this.nombre = n;
    }

    abstract int getCantHab();
    abstract int getGastos();
    abstract int getIngresos();
    abstract List getCiudadesDeficit();
    public boolean isDeficit(){
        return this.getGastos() > this.getIngresos();
    }

}
