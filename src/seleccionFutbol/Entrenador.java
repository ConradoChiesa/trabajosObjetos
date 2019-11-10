package seleccionFutbol;

import java.util.Date;

public class Entrenador extends Integrante {
    int identificador;

    public Entrenador(String n, String a, int pas, Date fn, int id) {
        super(n, a, pas, fn);
        setIdentificador(id);
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
