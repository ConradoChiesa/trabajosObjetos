package sueldos;

public class EmpleadoContrat extends Empleado {
    public EmpleadoContrat(double sueldoSem) {
        super(sueldoSem);
    }

    @Override
    public String getPagoTotal() {
        return "Pago total semanal: $" + (getPagoSem());
    }

    @Override
    public String detallePago() {
        return "Salario semanal: $" + (getPagoSem());
    }
}
