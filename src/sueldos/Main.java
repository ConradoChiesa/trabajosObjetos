package sueldos;

public class Main {

    public static void main(String[] args) {
        Empleado eComun = new EmpleadoContrat(10000);
        Empleado eComision = new EmpleadoComision(10000, 350000, 2);
        Empleado eHorasExtra1 = new EmpleadoHorasExtra(10000, 500, 7);
        EmpleadoHorasExtra eHorasExtra2 = new EmpleadoHorasExtra(13000, 350, 4);

        System.out.println("Sueldo empleado común: " + eComun.getPagoSem());
        System.out.println("Sueldo empleado común: " + eComun.getPagoTotal());
        System.out.println("Detalle empleado común: " + eComun.detallePago());

        System.out.println("Sueldo empleado Comisión: " + eComision.getPagoSem());
        System.out.println("Sueldo empleado Comisión: " + eComision.getPagoTotal());
        System.out.println("Detalle empleado Comisión: " + eComision.detallePago());

        System.out.println("Sueldo empleado HorasExtra: " + eHorasExtra1.getPagoSem());
        System.out.println("Sueldo empleado HorasExtra: " + eHorasExtra1.getPagoTotal());
        System.out.println("Detalle empleado HorasExtra: " + eHorasExtra1.detallePago());

        System.out.println("Sueldo empleado HorasExtra: " + eHorasExtra2.getPagoSem());
        System.out.println("Sueldo empleado HorasExtra: " + eHorasExtra2.getPagoTotal());
        System.out.println("Detalle empleado HorasExtra: " + eHorasExtra2.detallePago());

    }
}
