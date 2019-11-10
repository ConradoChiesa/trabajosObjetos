package parcialito4;
import java.util.List;
public class Simulador {
    public static void main(String[] args) {

        Region buenosAires = new Region("Buenos Aires");
        Region laPampa = new Region("La Pampa");
        Region cordoba = new Region("Cordoba");

        RegionGeo tandil = new Ciudad("Tandil", 120000, 2000000, 3948392);
        RegionGeo azul = new Ciudad("Azul", 140000, 2000000, 3948392);
        RegionGeo santaRosa = new Ciudad("Santa Rosa", 90765, 450000, 790000);

        buenosAires.addCiudad(tandil);
        buenosAires.addCiudad(azul);
        laPampa.addCiudad(santaRosa);

        System.out.println(buenosAires.getCantHab());
        System.out.println(buenosAires.getIngresos());
        System.out.println(tandil.getIngresos());
        printArray(buenosAires.getCiudadesDeficit());



    }
    private static void printArray(List<RegionGeo> arr) {
        for (RegionGeo r :
                arr) {
            System.out.println(r.toString());
        }
    }
}
