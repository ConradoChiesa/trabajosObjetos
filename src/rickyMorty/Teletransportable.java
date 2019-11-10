package rickyMorty;

public class Teletransportable implements ComportamientoTeletransportacion {

    @Override
    public void teletransportar(String dim) {
        System.out.println("Teletransportando a dimension: " + dim);
    }
}
