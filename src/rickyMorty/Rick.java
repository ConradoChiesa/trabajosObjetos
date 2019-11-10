package rickyMorty;

 abstract class Rick {

    ComportamientoLlamarMorty comportamientoLlamarMorty;
    ComportamientoTeletransportacion comportamientoTeletransportacion;

    public abstract void mostrar();

    public void ejecuarTeletransportar(String dim) {
        comportamientoTeletransportacion.teletransportar(dim);
    }

    public void ejecutarLlamarMorty() {
        comportamientoLlamarMorty.llamarMorty();
    }

    public void setComportamientoLlamarMorty(ComportamientoLlamarMorty clm) {
        this.comportamientoLlamarMorty = clm;
    }

    public void setComportamientoTeletransportacion(ComportamientoTeletransportacion ct) {
        this.comportamientoTeletransportacion = ct;
    }
}
