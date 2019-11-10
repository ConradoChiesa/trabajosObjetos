package parcial;

public class MismoNombre implements Condicion {
    String nombre;

    public MismoNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Territorio t) {
        return t.getNombre().equalsIgnoreCase(nombre);
    }
}
