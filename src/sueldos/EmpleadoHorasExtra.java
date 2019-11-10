package sueldos;

public class EmpleadoHorasExtra extends Empleado {

    private int horasExtra;
    private float monto;

    public EmpleadoHorasExtra(float sueldoSem, float monto, int horasExtra) {
        super(sueldoSem);
        setHoraExtra(horasExtra);
        setMonto(monto);
    }

    public void setHoraExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void setMonto(float monto) { this.monto = monto; }



    @Override
    public String getPagoTotal() {
        return "El pago total del empleado es de: $" + (getPagoSem() + (horasExtra * monto));
    }

    @Override
    public String detallePago() {
        return "El sueldo Básico es de: $" + getPagoSem() + " y cobra $" + getTotalPagoHorasE() + " por horas extra";
    }

    public double getTotalPagoHorasE() {
        return horasExtra * monto;
    }
}
