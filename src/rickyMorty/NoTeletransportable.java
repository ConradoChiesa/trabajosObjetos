package rickyMorty;

public class NoTeletransportable implements ComportamientoTeletransportacion {
    @Override
    public void teletransportar(String dim) {
        System.out.println("Imposible teletransportar");
    }
}
