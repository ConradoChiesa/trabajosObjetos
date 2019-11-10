package rickyMorty;

public class RickSimple extends Rick{

    public RickSimple() {
        comportamientoTeletransportacion = new NoTeletransportable();
        comportamientoLlamarMorty = new UnMorty();

    }

    @Override
    public void mostrar() {
        System.out.println("Soy Rick Simple");
    }

}
