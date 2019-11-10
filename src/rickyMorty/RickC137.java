package rickyMorty;

public class RickC137 extends Rick {

    public RickC137() {
        comportamientoTeletransportacion = new Teletransportable();
        comportamientoLlamarMorty = new UnMorty();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy Rick C-137");
    }
}
