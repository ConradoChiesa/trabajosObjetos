package navidad;

import java.util.ArrayList;
import java.util.List;

public class Ninio {
    private int dni;
    private Carta carta;
    private List<String> pedidos;

    public Ninio(int dni) {
        this.dni = dni;
        this.pedidos = new ArrayList<>();
    }

    public void escribirCarta() {
        if (!pedidos.isEmpty())
            this.carta = new Carta(this, new ArrayList<>(pedidos));
        else System.out.println("La lista de pedidos se encuentra vacia");
    }

    public void deposiarCarta(Buzon b) {
        if (carta!=null)
            b.addCarta(carta);
        else System.out.println("Primero debe escribir una carta");
    }

    public void addRegalo(String r) {
        pedidos.add(r);
    }
}
