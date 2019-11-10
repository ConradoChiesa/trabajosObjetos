package navidad;

import java.util.ArrayList;
import java.util.List;

public class Carta {
    private Ninio remitente;
    private List<String> pedidos;

    public Carta(Ninio remitente, List<String> regalos) {
        this.remitente = remitente;
        this.pedidos = regalos;
    }

    public Ninio getRemitente() {
        return remitente;
    }

    public List<String> getPedidos() {
        return pedidos;
    }

    public void addRegalo(String r) {
        pedidos.add(r);
    }

    public void cambiarRegalos(String r) {
        for (int i = 0; i < pedidos.size(); i++) {
            pedidos.set(i, r);
        }
    }

}
