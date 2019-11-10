package rickyMorty;

public class RickVaquero extends Rick {

    public RickVaquero() {
        comportamientoTeletransportacion = new Teletransportable();
        comportamientoLlamarMorty = new UnMorty();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy Rick Vaquero");
    }
}
