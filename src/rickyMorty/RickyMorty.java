package rickyMorty;

public class RickyMorty {
    public static void main(String[] args) {
        Rick rick1 = new RickC137();

        rick1.mostrar();
        rick1.ejecutarLlamarMorty();
        rick1.ejecuarTeletransportar("R-517");

        rick1.setComportamientoLlamarMorty(new SinMoty());
        rick1.setComportamientoTeletransportacion((new NoTeletransportable()));
        rick1.ejecutarLlamarMorty();
        rick1.ejecuarTeletransportar("C-137");
        rick1.setComportamientoTeletransportacion((new Teletransportable()));
        rick1.ejecuarTeletransportar("C-137");
    }
}
