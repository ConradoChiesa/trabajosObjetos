package sueldos;

public abstract class Empleado {
    private double sueldoSem;

    public Empleado(double sueldoSem) {
        this.sueldoSem = sueldoSem;
    }

    public void setSueldoSem(double sueldoSem) {
        this.sueldoSem = sueldoSem;
    }

    public double getPagoSem() { return sueldoSem; }

    public abstract String getPagoTotal();

    public abstract String detallePago();
}
