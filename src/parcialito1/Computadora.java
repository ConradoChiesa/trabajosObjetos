package parcialito1;

public class Computadora {
    private int vel, memo;

    public Computadora(int vel, int memo) {
        setVel(vel);
        setMemo(memo);
    }

    public void ejecutarTarea(Tarea t) {
        if (t.getMemReq() < this.memo)
            t.setEjecutada(true);
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getMemo() {
        return memo;
    }

    public void setMemo(int memo) {
        this.memo = memo;
    }
}
