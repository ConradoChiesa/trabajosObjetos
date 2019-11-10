package sueldos;

public class EmpleadoComision extends Empleado {

    float totalVentas;
    double porcentaje;

    public EmpleadoComision(double sueldo, float totalVentas, double porcentaje) {
        super(sueldo);
        this.totalVentas = totalVentas;
        this.porcentaje = porcentaje;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String getPagoTotal() {
        return "El pago total del empleado es de: $" + (getPagoSem() + calcComision());
    }

    @Override
    public String detallePago() {
        return "El sueldo Básico es de:" + (getPagoSem() + " y una comisión de " + calcComision());
    }

    private double calcComision() {
        return (porcentaje * totalVentas) / 100;
    }
}
