package parcialito1;

public class Tarea {
    private String nombre;
    private int memReq;
    private boolean ejecutada;

    public Tarea(String nombre, int memReq) {
        setNombre(nombre);
        setMemReq(memReq);
        setEjecutada(false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMemReq() {
        return memReq;
    }

    private void setMemReq(int memReq) {
        this.memReq = memReq;
    }

    public boolean isEjecutada() {
        return ejecutada;
    }

    public void setEjecutada(boolean ejecutada) {
        this.ejecutada = ejecutada;
    }
}
