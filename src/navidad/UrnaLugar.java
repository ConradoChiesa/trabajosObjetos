package navidad;

public abstract class UrnaLugar {
    abstract int getCartasConRegalo(String r);
    abstract int getNiniosMalos();
    abstract int getTotalCartas();

    double getPorcentajeCartasConRegalo(String r) {
        return ((double)this.getCartasConRegalo(r)/(double)this.getTotalCartas() )*100;
    }
}
