package escuela;

public class Sueltos {

    public static int generaNumerRandom(int minimo, int maximo) {
        return (int)Math.floor(Math.random() * (minimo-(maximo+1))+(maximo+1));
    }
}
