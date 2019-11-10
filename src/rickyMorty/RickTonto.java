package rickyMorty;

public class RickTonto extends Rick {

    public RickTonto() {
        comportamientoTeletransportacion = new NoTeletransportable();
        comportamientoLlamarMorty = new SinMoty();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy rick Tonto");
    }

}
